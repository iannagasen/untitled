package dev.gold.untitled.resource;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.gold.untitled.domain.Expense;
import dev.gold.untitled.domain.ExpenseService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/expense")
@RequiredArgsConstructor
@Slf4j
public class ExpenseResource {

  private final ExpenseService expenseService;

  @GetMapping
  public List<Expense> getAll() {
    log.info("ExpenseResource::getAll");
    return expenseService.getAll();
  }

}
