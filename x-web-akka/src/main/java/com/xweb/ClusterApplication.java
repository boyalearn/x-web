package com.xweb;

import akka.actor.ActorSystem;
import akka.actor.Props;
import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import com.xweb.cluster.ClusterController;

public class ClusterApplication {

    public static void main(String[] args) {
        Config config = ConfigFactory
                .parseResources("application1.conf")
                .withFallback(ConfigFactory.load());
        ActorSystem system = ActorSystem.create("Akkademy", config);
        system.actorOf(Props.create(ClusterController.class), "clusterController");
    }
}
