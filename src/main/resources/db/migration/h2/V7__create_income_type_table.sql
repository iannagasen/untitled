create sequence seq_inc_type_id start with 1 increment by 1;

CREATE TABLE INCOME_TYPE (
  id INT DEFAULT NEXT VALUE FOR seq_inc_type_id PRIMARY KEY,
  name VARCHAR(100)
);