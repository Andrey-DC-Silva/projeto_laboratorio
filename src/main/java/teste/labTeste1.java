package teste;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import modelo.Equipamento;
import modelo.Experimento;
import modelo.Pesquisador;
import modelo.Projeto;
import modelo.Sala;
import modelo.Tecnico;

public class labTeste1 {
    public static void main(String[] args) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Sala sala1 = new Sala(
            "A101",
            "Laboratório de Biologia", 
            "Livre"
        );
        Sala sala2 = new Sala(
            "A201",
            "Sala de Pesquisas", 
            "Livre"
        );
        Sala sala3 = new Sala(
            "B102", 
            "Laboratório de Química", 
            "Livre"
        );

        Equipamento eq1 = new Equipamento(
            "Microscópio Biológico", 
            "Precisão para análises celulares", 
            "Operacional", 
            sala1
        );
        Equipamento eq2 = new Equipamento(
            "Centrífuga", 
            "Separação de substâncias", 
            "Operacional", 
            sala3
        );
        Equipamento eq3 = new Equipamento(
            "Balança de Precisão", 
            "Medição exata de massas", 
            "Manutenção", 
            sala2
        );

        Tecnico tecnico1 = new Tecnico(
            "1134", 
            "Carlos Silva", 
            "123.456.789-01", 
            LocalDate.parse("10/03/1985", formato), 
            "Manutenção de Equipamentos", 
            null
        );
        Tecnico tecnico2 = new Tecnico(
            "1177", 
            "Joana Nunes", 
            "987.654.321-00", 
            LocalDate.parse("15/08/1980", formato), 
            "Gerenciamento de Laboratório", 
            null
        );
        tecnico1.adicionarEquipamento(eq1);
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
        Pesquisador pesquisador2 = new Pesquisador(
            "1424", 
            "Roberto Fonseca", 
            "123.451.921-12", 
            LocalDate.parse("10/02/1990", formato), 
            "Biologia", 
            null
        );
        Pesquisador pesquisador3 = new Pesquisador(
            "1567", 
            "Luiza Torres", 
            "321.654.987-00", 
            LocalDate.parse("25/11/1992", formato), 
            "Química Orgânica", 
            null
        );

        pesquisador1.adicionarAfiliacao("INS");
        pesquisador2.adicionarAfiliacao("UFRGS");
        pesquisador3.adicionarAfiliacao("USP");

        Projeto projeto1 = new Projeto(
            "Estudo sobre Impacto Ambiental de Microplásticos",
            "Objetivo: investigar a presença e efeitos dos microplásticos em ecossistemas aquáticos",
            LocalDate.parse("01/03/2022", formato),
            LocalDate.parse("30/11/2024", formato),
            "Em Andamento",
            null,
            null
        );

        Projeto projeto2 = new Projeto(
            "Desenvolvimento de Compostos Químicos Antivirais",
            "Estudo de novos compostos para bloqueio de replicação viral",
            LocalDate.parse("01/02/2022", formato),
            LocalDate.parse("15/12/2024", formato),
            "Em Andamento",
            null,
            null
        );

        Experimento exp1 = new Experimento(
            "001",
            "Resistência Viral",
            "Análise da resistência em presença de medicamentos",
            LocalDate.parse("08/08/2021", formato),
            sala1,
            pesquisador2
        );

        Experimento exp2 = new Experimento(
            "002",
            "Análise de Dados",
            "Documentação e análise de dados anteriores",
            LocalDate.parse("01/09/2021", formato),
            sala2,
            pesquisador1
        );

        Experimento exp3 = new Experimento(
            "003",
            "Síntese de Compostos",
            "Criação de compostos com potencial antiviral",
            LocalDate.parse("20/03/2023", formato),
            sala3,
            pesquisador3
        );

        Experimento exp4 = new Experimento(
            "004",
            "Testes com Células",
            "Avaliação de toxicidade dos compostos",
            LocalDate.parse("10/05/2024", formato),
            sala3,
            pesquisador3
        );

        sala1.adicionarEquipamento(eq1);
        sala2.adicionarEquipamento(eq3);
        sala3.adicionarEquipamento(eq2);

        exp1.adicionarEquipamento(eq1);
        exp3.adicionarEquipamento(eq2);
        exp4.adicionarEquipamento(eq2);
        exp4.adicionarEquipamento(eq3);

        projeto1.adicionarPesquisador(pesquisador1);
        projeto1.adicionarPesquisador(pesquisador2);
        projeto1.adicionarExperimento(exp1);
        projeto1.adicionarExperimento(exp2);

        projeto2.adicionarPesquisador(pesquisador3);
        projeto2.adicionarExperimento(exp3);
        projeto2.adicionarExperimento(exp4);

//        eq1.mostrarDados();
//        eq1.mostrarResumo();
//
//        tecnico1.mostrarDados();
//        tecnico1.mostrarResumo();
//
//        pesquisador1.mostrarDados();
//        pesquisador1.mostrarResumo();
//
//        exp1.mostrarDados();
//        exp1.mostrarResumo();
//
//        projeto1.mostrarDados();
//        projeto1.mostrarResumo();
    }
}