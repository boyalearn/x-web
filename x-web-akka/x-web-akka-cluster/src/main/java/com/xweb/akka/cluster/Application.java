package com.xweb.akka.cluster;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.management.javadsl.AkkaManagement;
import akka.routing.FromConfig;
import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import com.xweb.akka.cluster.actors.ClusterNodeActor;
import com.xweb.akka.cluster.actors.WorkerActor;

public class Application {

    public static void main(String[] args) {
        Config config = ConfigFactory
                .parseResources("cluster.conf")
                .withFallback(ConfigFactory.load());
        ActorSystem system = ActorSystem.create("cluster", config);
        // 启动管理HTTP接口，可以通过浏览器查看集群状态
        AkkaManagement.get(system).start();
        system.actorOf(Props.create(ClusterNodeActor.class), "node");
        system.actorOf(Props.create(WorkerActor.class), "worker");

        ActorRef workerRouter = system.actorOf(FromConfig.getInstance().props(), "worker-router");

    }
}
