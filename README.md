V3__create_expenses_type_table.sql# Expense Tracking System:

@Authors:

- Agasen, Ian Neil
- Agulto, Ajay

### Usage:

UI:

1. Per Day
   1. CRUD expenses at any day
   2. CRUD allocated budget(income) per day
2. Input (CRUD) expense category

Savings(Goal) = Income - Expenses

### Limitations

1.  Can only add expense for current day

### Entities

1. Expenses
2. Expense Type
3. Income - Income per month
4. Income Type:
   1. Values:
      1. Q - quarterly
      2. A
      3. M
      4. S

### Tables:

```mermaid
erDiagram
   EXPENSES ||--|| EXPENSE_TYPE : has
   EXPENSES {
      int id PK
      int user_id FK
      int expense_type_id FK
      big_decimal amount
      date effectivity_date
      date created_date
   }

   EXPENSE_TYPE {
      int id PK
      string name
      int user_id FK
      date created_date
   }

   INCOME ||--|| INCOME_TYPE : has
   INCOME {
      int id PK
      int user_id FK
      int income_type_id FK
      date created_date
      big_decimal amount
   }

   INCOME_TYPE {
      int id PK
      string name
   }
```

### PACKAGE STRUCTURE

1. Resource
   - Controller
2. Domain
   - Model
   - Service
   - Repository

### Accessing H2 Embeded:

URL: http://localhost:8080/h2-console/login.jsp?jsessionid=e1e30c3eea07f8f8aca15f9a7938e3cf

### Endpoints:

- /expenses:
  - GET - get all expenses
