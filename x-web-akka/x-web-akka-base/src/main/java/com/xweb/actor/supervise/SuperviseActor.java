package com.xweb.actor.supervise;

import akka.actor.OneForOneStrategy;
import akka.actor.SupervisorStrategy;
import akka.actor.UntypedActor;
import akka.japi.pf.DeciderBuilder;
import scala.concurrent.duration.Duration;

import java.util.concurrent.BrokenBarrierException;

public class SuperviseActor extends UntypedActor {
    @Override
    public void onReceive(Object o) throws Exception {
        if (o instanceof String) {
            System.out.println(o);
        } else {
            unhandled(o);
        }
    }

    /**
     * 定义监督策略
     *
     * @return
     */
    @Override
    public SupervisorStrategy supervisorStrategy() {
        return new OneForOneStrategy(5, Duration.create("1 minute"),
                DeciderBuilder.match(BrokenBarrierException.class, e -> SupervisorStrategy.restart())
                        .matchAny(e -> SupervisorStrategy.escalate())
                        .build()
        );
    }
}
