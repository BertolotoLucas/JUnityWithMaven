package br.com.lucasbertoloto.service;

import br.com.lucasbertoloto.model.Employee;

import java.math.BigDecimal;

public class ReadjustmentService {

    public void grantReadjustment(Employee employee, Performance performance) {
        BigDecimal percentageReadjustment = performance.getPercentageReadjustment();
        BigDecimal readjustment = employee.getSalary().multiply(percentageReadjustment);
        employee.readjustmentSalary(readjustment);
    }

}
