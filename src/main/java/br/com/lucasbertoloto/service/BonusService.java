package br.com.lucasbertoloto.service;

import br.com.lucasbertoloto.model.Employee;

import java.math.BigDecimal;
import java.math.RoundingMode;


public class BonusService {

	public BigDecimal calculateBonus(Employee employee) {
		BigDecimal value = employee.getSalary().multiply(new BigDecimal("0.1"));
		if (value.compareTo(new BigDecimal("1000")) > 0) {
			throw new IllegalArgumentException("The salary is bigger than 10,000.00");
		}
		return value.setScale(2, RoundingMode.HALF_UP);
	}

}
