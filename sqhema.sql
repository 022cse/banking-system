CREATE TABLE IF NOT EXISTS customers (
    customer_id TEXT PRIMARY KEY,
    first_name TEXT,
    surname TEXT,
    address TEXT
);

CREATE TABLE IF NOT EXISTS accounts (
    account_no TEXT PRIMARY KEY,
    balance REAL,
    customer_id TEXT,
    FOREIGN KEY (customer_id) REFERENCES customers(customer_id)
);