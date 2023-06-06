package dev.gold.untitled.resource;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dev.gold.untitled.domain.Expense;
import dev.gold.untitled.domain.ExpenseService;
import dev.gold.untitled.domain.ExpenseType;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/expense")
@RequiredArgsConstructor
@Slf4j
public class ExpenseResource {

  private final ExpenseService expenseService;

  @CrossOrigin
  @GetMapping
  public List<Expense> getAll() {
    return expenseService.getAll();
  }

  @CrossOrigin
  @GetMapping("/types")
  public List<ExpenseType> getAllExpenseType() {
    return expenseService.getAllExpenseType();
  }

  @CrossOrigin
  @GetMapping("/date")
  public List<Expense> getAllExpenseByMonth(@RequestParam(required = false) int year,
      @RequestParam(required = false) int month,
      @RequestParam(required = false) int day) {
    return expenseService.getAllExpenseByMonth(year, month, day);
  }

}
