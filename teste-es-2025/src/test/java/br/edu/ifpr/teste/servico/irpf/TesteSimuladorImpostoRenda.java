package br.edu.ifpr.teste.servico.irpf;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import imposto.renda.SimuladorImpostoRenda;

public class TesteSimuladorImpostoRenda {

    @Test
    public void testeIsento() {
        double salario = 1900.00;
        double esperado = 0.0;
        double resultado = SimuladorImpostoRenda.calcularImposto(salario);
        assertEquals(esperado, resultado, 0.01);
    }

    @Test
    public void testeSalarioEntre1903_99_e_2826_5() {
        double salario = 2000.00;
        double esperado = 7.20;
        double resultado = SimuladorImpostoRenda.calcularImposto(salario);
        assertEquals(esperado, resultado, 0.01);
    }

    @Test
    public void testeSalarioEntre2826_66_e_3751_05() {
        double salario = 3000.00;
        double esperado = 95.20;
        double resultado = SimuladorImpostoRenda.calcularImposto(salario);
        assertEquals(esperado, resultado, 0.01);
    }

    @Test
    public void testeSalarioEntre3751_06_e_4664_68() {
        double salario = 4000.00;
        double esperado = 263.87;
        double resultado = SimuladorImpostoRenda.calcularImposto(salario);
        assertEquals(esperado, resultado, 0.01);
    }

    @Test
    public void testeSalarioAcima4664_68() {
        double salario = 7000.00;
        double esperado = 1055.64;
        double resultado = SimuladorImpostoRenda.calcularImposto(salario);
        assertEquals(esperado, resultado, 0.01);
    }
}
