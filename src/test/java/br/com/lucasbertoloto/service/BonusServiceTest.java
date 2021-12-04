package br.com.lucasbertoloto.service;

import br.com.lucasbertoloto.modelo.Funcionario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

public class BonusServiceTest {

	@Test
	void noBonusWhenSalaryGreaterThan10000(){
		BonusService bonusService = new BonusService();
		BigDecimal bonus = bonusService.calcularBonus(new Funcionario("Lúcio", LocalDate.now(),
				new BigDecimal("10001")));
		Assertions.assertEquals(new BigDecimal("0.00"),bonus);
	}

	@Test
	void bonusShouldBeTenPorcentOfSalary(){
		BonusService bonusService = new BonusService();
		BigDecimal bonus = bonusService.calcularBonus(new Funcionario("Lúcio", LocalDate.now(),
				new BigDecimal("1000")));
		Assertions.assertEquals(new BigDecimal("100.00"),bonus);
	}

	@Test
	void bonusShouldBeTenPorcentOfSalaryEqual10000(){
		BonusService bonusService = new BonusService();
		BigDecimal bonus = bonusService.calcularBonus(new Funcionario("Lúcio", LocalDate.now(),
				new BigDecimal("10000")));
		Assertions.assertEquals(new BigDecimal("1000.00"),bonus);
	}
}
