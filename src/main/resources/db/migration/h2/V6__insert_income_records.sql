INSERT INTO INCOME (user_id, income_type_id, created_date, amount)
VALUES
  (NEXT VALUE FOR seq_inc_id, 1, '2023-06-01', 1000.00),
  (NEXT VALUE FOR seq_inc_id, 2, '2023-06-02', 1500.50),
  (NEXT VALUE FOR seq_inc_id, 3, '2023-06-02', 800.25),
  (NEXT VALUE FOR seq_inc_id, 4, '2023-06-03', 1200.75);