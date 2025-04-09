package br.edu.ifpr.teste.servico.ordenacao;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import br.edu.ifpr.teste.servico.ServicoOrdenacao;

public class TesteOrdenacao {

    @Test
    public void deveOrdenarArryList() throws IOException {
        // Estruturas:
        // DADO - PREPARAR
        String nomeDoArquivo = "caso1.txt";
        ArrayList<Integer> entradaEsperada = new ArrayList<>();
        entradaEsperada.add(4);
        entradaEsperada.add(9);
        entradaEsperada.add(12);

        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(nomeDoArquivo);
        assertNotNull(inputStream, "Ta errado Maluco");
        // QUANDO - AGIR
        ServicoOrdenacao servidoOrdenacao = new ServicoOrdenacao();
        ArrayList<Integer> original = servidoOrdenacao.obterDadosDoArquivo(nomeDoArquivo);
        ArrayList<Integer> ordenado = servidoOrdenacao.ordenar(original);
        // ENTAO - VERIFICAR

        assertEquals(entradaEsperada, ordenado);
    }

    @Test
    public void deveCarregarCorretamenteOArquivo() throws IOException {
        // Estruturas:
        // DADO - PREPARAR
        String nomeDoArquivo = "caso1.txt";
        ArrayList<Integer> entradaEsperada = new ArrayList<>();
        entradaEsperada.add(4);
        entradaEsperada.add(12);
        entradaEsperada.add(9);

        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(nomeDoArquivo);
        assertNotNull(inputStream, "Ta errado Maluco");
        // QUANDO - AGIR
        ServicoOrdenacao servidoOrdenacao = new ServicoOrdenacao();
        ArrayList<Integer> original = servidoOrdenacao.obterDadosDoArquivo(nomeDoArquivo);
        System.out.println(original);
        // ENTAO - VERIFICAR

        assertEquals(servidoOrdenacao, original);
    }

    @Test
    public void deveLerDesordenadoImprimirOrdenado() throws IOException {
        // Estruturas:
        // DADO - PREPARAR
        String nomeDoArquivo = "caso1.txt";
        String entradaEsperada = "4,12,9";
        String saidaEsperada = "4,9,12";

        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(nomeDoArquivo);
        assertNotNull(inputStream, "Ta errado Maluco");
        // QUANDO - AGIR
        ServicoOrdenacao servidoOrdenacao = new ServicoOrdenacao();
        ArrayList<Integer> original = servidoOrdenacao.obterDadosDoArquivo(nomeDoArquivo);
        ArrayList<Integer> ordenado = servidoOrdenacao.ordenar(original);
        // ENTAO - VERIFICAR

    }
}
