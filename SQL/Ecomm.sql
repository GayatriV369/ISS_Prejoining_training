CREATE DATABASE EcommerceDB;
USE EcommerceDB;

CREATE TABLE Customers (
    CustomerID INT PRIMARY KEY AUTO_INCREMENT,
    FirstName VARCHAR(50),
    LastName VARCHAR(50),
    Email VARCHAR(100) UNIQUE,
    Phone VARCHAR(15),
    City VARCHAR(50),
    Country VARCHAR(50)
);

CREATE TABLE Categories (
    CategoryID INT PRIMARY KEY AUTO_INCREMENT,
    CategoryName VARCHAR(50) NOT NULL
);

CREATE TABLE Products (
    ProductID INT PRIMARY KEY AUTO_INCREMENT,
    ProductName VARCHAR(100),
    Price DECIMAL(10, 2),
    Stock INT,
    CategoryID INT,
    FOREIGN KEY (CategoryID) REFERENCES Categories(CategoryID)
);

CREATE TABLE Orders (
    OrderID INT PRIMARY KEY AUTO_INCREMENT,
    CustomerID INT,
    OrderDate DATE,
    Status VARCHAR(20),
    FOREIGN KEY (CustomerID) REFERENCES Customers(CustomerID)
);

CREATE TABLE OrderDetails (
    OrderDetailID INT PRIMARY KEY AUTO_INCREMENT,
    OrderID INT,
    ProductID INT,
    Quantity INT,
    Discount DECIMAL(5,2),
    FOREIGN KEY (OrderID) REFERENCES Orders(OrderID),
    FOREIGN KEY (ProductID) REFERENCES Products(ProductID)
);

CREATE TABLE Payments (
    PaymentID INT PRIMARY KEY AUTO_INCREMENT,
    OrderID INT,
    PaymentDate DATE,
    Amount DECIMAL(10, 2),
    Method VARCHAR(20),
    FOREIGN KEY (OrderID) REFERENCES Orders(OrderID)
);

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

SELECT * FROM Customers;

SELECT FirstName, LastName, Email FROM Customers;

DESCRIBE Products;

SELECT ProductName, Price FROM Products WHERE Price > 100;

#Aggregate functions
SELECT COUNT(*) AS TotalCustomers FROM Customers;

SELECT AVG(Price) AS AveragePrice FROM Products;

SELECT SUM(Price * Stock) AS TotalInventoryValue FROM Products;

#Join queries
SELECT 
    Orders.OrderID, 
    Orders.OrderDate, 
    Customers.FirstName, 
    Customers.LastName, 
    Orders.Status
FROM Orders
JOIN Customers ON Orders.CustomerID = Customers.CustomerID;

SELECT 
    OrderDetails.OrderID, 
    Products.ProductName, 
    OrderDetails.Quantity, 
    OrderDetails.Discount
FROM OrderDetails
JOIN Products ON OrderDetails.ProductID = Products.ProductID;

SELECT 
    o.OrderID,
    c.FirstName,
    p.ProductName,
    od.Quantity,
    pay.Amount,
    pay.Method
FROM Orders o
JOIN Customers c ON o.CustomerID = c.CustomerID
JOIN OrderDetails od ON o.OrderID = od.OrderID
JOIN Products p ON od.ProductID = p.ProductID
LEFT JOIN Payments pay ON o.OrderID = pay.OrderID;

SELECT 
    c.FirstName, 
    c.LastName, 
    SUM(pay.Amount) AS TotalSpent
FROM Customers c
JOIN Orders o ON c.CustomerID = o.CustomerID
JOIN Payments pay ON o.OrderID = pay.OrderID
GROUP BY c.CustomerID;

SELECT 
    cat.CategoryName, 
    COUNT(p.ProductID) AS ProductCount
FROM Categories cat
LEFT JOIN Products p ON cat.CategoryID = p.CategoryID
GROUP BY cat.CategoryID;

SELECT * FROM OrderDetails WHERE Discount > 0;

SELECT ProductName, Price FROM Products ORDER BY Price DESC;

INSERT INTO Products (ProductName, Price, Stock, CategoryID)
VALUES ('Smartwatch', 250.00, 40, 1);

SET SQL_SAFE_UPDATES = 0;

UPDATE Products
SET Stock = Stock + 20
WHERE ProductName = 'Laptop';

