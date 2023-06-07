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
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/expense")
@RequiredArgsConstructor
@Slf4j
public class ExpenseResource {

  private final ExpenseService expenseService;

//  @CrossOrigin
//  @GetMapping
//  @Operation(summary = "Retrieve all expenses records")
//  public List<Expense> get1All() {
//    log.info("ExpenseResource::getAll");
//    return expenseService.getAll();
//  }
  
  @CrossOrigin
  @GetMapping("/types")
  @Operation(summary = "Retrieve all expense type records")
  public List<ExpenseType> getAllExpenseType(){
	  return expenseService.getAllExpenseType();
  }

  @CrossOrigin
  @GetMapping("/date")
  @Operation(summary = "Retrieve all expenses record with filtering")
  public List<Expense> getAllExpenseByDate(@RequestParam(required = false) String year,
		  									@RequestParam(required = false) String month,
		  									@RequestParam(required = false) String day){
	  return expenseService.getAllExpenseByDate(year,month,day);
  }
  
}
