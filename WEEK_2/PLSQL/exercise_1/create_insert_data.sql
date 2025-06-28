CREATE TABLE Customers (
    CustomerID NUMBER PRIMARY KEY,
    Name VARCHAR2(100),
    Age NUMBER,
    Balance NUMBER(10, 2),
    IsVIP CHAR(1),
    LoanInterestRate NUMBER(5, 2),
    LoanDueDate DATE
);
INSERT INTO Customers VALUES (1, 'John Doe', 65, 12000, 'N', 9.5, SYSDATE + 10);
INSERT INTO Customers VALUES (2, 'Jane Smith', 45, 9500, 'N', 10.0, SYSDATE + 40);
INSERT INTO Customers VALUES (3, 'Alice Brown', 70, 20000, 'N', 8.5, SYSDATE + 5);
INSERT INTO Customers VALUES (4, 'Bob White', 30, 8000, 'N', 11.0, SYSDATE + 25);
COMMIT;

-- 3. See the data
SELECT * FROM Customers;