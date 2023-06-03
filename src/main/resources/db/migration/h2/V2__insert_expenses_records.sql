INSERT INTO EXPENSES (id, user_id, expense_type_id, amount, effectivity_date, created_date)
VALUES
  (NEXT VALUE FOR seq_exp_id, 1, 1, 100.00, '2023-06-01', '2023-06-02'),
  (NEXT VALUE FOR seq_exp_id, 2, 2, 50.00, '2023-06-02', '2023-06-02'),
  (NEXT VALUE FOR seq_exp_id, 1, 2, 150.00, '2023-06-01', '2023-06-01'),
  (NEXT VALUE FOR seq_exp_id, 1, 3, 450.00, '2023-06-01', '2023-06-01'),
  (NEXT VALUE FOR seq_exp_id, 1, 4, 300.00, '2023-06-02', '2023-06-02');