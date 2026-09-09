package com.xweb.actor;

import akka.actor.AbstractActor;
import akka.actor.ActorRef;
import akka.event.Logging;
import akka.event.LoggingAdapter;
import akka.japi.pf.ReceiveBuilder;

import java.util.HashMap;
import java.util.Map;

public class EchoActor extends AbstractActor {
    protected final LoggingAdapter log = Logging.getLogger(context().system(), this);

    public final Map<String, Object> map = new HashMap<>();

    private EchoActor() {
        receive(ReceiveBuilder.match(String.class, message -> {
            log.info("Receive Set request:{}", message);
            sender().tell(message, ActorRef.noSender());
        }).matchAny(o -> System.out.println("unknow message :" + o.toString())).build());
    }
}
