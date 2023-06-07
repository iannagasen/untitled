package dev.gold.untitled.domain;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IncomeRepository extends JpaRepository<Income, Long> {
	
	@Query(value = """
			SELECT i FROM Income i 
			WHERE YEAR(i.createdDate) = NVL(?1,YEAR(i.createdDate))
			AND MONTH(i.createdDate) = NVL(?2,MONTH(i.createdDate))
			AND DAY(i.createdDate) = NVL(?3,DAY(i.createdDate))
		""")
		List<Income> findByDate(String year, String month, String day);
	
}
