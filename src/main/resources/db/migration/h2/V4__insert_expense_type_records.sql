INSERT INTO EXPENSE_TYPE (id, name, user_id, created_date)
VALUES
  (NEXT VALUE FOR seq_exp_type_id, 'Transportation', 1001 , '2023-06-01'),
  (NEXT VALUE FOR seq_exp_type_id, 'Meals and Dining', 1002, '2023-06-01');