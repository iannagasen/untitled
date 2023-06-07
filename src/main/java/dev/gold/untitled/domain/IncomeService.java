package dev.gold.untitled.domain;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class IncomeService {

  private final IncomeRepository incomeRepository;
  private final IncomeTypeRepository incomeTypeRepository;

  public List<Income> getAll() {
    log.info("Executing IncomeService::getAll");
    return incomeRepository.findAll();
  }
  
  public List<IncomeType> getAllIncomeType() {
	log.info("Getting list of all Expense Type");
	return incomeTypeRepository.findAll();
  }
  
  public List<Income> getAllIncomeByDate(String year, String month, String day) {
	log.info("Getting list of all Income filtered by Date");
	return incomeRepository.findByDate(year,month,day);
	  }
}
