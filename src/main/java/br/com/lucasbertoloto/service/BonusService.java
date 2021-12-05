package br.com.lucasbertoloto.service;

import br.com.lucasbertoloto.modelo.Funcionario;

import java.math.BigDecimal;
import java.math.RoundingMode;


public class BonusService {

	public BigDecimal calcularBonus(Funcionario funcionario) {
		BigDecimal valor = funcionario.getSalario().multiply(new BigDecimal("0.1"));
		if (valor.compareTo(new BigDecimal("1000")) > 0) {
			throw new IllegalArgumentException("The salary is bigger than 10,000.00");
		}
		return valor.setScale(2, RoundingMode.HALF_UP);
	}

}
