package dev.gold.untitled.domain;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
public class IncomeService {

  private final IncomeRepository incomeRepository;
  private final IncomeTypeRepository incomeTypeRepository;

  public List<Income> getAll() {
    return incomeRepository.findAll();
  }

  public List<IncomeType> getAllIncomeType() {
    return incomeTypeRepository.findAll();
  }
  
  public List<Income> getAllIncomeByDate(String year, String month, String day) {

	return incomeRepository.findByDate(year,month,day);
	  }
}
