package com.xweb.actor.circuit;

import akka.actor.UntypedActor;
import akka.pattern.CircuitBreaker;
import scala.concurrent.duration.Duration;

import java.util.concurrent.Callable;

public class CircuitBreakerActor extends UntypedActor {
    @Override
    public void onReceive(Object o) throws Exception {

    }

    class WorkerActor extends UntypedActor {

        private CircuitBreaker breaker;

        @Override
        public void preStart() throws Exception {
            super.preStart();
            this.breaker = new CircuitBreaker(getContext().dispatcher(), getContext().system().scheduler(), 5,
                    Duration.create(2, "s"), Duration.create(1, "min"))
                    .onOpen(() -> {
                    })
                    .onHalfOpen(() -> {
                    }).onClose(() -> {
                    });
        }

        @Override
        public void onReceive(Object message) throws Exception {
            if(message instanceof String){
                String msg = (String) message;
                if(msg.startsWith("sync")){
                    getSender().tell(breaker.callWithSyncCircuitBreaker(new Callable<String>() {
                        @Override
                        public String call() throws Exception {
                            return msg;
                        }
                    }),getSelf());
                }
            }
        }
    }
}
