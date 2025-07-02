package Java_Design_Patterns;

import java.util.*;

interface Observer {
    void update(String message);
}

class Subscriber implements Observer {
    private String name;
    public Subscriber(String name) { this.name = name; }

    public void update(String message) {
        System.out.println(name + " received: " + message);
    }
}

class Channel {
    private List<Observer> observers = new ArrayList<>();

    public void subscribe(Observer o) { observers.add(o); }
    public void notifySubscribers(String msg) {
        for (Observer o : observers) {
            o.update(msg);
        }
    }
}

public class Observer_Pattern {
    public static void main(String[] args) {
        Channel channel = new Channel();
        Subscriber s1 = new Subscriber("Alice");
        Subscriber s2 = new Subscriber("Bob");

        channel.subscribe(s1);
        channel.subscribe(s2);

        channel.notifySubscribers("New video uploaded!");
    }
}
