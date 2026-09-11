package com.test.actor.cluster;

import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.management.javadsl.AkkaManagement;
import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import com.xweb.akka.cluster.actors.ClusterNodeActor;
import com.xweb.akka.cluster.actors.WorkerActor;

public class Node2 {
    public static void main(String[] args) {
        Config config = ConfigFactory
                .parseResources("application2.conf")
                .withFallback(ConfigFactory.load());
        ActorSystem system = ActorSystem.create("cluster", config);
        // 启动管理HTTP接口，可以通过浏览器查看集群状态
        //AkkaManagement.get(system).start();
        system.actorOf(Props.create(ClusterNodeActor.class), "node");
        system.actorOf(Props.create(WorkerActor.class), "worker");

    }
}
