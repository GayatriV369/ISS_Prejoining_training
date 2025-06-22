-- Stored Procedures and Advanced Features
-- File: 07_advanced_features.sql

-- Stored Procedure
DELIMITER $$

CREATE PROCEDURE GetTotalSpent(IN custID INT, OUT totalSpent DECIMAL(10,2))
BEGIN
    SELECT SUM(pay.Amount) INTO totalSpent
    FROM Orders o
    JOIN Payments pay ON o.OrderID = pay.OrderID
    WHERE o.CustomerID = custID;
END$$

DELIMITER ;

-- Call stored procedure
CALL GetTotalSpent(1, @total);
SELECT @total;

-- Prepared Statements
SET @sql_text = 'SELECT * FROM Products WHERE CategoryID = 1';

PREPARE stmt_name FROM @sql_text;

EXECUTE stmt_name;

DEALLOCATE PREPARE stmt_name;

-- Create View
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