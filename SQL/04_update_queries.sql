-- Update Operations
-- File: 04_update_queries.sql

SET SQL_SAFE_UPDATES = 0;

UPDATE Products
SET Stock = Stock + 20
WHERE ProductName = 'Laptop';

SET SQL_SAFE_UPDATES = 1;