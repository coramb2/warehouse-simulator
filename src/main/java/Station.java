package main.java;

public class Station implements Processable {
    private final String name;
    private final String nextStatus;

    public Station(String name, String nextStatus) {
        this.name = name;
        this.nextStatus = nextStatus;
    }

    public String getName() { 
        return name; }
    public String getNextStatus() { 
        return nextStatus; }

    @Override
    public void processOrder(Order order) {
        order.setStatus(nextStatus);
        System.out.println("Station " + name + " processed Order " + order.getOrder_id() + " -> " + nextStatus);
    }

    @Override
    public String toString() {
        return "Station[" + name + "] -> " + nextStatus;
    }
}