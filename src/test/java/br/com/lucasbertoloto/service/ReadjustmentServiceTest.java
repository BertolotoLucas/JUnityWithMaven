package br.com.lucasbertoloto.service;

import br.com.lucasbertoloto.modelo.Funcionario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ReadjustmentServiceTest {

    @Test
    void ShouldReturnThreePorcentInPerformanceToDesired(){
        ReajustmentService reajustmentService =  new ReajustmentService();
        Funcionario funcionario = new Funcionario("Fábio", LocalDate.now(), new BigDecimal("1000.00"));
        reajustmentService.grantReajustment(funcionario, Performance.TO_DESIRED);
        Assertions.assertEquals(new BigDecimal("1030.00"),funcionario.getSalario());
    }
}
