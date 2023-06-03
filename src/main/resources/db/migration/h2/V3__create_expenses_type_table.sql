create sequence seq_exp_type_id start with 1 increment by 1;

CREATE TABLE EXPENSE_TYPE (
  id INT DEFAULT NEXT VALUE FOR seq_exp_type_id PRIMARY KEY,
  name VARCHAR(100),
  user_id int,
  created_date DATE
);