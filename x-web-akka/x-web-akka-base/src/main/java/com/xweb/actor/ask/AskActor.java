package com.xweb.actor.ask;

import akka.actor.UntypedActor;

public class AskActor extends UntypedActor {
    @Override
    public void onReceive(Object o) throws Exception {
        if (o instanceof String) {
            System.out.println(o);
        } else {
            unhandled(o);
        }
    }

}
