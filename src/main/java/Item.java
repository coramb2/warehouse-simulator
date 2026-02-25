package main.java;

public class Item {
    private int item_id;
    private int order_id;
    private String sku;
    private int quantity;
    private double price;
    private String location;

    // Constructor
    public Item(int item_id, int order_id, String sku, int quantity, double price, String location) {
        this.item_id = item_id;
        this.order_id = order_id;
        this.sku = sku;
        this.quantity = quantity;
        this.price = price;
        this.location = location;
    }

    // Getters
    public int getItem_id() {
        return item_id; }
    public int getOrder_id() {
        return order_id; }
    public String getSku() {
        return sku; }
    public int getQuantity() {
        return quantity; }
    public double getPrice() {
        return price; }
    public String getLocation() {
        return location; }

    @Override
    public String toString() {
        return "Item[" + item_id + "] SKU: " + sku + " | Qty: " + quantity + " | Price: $" + price + " | Location: " + location;
    }


}