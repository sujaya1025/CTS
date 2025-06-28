BEGIN
  FOR rec IN (SELECT CustomerID, Name FROM Customers WHERE Balance > 10000) LOOP
    UPDATE Customers
    SET IsVIP = 'Y'
    WHERE CustomerID = rec.CustomerID;
    DBMS_OUTPUT.PUT_LINE('Promoted ' || rec.Name || ' to VIP');
  END LOOP;
  COMMIT;
END;
/
