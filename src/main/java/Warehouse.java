package main.java;

import java.util.ArrayList;

public class Warehouse {
    private final ArrayList<Station> stations;
    private final ArrayList<Order> orders;

    public Warehouse() {
        this.stations = new ArrayList<>();
        // Initialize stations with appropriate next statuses
        stations.add(new Station("Picking", "Packing"));
        stations.add(new Station("Packing", "Shipping"));
        stations.add(new Station("Shipping", "Completed"));
        this.orders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void processOrder(Order order) {
        for (Station station : stations) {
            if (order.getStatus().equals("Pending") || 
                station.getName().equals(order.getStatus())) {
                station.processOrder(order);
                return;
            }
        }
        System.out.println("No station found for order " + order.getOrder_id());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Station station : stations) {
            sb.append(station.getName()).append("\n");
        }
        return sb.toString();
    }
}