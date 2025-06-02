package br.edu.ifpr.teste.servico.calendario;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.jupiter.api.Test;

import paranavai.calendario.Calendario;

public class TesteCalendario {

    @Test
    public void imprimeJaneiro2025() throws IOException {
        // Arrange (PREPARAR) - Roy Osherove no livro “The Art of Unit Testing”.
        // Given (DADO) - BDD (Behavior Driven Development)

        Path path = Paths.get("src\test\resources\calendario", "janeiro2025.txt");
        String saidaEsperada = Files.readString(path);
        saidaEsperada = saidaEsperada.replace("\r\n", "\n");

        // Act (AGIR)
        // When (QUANDO)
        Calendario calendario = new Calendario();
        String janeiro2025 = calendario.getCalendario("1", "2025");

        // Assert (VERIFICAR)
        // Then (ENTÃO)
        assertEquals(saidaEsperada, janeiro2025);
    }

    @Test
    public void imprimeAno2024Completo() throws IOException {
        Path path = Paths.get("src/test/resources/calendario", "ano2024.txt");
        String saidaEsperada = Files.readString(path).replace("\r\n", "\n");

        Calendario calendario = new Calendario();
        String ano2024 = calendario.getCalendario("2024");

        assertEquals(saidaEsperada, ano2024);
    }

    @Test
    public void imprimeSetembro1752ReformaGregoriana() throws IOException {
        Path path = Paths.get("src/test/resources/calendario", "setembro1752.txt");
        String saidaEsperada = Files.readString(path).replace("\r\n", "\n");

        Calendario calendario = new Calendario();
        String setembro1752 = calendario.getCalendario("9", "1752");

        assertEquals(saidaEsperada, setembro1752);
    }
}