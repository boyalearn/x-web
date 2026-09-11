package com.test.actor.client;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.management.javadsl.AkkaManagement;
import akka.pattern.Patterns;
import akka.routing.FromConfig;
import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import com.xweb.akka.cluster.actors.ClusterNodeActor;
import com.xweb.akka.cluster.actors.WorkerActor;
import scala.concurrent.Future;

import java.util.concurrent.CompletableFuture;

import static scala.compat.java8.FutureConverters.toJava;

public class ClientNode1 {
    public static void main(String[] args) throws Exception {
        Config config = ConfigFactory
                .parseResources("client1.conf")
                .withFallback(ConfigFactory.load());
        ActorSystem system = ActorSystem.create("cluster", config);
        // 启动管理HTTP接口，可以通过浏览器查看集群状态
        AkkaManagement.get(system).start();
        system.actorOf(Props.create(ClusterNodeActor.class), "node");
        system.actorOf(Props.create(WorkerActor.class), "worker");

        ActorRef workerRouter = system.actorOf(FromConfig.getInstance().props(), "worker-router");
        workerRouter.tell("abc", ActorRef.noSender());
        Future<Object> ask = Patterns.ask(workerRouter, "acf", 1000);
        CompletableFuture<Object> future = (CompletableFuture<Object>) toJava(ask);
        future.thenAccept((msg) -> {
            System.out.println("accpet:" + msg);
        });
    }
}
