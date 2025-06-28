delete table SavingsAccounts;

CREATE TABLE SavingsAccounts (
    AccountID NUMBER PRIMARY KEY,
    CustomerID NUMBER,
    Balance NUMBER(10, 2)
);

INSERT INTO SavingsAccounts VALUES (101, 1, 10000);
INSERT INTO SavingsAccounts VALUES (102, 2, 20000);
INSERT INTO SavingsAccounts VALUES (103, 3, 15000);
COMMIT;

CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
BEGIN
  FOR rec IN (SELECT AccountID, Balance FROM SavingsAccounts) LOOP
    UPDATE SavingsAccounts
    SET Balance = Balance + (Balance * 0.01)
    WHERE AccountID = rec.AccountID;
  END LOOP;
  COMMIT;
END;
/

BEGIN
  ProcessMonthlyInterest;
END;
/


DELETE FROM ACCOUNTS
WHERE
        ACCOUNTID = :ACCOUNTID
    AND CUSTOMERID = :CUSTOMERID
    AND BALANCE = :BALANCE;

DELETE FROM ACCOUNTS
WHERE
        ACCOUNTID = :ACCOUNTID
    AND CUSTOMERID = :CUSTOMERID
    AND BALANCE = :BALANCE;

DELETE FROM ACCOUNTS
WHERE
        ACCOUNTID = :ACCOUNTID
    AND CUSTOMERID = :CUSTOMERID
    AND BALANCE = :BALANCE;

SELECT * FROM SavingsAccounts;

CREATE TABLE Employees (
    EmployeeID NUMBER PRIMARY KEY,
    Name VARCHAR2(100),
    Department VARCHAR2(50),
    Salary NUMBER(10, 2)
);

INSERT INTO Employees VALUES (1, 'Alice', 'Sales', 50000);
INSERT INTO Employees VALUES (2, 'Bob', 'HR', 60000);
INSERT INTO Employees VALUES (3, 'Charlie', 'Sales', 55000);
INSERT INTO Employees VALUES (4, 'David', 'IT', 70000);
COMMIT;

CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus (
  dept IN VARCHAR2,
  bonus_percent IN NUMBER
) IS
BEGIN
  UPDATE Employees
  SET Salary = Salary + (Salary * bonus_percent / 100)
  WHERE Department = dept;
  
  COMMIT;
END;
/

BEGIN
  UpdateEmployeeBonus('Sales', 10);
END;
/

SELECT * FROM Employees;


INSERT INTO Accounts VALUES (201, 1, 15000);
INSERT INTO Accounts VALUES (202, 2, 10000);
INSERT INTO Accounts VALUES (203, 3, 5000);
COMMIT;

CREATE OR REPLACE PROCEDURE TransferFunds (
  from_account IN NUMBER,
  to_account IN NUMBER,
  amount IN NUMBER
) IS
  insufficient_funds EXCEPTION;
  from_balance NUMBER;
BEGIN
  SELECT Balance INTO from_balance FROM Accounts WHERE AccountID = from_account;

  IF from_balance < amount THEN
    RAISE insufficient_funds;
  END IF;

  UPDATE Accounts
  SET Balance = Balance - amount
  WHERE AccountID = from_account;

  UPDATE Accounts
  SET Balance = Balance + amount
  WHERE AccountID = to_account;

  COMMIT;

EXCEPTION
  WHEN insufficient_funds THEN
    DBMS_OUTPUT.PUT_LINE('Transfer failed: insufficient balance.');
  WHEN NO_DATA_FOUND THEN
    DBMS_OUTPUT.PUT_LINE('Transfer failed: account not found.');
END;
/

BEGIN
  TransferFunds(201, 202, 2000);
END;
/

SELECT* FROM Accounts;