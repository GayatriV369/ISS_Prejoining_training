-- Data Insertion Queries
-- File: 02_data_insertion.sql

INSERT INTO Customers (FirstName, LastName, Email, Phone, City, Country)
VALUES 
('Alice', 'Wong', 'alice@example.com', '1234567890', 'New York', 'USA'),
('Bob', 'Kumar', 'bob@example.com', '0987654321', 'Mumbai', 'India'),
('Clara', 'Doe', 'clara@example.com', '5678901234', 'London', 'UK');

INSERT INTO Categories (CategoryName)
VALUES ('Electronics'), ('Clothing'), ('Books');

INSERT INTO Products (ProductName, Price, Stock, CategoryID)
VALUES 
('Laptop', 900.00, 50, 1),
('Headphones', 100.00, 100, 1),
('T-shirt', 25.00, 200, 2),
('Novel', 15.00, 150, 3);

INSERT INTO Orders (CustomerID, OrderDate, Status)
VALUES 
(1, '2024-06-01', 'Shipped'),
(2, '2024-06-03', 'Delivered'),
(1, '2024-06-04', 'Pending');

INSERT INTO OrderDetails (OrderID, ProductID, Quantity, Discount)
VALUES 
(1, 1, 1, 5.00),
(1, 2, 2, 0.00),
(2, 3, 3, 10.00),
(3, 4, 1, 0.00);

INSERT INTO Payments (OrderID, PaymentDate, Amount, Method)
VALUES 
(1, '2024-06-02', 1085.00, 'Credit Card'),
(2, '2024-06-04', 65.00, 'UPI');

-- Additional insertions
INSERT INTO Products (ProductName, Price, Stock, CategoryID)
VALUES ('Smartwatch', 250.00, 40, 1);

INSERT INTO Customers (FirstName, LastName, Email, Phone, City, Country)
VALUES 
('Clara', 'Doe', 'clara@example.com', '5678901234', 'London', 'UK');