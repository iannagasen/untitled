package dev.gold.untitled.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long> {

	@Query(value = """
			SELECT e FROM Expense e
			WHERE YEAR(e.effectivityDate) = NVL(?1,YEAR(e.effectivityDate))
			AND MONTH(e.effectivityDate) = NVL(?2,MONTH(e.effectivityDate))
			AND DAY(e.effectivityDate) = NVL(?3,DAY(e.effectivityDate))
			""")
	List<Expense> findByMonth(int year, int month, int day);

	List<Expense> findAllByEffectivityDateBetween(LocalDate from, LocalDate to);

}
