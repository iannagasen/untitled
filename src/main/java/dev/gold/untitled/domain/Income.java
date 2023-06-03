package dev.gold.untitled.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Entity
@Table(name = "income")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Income {

  @Id
  private Long id;

  private Long userId;
  
  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "income_type_id", referencedColumnName = "id")
  private IncomeType incomeType;
  
  private LocalDate createdDate;
  private BigDecimal amount;

}
