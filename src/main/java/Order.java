package main.java;

public class Order {
    private int order_id;
    private String customer_name;
    private String created_at;
    private String status;

    // Constructor
    public Order(int order_id, String customer_name) {
        this.order_id = order_id;
        this.customer_name = customer_name;
        this.status = "Pending";
        this.created_at = java.time.LocalDateTime.now().toString();
    }

    // Getters
    public int getOrder_id() {
        return order_id;
    }
    public String getCustomer_name() {
        return customer_name;
    }
    public String getCreated_at() {
        return created_at;
    }
    public String getStatus() {
        return status;
    }

    public String getCurrentStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Order[" +
                order_id + "] " + customer_name + " | " + status + " | " + created_at;
    }

    // Setters
    public void setStatus(String status) {
        this.status = status;
    }
}