SET SQL_SAFE_UPDATES = 1;

DELETE FROM Customers
WHERE Email = 'clara@example.com';

SELECT *FROM Customers;

INSERT INTO Customers (FirstName, LastName, Email, Phone, City, Country)
VALUES 
('Clara', 'Doe', 'clara@example.com', '5678901234', 'London', 'UK');

SELECT o.OrderID, c.FirstName, p.ProductName
FROM Orders o
INNER JOIN Customers c ON o.CustomerID = c.CustomerID
INNER JOIN OrderDetails od ON o.OrderID = od.OrderID
INNER JOIN Products p ON od.ProductID = p.ProductID;

SELECT c.FirstName, o.OrderID, pay.Amount
FROM Customers c
LEFT JOIN Orders o ON c.CustomerID = o.CustomerID
LEFT JOIN Payments pay ON o.OrderID = pay.OrderID;

SELECT cat.CategoryName, p.ProductName
FROM Products p
RIGHT JOIN Categories cat ON p.CategoryID = cat.CategoryID;

SELECT c.FirstName, o.OrderID
FROM Customers c
LEFT JOIN Orders o ON c.CustomerID = o.CustomerID

UNION

SELECT c.FirstName, o.OrderID
FROM Customers c
RIGHT JOIN Orders o ON c.CustomerID = o.CustomerID;

SELECT 
    c.FirstName AS Name, 
    o.OrderDate AS PurchaseDate, 
    p.ProductName AS Item
FROM Customers c
JOIN Orders o ON c.CustomerID = o.CustomerID
JOIN OrderDetails od ON o.OrderID = od.OrderID
JOIN Products p ON od.ProductID = p.ProductID;


SELECT * FROM Customers
WHERE Email LIKE '%@example.com';

SELECT * FROM Customers
WHERE FirstName LIKE 'A_ice';


SELECT 
    c.FirstName AS Customer,
    p.ProductName AS Product,
    od.Quantity,
    pay.Method AS PaymentMethod
FROM Customers c
JOIN Orders o ON c.CustomerID = o.CustomerID
JOIN OrderDetails od ON o.OrderID = od.OrderID
JOIN Products p ON od.ProductID = p.ProductID
LEFT JOIN Payments pay ON o.OrderID = pay.OrderID
WHERE c.FirstName LIKE 'A%';


-- Select top 3 most expensive products
SELECT ProductName, Price
FROM Products
ORDER BY Price DESC
LIMIT 3;

SELECT CategoryID, COUNT(ProductID) AS ProductCount
FROM Products
GROUP BY CategoryID
HAVING COUNT(ProductID) > 1;

SELECT c.CategoryName, COUNT(p.ProductID) AS ProductCount
FROM Categories c
LEFT JOIN Products p ON c.CategoryID = p.CategoryID
GROUP BY c.CategoryName
HAVING COUNT(p.ProductID) > 1;

ALTER TABLE Customers
MODIFY FirstName VARCHAR(50) NOT NULL,
MODIFY Email VARCHAR(100) NOT NULL;

ALTER TABLE Products
MODIFY Price DECIMAL(10, 2) NOT NULL;


DELIMITER $$

CREATE PROCEDURE GetTotalSpent(IN custID INT, OUT totalSpent DECIMAL(10,2))
BEGIN
    SELECT SUM(pay.Amount) INTO totalSpent
    FROM Orders o
    JOIN Payments pay ON o.OrderID = pay.OrderID
    WHERE o.CustomerID = custID;
END$$

DELIMITER ;

CALL GetTotalSpent(1, @total);
SELECT @total;


SET @sql_text = 'SELECT * FROM Products WHERE CategoryID = 1';

PREPARE stmt_name FROM @sql_text;

EXECUTE stmt_name;

DEALLOCATE PREPARE stmt_name;

CREATE VIEW CustomerTotalSpent AS
SELECT 
    c.CustomerID,
    c.FirstName,
    c.LastName,
    IFNULL(SUM(p.Amount), 0) AS TotalSpent
FROM Customers c
LEFT JOIN Orders o ON c.CustomerID = o.CustomerID
LEFT JOIN Payments p ON o.OrderID = p.OrderID
GROUP BY c.CustomerID;

SELECT * FROM CustomerTotalSpent;
