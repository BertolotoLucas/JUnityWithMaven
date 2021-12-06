package br.com.lucasbertoloto.service;

import br.com.lucasbertoloto.model.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ReadjustmentServiceTest {

    private ReadjustmentService readjustmentService;
    private Employee employee;

    @BeforeEach
    private void initialize() {
        readjustmentService = new ReadjustmentService();
        employee = new Employee("Fábio", LocalDate.now(), new BigDecimal("1000.00"));
    }

    @Test
    void ShouldReturnThreePercentInPerformanceToDesired(){
        readjustmentService.grantReadjustment(employee, Performance.TO_DESIRED);
        Assertions.assertEquals(new BigDecimal("1030.00"), employee.getSalary());
    }

    @Test
    void ShouldReturnFifteenPercentInPerformanceGood(){
        readjustmentService.grantReadjustment(employee, Performance.GOOD);
        Assertions.assertEquals(new BigDecimal("1150.00"), employee.getSalary());
    }

    @Test
    void ShouldReturnTwentyPercentInPerformanceGreat(){
        readjustmentService.grantReadjustment(employee, Performance.GREAT);
        Assertions.assertEquals(new BigDecimal("1200.00"), employee.getSalary());
    }
}
