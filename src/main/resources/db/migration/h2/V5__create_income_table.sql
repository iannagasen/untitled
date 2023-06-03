create sequence seq_inc_id start with 1000 increment by 1;

CREATE TABLE INCOME (
  id INT DEFAULT NEXT VALUE FOR seq_inc_id PRIMARY KEY,
  user_id INT,
  income_type_id INT,
  created_date DATE,
  amount DECIMAL(10, 2)
);