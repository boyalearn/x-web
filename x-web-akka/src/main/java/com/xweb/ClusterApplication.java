package com.xweb;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import com.xweb.cluster.ClusterController;

public class ClusterApplication {

    public static void main(String[] args) {
        ActorSystem system = ActorSystem.create("Akkademy");
        ActorRef clusterController = system.actorOf(Props.create(ClusterController.class), "clusterController");
    }
}
