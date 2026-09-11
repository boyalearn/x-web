package com.xweb.actor;

import akka.actor.AbstractActor;
import akka.actor.ActorRef;
import akka.event.Logging;
import akka.event.LoggingAdapter;
import akka.japi.pf.ReceiveBuilder;
import com.xweb.actor.message.SetRequest;

import java.util.HashMap;
import java.util.Map;

public class DBActor extends AbstractActor {
    protected final LoggingAdapter log = Logging.getLogger(context().system(), this);

    public final Map<String, Object> map = new HashMap<>();

    private DBActor() {
        receive(ReceiveBuilder.match(SetRequest.class, message -> {
            log.info("Receive Set request:{}", message);
            map.put(message.getKey(), message.getValue());
            sender().tell("success", ActorRef.noSender());
        }).matchAny(
                o -> System.out.println("unknow message :" + o.toString())
        ).build());
    }


}
