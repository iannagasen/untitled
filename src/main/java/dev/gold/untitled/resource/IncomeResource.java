package dev.gold.untitled.resource;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dev.gold.untitled.domain.Expense;
import dev.gold.untitled.domain.Income;
import dev.gold.untitled.domain.IncomeService;
import dev.gold.untitled.domain.IncomeType;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/income")
@RequiredArgsConstructor
public class IncomeResource {

  private final IncomeService incomeService;

  @CrossOrigin
  @GetMapping
  public List<Income> getAll() {
    return incomeService.getAll();
  }

  @CrossOrigin
  @GetMapping("/types")
  public List<IncomeType> getAllIncomeType() {
    return incomeService.getAllIncomeType();

  }

  @CrossOrigin
  @GetMapping("/date")
  @Operation(summary = "Retrieve all income records with filtering")
  public List<Income> getAllIncomeByDate(@RequestParam(required = false) String year,
		  								 @RequestParam(required = false) String month,
		  								 @RequestParam(required = false) String day){
	  return incomeService.getAllIncomeByDate(year,month,day);
  }

}
