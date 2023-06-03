package dev.gold.untitled.resource;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.gold.untitled.domain.Income;
import dev.gold.untitled.domain.IncomeService;
import dev.gold.untitled.domain.IncomeType;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/income")
@RequiredArgsConstructor
@Slf4j
public class IncomeResource {

  private final IncomeService incomeService;

  @GetMapping
  public List<Income> getAll() {
    log.info("IncomeResource::getAll");
    return incomeService.getAll();
  }
  
  @GetMapping("/types")
  public List<IncomeType> getAllIncomeType(){
	  return incomeService.getAllIncomeType();
  }

}
