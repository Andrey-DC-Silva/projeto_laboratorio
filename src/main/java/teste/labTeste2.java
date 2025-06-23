package teste;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import modelo.Equipamento;
import modelo.Experimento;
import modelo.Pesquisador;
import modelo.Projeto;
import modelo.Sala;
import modelo.Tecnico;

public class labTeste2 {

    public static void main(String[] args) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Sala sala1 = new Sala(
                "A101",
                "Laboratório de Biologia",
                "Livre",
                null
        );
        Sala sala2 = new Sala(
                "A201",
                "Sala de Pesquisas",
                "Livre",
                null
        );
        Sala sala3 = new Sala(
                "B102",
                "Laboratório de Química",
                "Livre",
                null
        );

        Equipamento eq1 = new Equipamento(
                "Microscópio Biológico",
                "Precisão para análises celulares",
                "Operacional",
                sala1
        );
        Equipamento eq2 = new Equipamento(
                "Centrífuga",
                "Separação de amostras biológicas",
                "Operacional",
                sala3
        );
        Equipamento eq3 = new Equipamento(
                "Espectrofotômetro",
                "Análise de absorção de luz",
                "Manutenção",
                sala3
        );

        Tecnico tecnico1 = new Tecnico(
                "1134",
                "Carlos Silva",
                "123.456.789-01",
                LocalDate.of(1985, 3, 10),
                "Manutenção de Equipamentos",
                null
        );
        tecnico1.adicionarEquipamento(eq1);

        Tecnico tecnico2 = new Tecnico(
                "1189",
                "Juliana Matos",
                "987.654.321-00",
                LocalDate.of(1992, 6, 25),
                "Manutenção de Laboratório",
                null
        );

        tecnico2.adicionarEquipamento(eq2);
        tecnico2.adicionarEquipamento(eq3);

        Pesquisador pesquisador1 = new Pesquisador(
                "1392",
                "Ana de Lima",
                "012.221.123-20",
                LocalDate.parse("20/10/2000", formato),
                "Virologia",
                null
        );
        pesquisador1.adicionarAfiliacao("INS");

        Pesquisador pesquisador2 = new Pesquisador(
                "1424",
                "Roberto Fonseca",
                "123.451.921-12",
                LocalDate.parse("10/02/1990", formato),
                "Biologia",
                null
        );
        pesquisador2.adicionarAfiliacao("UFRGS");

        Pesquisador pesquisador3 = new Pesquisador(
                "1501",
                "Fernanda Souza",
                "321.654.987-77",
                LocalDate.parse("15/03/1988", formato),
                "Química Orgânica",
                null
        );
        pesquisador3.adicionarAfiliacao("USP");

        Projeto projeto1 = new Projeto(
                "Desenvolvimento de Vacina de RNA para Doenças Tropicais",
                "O projeto visa explorar a aplicação de vacinas baseadas em RNA mensageiro no combate a doenças tropicais negligenciadas como dengue, chikungunya e zika.",
                LocalDate.parse("10/06/2021", formato),
                LocalDate.parse("12/01/2023", formato),
                "Finalizado",
                null,
                null
        );

        Projeto projeto2 = new Projeto(
                "Estudo de Compostos Químicos Naturais",
                "Investigar compostos extraídos de plantas com potencial farmacológico",
                LocalDate.parse("01/03/2022", formato),
                LocalDate.parse("01/10/2024", formato),
                "Em Andamento",
                null,
                null
        );

        Experimento exp1 = new Experimento(
                "001",
                "Verificação da Resistência Viral",
                "Análise da capacidade de sobrevivência do vírus com antivirais.",
                LocalDate.parse("08/08/2021", formato),
                sala1,
                null,
                pesquisador2
        );

        Experimento exp2 = new Experimento(
                "002",
                "Análise dos Dados do Experimento 1",
                "Organização e documentação dos dados adquiridos.",
                LocalDate.parse("01/09/2021", formato),
                sala2,
                null,
                pesquisador1
        );

        Experimento exp3 = new Experimento(
                "003",
                "Extração de Compostos Naturais",
                "Extração de substâncias bioativas de plantas nativas.",
                LocalDate.parse("05/04/2023", formato),
                sala3,
                null,
                pesquisador3
        );

        Experimento exp4 = new Experimento(
                "004",
                "Análise Espectrofotométrica de Compostos",
                "Determinação da pureza de extratos por espectrofotometria.",
                LocalDate.parse("10/05/2023", formato),
                sala3,
                null,
                pesquisador3
        );

        sala1.adicionarEquipamento(eq1);
        sala3.adicionarEquipamento(eq2);
        sala3.adicionarEquipamento(eq3);

        exp1.adicionarEquipamento(eq1);
        exp3.adicionarEquipamento(eq2);
        exp4.adicionarEquipamento(eq3);

        projeto1.adicionarPesquisador(pesquisador1);
        projeto1.adicionarPesquisador(pesquisador2);
        projeto1.adicionarExperimento(exp1);
        projeto1.adicionarExperimento(exp2);

        projeto2.adicionarPesquisador(pesquisador3);
        projeto2.adicionarExperimento(exp3);
        projeto2.adicionarExperimento(exp4);

    }
}
