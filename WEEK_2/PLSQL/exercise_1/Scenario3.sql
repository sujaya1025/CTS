BEGIN
  FOR rec IN (
    SELECT Name, LoanDueDate
    FROM Customers
    WHERE LoanDueDate BETWEEN SYSDATE AND SYSDATE + 30
  ) LOOP
    DBMS_OUTPUT.PUT_LINE('Reminder: Loan due for ' || rec.Name || ' on ' || TO_CHAR(rec.LoanDueDate, 'DD-Mon-YYYY'));
  END LOOP;
END;

