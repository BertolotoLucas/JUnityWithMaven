package br.com.lucasbertoloto.service;

import br.com.lucasbertoloto.model.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

public class BonusServiceTest {

	@Test
	void throwsExceptionWhenSalaryGreaterThan10000(){
		BonusService bonusService = new BonusService();
		Assertions.assertThrows(IllegalArgumentException.class,
				() -> bonusService.calculateBonus(new Employee("Lúcio", LocalDate.now(),
						new BigDecimal("10001"))));

	}

	@Test
	void bonusShouldBeTenPorcentOfSalary(){
		BonusService bonusService = new BonusService();
		BigDecimal bonus = bonusService.calculateBonus(new Employee("Lúcio", LocalDate.now(),
				new BigDecimal("1000")));
		Assertions.assertEquals(new BigDecimal("100.00"),bonus);
	}

	@Test
	void bonusShouldBeTenPorcentOfSalaryEqual10000(){
		BonusService bonusService = new BonusService();
		BigDecimal bonus = bonusService.calculateBonus(new Employee("Lúcio", LocalDate.now(),
				new BigDecimal("10000")));
		Assertions.assertEquals(new BigDecimal("1000.00"),bonus);
	}
}
