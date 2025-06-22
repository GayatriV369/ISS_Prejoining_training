-- Table Alteration Queries
-- File: 06_table_alterations.sql

ALTER TABLE Customers
MODIFY FirstName VARCHAR(50) NOT NULL,
MODIFY Email VARCHAR(100) NOT NULL;

ALTER TABLE Products
MODIFY Price DECIMAL(10, 2) NOT NULL;