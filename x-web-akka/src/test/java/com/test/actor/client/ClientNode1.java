package com.test.actor.client;

import akka.actor.ActorRef;
import akka.actor.ActorSelection;
import akka.actor.ActorSystem;
import akka.contrib.pattern.ClusterClient;
import akka.pattern.Patterns;
import akka.util.Timeout;
import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import scala.concurrent.Await;
import scala.concurrent.Future;

import java.util.HashSet;
import java.util.Set;

public class ClientNode1 {
    public static void main(String[] args) throws Exception {

        Config config = ConfigFactory
                .parseResources("client1.conf")
                .withFallback(ConfigFactory.load());
        ActorSystem system = ActorSystem.create("clientSystem", config);
        Set<ActorSelection> initialContacts = new HashSet<>();
        initialContacts.add(system.actorSelection("akka.tcp://Akkademy@127.0.0.1:2551/user/receptionist"));
        initialContacts.add(system.actorSelection("akka.tcp://Akkademy@127.0.0.1:2552/user/receptionist"));

        ActorRef receptionist = system.actorOf(ClusterClient.defaultProps(initialContacts));
        ClusterClient.Send msg = new ClusterClient.Send("/user/workers", "aabb", false);

        Timeout timeout = new Timeout(5000);
        Future<Object> ask = Patterns.ask(receptionist, msg, timeout);
        Object result = Await.result(ask, timeout.duration());
        System.out.println("result:" + result);


        ClusterClient.SendToAll sendAll = new ClusterClient.SendToAll("/user/workers", "ccfs");
        System.out.println("result:" + Await.result(Patterns.ask(receptionist, sendAll, timeout), timeout.duration()));

    }
}
