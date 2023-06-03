INSERT INTO EXPENSES (id, user_id, expense_type_id, amount, effectivity_date, created_date)
VALUES
  (NEXT VALUE FOR seq_exp_id, 1, 1, 100.00, '2023-06-01', '2023-06-02'),
  (NEXT VALUE FOR seq_exp_id, 2, 2, 50.00, '2023-06-01', '2023-06-02');