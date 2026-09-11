package com.xweb.akka.cluster.actors;

import akka.actor.AbstractActor;
import akka.cluster.Cluster;
import akka.cluster.ClusterEvent;
import akka.event.Logging;
import akka.event.LoggingAdapter;
import akka.japi.pf.ReceiveBuilder;

import static akka.cluster.ClusterEvent.initialStateAsEvents;

public class ClusterNodeActor extends AbstractActor {

    protected final LoggingAdapter log = Logging.getLogger(context().system(), this);

    Cluster cluster = Cluster.get(getContext().system());


    @Override
    public void preStart() throws Exception {
        super.preStart();
        cluster.subscribe(self(), initialStateAsEvents(), ClusterEvent.MemberEvent.class, ClusterEvent.UnreachableMember.class);
    }

    @Override
    public void postStop() throws Exception {
        super.postStop();
        cluster.unsubscribe(self());
    }

    @Override
    public Receive createReceive() {
        return ReceiveBuilder.create().match(ClusterEvent.MemberEvent.class, memberEvent -> {
                    log.info("MemberEvent:{}", memberEvent);
                }).match(ClusterEvent.UnreachableMember.class, unreachableMember -> {
                    log.info("UnreachableMember:{}", unreachableMember);
                })
                .build();
    }
}
