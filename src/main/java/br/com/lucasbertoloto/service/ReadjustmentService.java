package br.com.lucasbertoloto.service;

import br.com.lucasbertoloto.modelo.Funcionario;

import java.math.BigDecimal;

public class ReadjustmentService {

    public void grantReadjustment(Funcionario funcionario, Performance performance) {
        if(performance == Performance.TO_DESIRED) {
            BigDecimal readjustment = funcionario.getSalario().multiply(new BigDecimal("0.03"));
            funcionario.readjustmentSalary(readjustment);
        }
    }

}
