package dev.gold.untitled.domain;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
public class ExpenseService {

  private final ExpenseRepository expenseRepository;
  private final ExpenseTypeRepository expenseTypeRepository;

  public List<Expense> getAll() {
    return expenseRepository.findAll();
  }

  public List<ExpenseType> getAllExpenseType() {
    return expenseTypeRepository.findAll();
  }

  public List<Expense> getAllExpenseByMonth(int year, int month, int day) {
    return expenseRepository.findByMonth(year, month, day);
  }
}
