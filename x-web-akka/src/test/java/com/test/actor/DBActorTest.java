package com.test.actor;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.testkit.TestActorRef;
import com.xweb.actor.DBActor;
import com.xweb.actor.message.SetRequest;
import org.junit.jupiter.api.Test;
import scala.concurrent.Future;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

import static akka.pattern.Patterns.ask;
import static scala.compat.java8.FutureConverters.toJava;

public class DBActorTest {
    ActorSystem system = ActorSystem.create("Akkademy");

    @Test
    public void test000000000001() {
        TestActorRef<DBActor> actorRef = TestActorRef.create(system, Props.create(DBActor.class));
        actorRef.tell(new SetRequest("AA", "BB"), ActorRef.noSender());

        DBActor dbActor = actorRef.underlyingActor();
        System.out.println(dbActor.map.get("AA"));
        Future<Object> ask = ask(actorRef, new SetRequest("aa", "bb"), 1000L);
        CompletionStage<Object> future = toJava(ask);
        CompletableFuture<Object> completableFuture = (CompletableFuture<Object>) future;
        completableFuture.thenAccept(message -> {
            System.out.println("response :" + message);
        });
        completableFuture.handle((x, t) -> {
            System.out.println("handle:" + x);
            return null;
        });
        completableFuture.exceptionally(message -> {
            System.out.println("exceptionally" + message);
            return message;
        });
    }
}
