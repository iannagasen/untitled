create sequence seq_exp_id start with 1000 increment by 1;

CREATE TABLE EXPENSES (
  id INT DEFAULT NEXT VALUE FOR seq_exp_id PRIMARY KEY,
  user_id INT,
  expense_type_id INT,
  amount DECIMAL(10, 2),
  effectivity_date DATE,
  created_date DATE
);