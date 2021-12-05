package br.com.lucasbertoloto.service;

import br.com.lucasbertoloto.modelo.Funcionario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ReadjustmentServiceTest {

    private ReadjustmentService readjustmentService;
    private Funcionario funcionario;

    @BeforeEach
    private void initialize() {
        readjustmentService = new ReadjustmentService();
        funcionario = new Funcionario("Fábio", LocalDate.now(), new BigDecimal("1000.00"));
    }

    @Test
    void ShouldReturnThreePorcentInPerformanceToDesired(){
        readjustmentService.grantReadjustment(funcionario, Performance.TO_DESIRED);
        Assertions.assertEquals(new BigDecimal("1030.00"),funcionario.getSalario());
    }

    @Test
    void ShouldReturnFifteenPorcentInPerformanceGood(){
        readjustmentService.grantReadjustment(funcionario, Performance.GOOD);
        Assertions.assertEquals(new BigDecimal("1150.00"),funcionario.getSalario());
    }

    @Test
    void ShouldReturnTwentyPorcentInPerformanceGreat(){
        readjustmentService.grantReadjustment(funcionario, Performance.GREAT);
        Assertions.assertEquals(new BigDecimal("1200.00"),funcionario.getSalario());
    }
}
