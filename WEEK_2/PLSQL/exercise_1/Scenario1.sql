BEGIN
  FOR rec IN (SELECT CustomerID FROM Customers WHERE Age > 60) LOOP
    UPDATE Customers
    SET LoanInterestRate = LoanInterestRate - 1
    WHERE CustomerID = rec.CustomerID;
  END LOOP;
  COMMIT;
END;

SELECT Name, Age, LoanInterestRate FROM Customers;
