package com.xweb.akka.cluster.actors;

import akka.actor.ActorRef;
import akka.actor.UntypedAbstractActor;

public class WorkerActor extends UntypedAbstractActor {
    @Override
    public void onReceive(Object message) throws Throwable {
        if (message instanceof String) {
            sender().tell(message, ActorRef.noSender());
        }
    }
}
