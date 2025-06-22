-- Select and Query Operations
-- File: 03_select_queries.sql

-- Basic SELECT queries
SELECT * FROM Customers;

SELECT FirstName, LastName, Email FROM Customers;

DESCRIBE Products;

SELECT ProductName, Price FROM Products WHERE Price > 100;

-- Aggregate functions
SELECT COUNT(*) AS TotalCustomers FROM Customers;

SELECT AVG(Price) AS AveragePrice FROM Products;

SELECT SUM(Price * Stock) AS TotalInventoryValue FROM Products;

-- Join queries
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

-- Different types of JOINs
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

-- Pattern matching with LIKE
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

-- LIMIT and HAVING clauses
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

SELECT *FROM Customers;

-- View queries
SELECT * FROM CustomerTotalSpent;