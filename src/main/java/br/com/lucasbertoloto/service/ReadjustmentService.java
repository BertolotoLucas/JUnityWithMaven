package br.com.lucasbertoloto.service;

import br.com.lucasbertoloto.modelo.Funcionario;

import java.math.BigDecimal;

public class ReadjustmentService {

    public void grantReadjustment(Funcionario funcionario, Performance performance) {
        BigDecimal percentageReadjustment = performance.getPercentageReadjustment();
        BigDecimal readjustment = funcionario.getSalario().multiply(percentageReadjustment);
        funcionario.readjustmentSalary(readjustment);
    }

}
