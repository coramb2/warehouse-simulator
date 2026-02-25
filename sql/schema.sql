CREATE TABLE Orders (
    order_id INTEGER PRIMARY KEY,
    customer_name TEXT,
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP,
    status TEXT
);

CREATE TABLE Items (
    item_id INTEGER PRIMARY KEY,
    order_id INTEGER,
    sku TEXT,
    quantity INTEGER,
    location TEXT,
    price REAL,
    FOREIGN KEY (order_id) REFERENCES Orders(order_id)
);