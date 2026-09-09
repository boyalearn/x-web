package com.test.actor.cluster;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.contrib.pattern.ClusterReceptionistExtension;
import akka.routing.BalancingPool;
import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import com.xweb.actor.EchoActor;
import com.xweb.cluster.ClusterController;

public class Node1 {
    public static void main(String[] args) {
        Config config = ConfigFactory
                .parseResources("application1.conf")
                .withFallback(ConfigFactory.load());
        ActorSystem system = ActorSystem.create("Akkademy",config);
        system.actorOf(Props.create(ClusterController.class), "clusterController");
        ActorRef workers = system.actorOf(new BalancingPool(5).props(Props.create(EchoActor.class)), "workers");
        ((ClusterReceptionistExtension) ClusterReceptionistExtension.apply(system)).registerService(workers);
    }
}
