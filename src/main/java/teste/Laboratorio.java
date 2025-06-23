package teste;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import modelo.Equipamento;
import modelo.Experimento;
import modelo.Pesquisador;
import modelo.Projeto;
import modelo.Sala;
import modelo.Tecnico;

public class Laboratorio {

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

        Equipamento eq1 = new Equipamento(
                "Microscópio Biológico",
                "Precisão para análises celulares",
                "Operacional",
                sala1
        );

        Tecnico tecnico1 = new Tecnico(
                "1134",
                "Carlos Silva",
                "123.456.789-01",
                LocalDate.parse("20/10/2000", formato),
                "Manutenção de Equipamentos",
                null
        );
        tecnico1.adicionarEquipamento(eq1);

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

        Projeto projeto1 = new Projeto(
                "Análise de Tratamento de Combate ao Vírus X",
                "O objetivo da pesquisa é de compreender e documentar a"
                + " efetividade do tratamento padrão utilizado no combate ao Vírus X",
                LocalDate.parse("10/06/2021", formato),
                LocalDate.parse("12/01/2023", formato),
                "Finalizado",
                null,
                null
        );

        Experimento exp1 = new Experimento(
                "001",
                "Verificação da Resistência Viral",
                "Utilização do microscópio para análise da capacidade de sobreviver e se multiplicar "
                + "mesmo na presença de medicamentos antivirais que normalmente o controlariam.",
                LocalDate.parse("08/08/2021", formato),
                sala1,
                pesquisador2
        );

        Experimento exp2 = new Experimento(
                "002",
                "Análise dos Dados do Experimento 1",
                "Organização, análise e documentação dos dados adquiridos",
                LocalDate.parse("01/09/2021", formato),
                sala2,
                pesquisador1
        );

        sala1.adicionarEquipamento(eq1);

        exp1.adicionarEquipamento(eq1);

        projeto1.adicionarPesquisador(pesquisador1);
        projeto1.adicionarPesquisador(pesquisador2);

        projeto1.adicionarExperimento(exp1);
        projeto1.adicionarExperimento(exp2);
        
//        sala1.mostrarDados();
//        sala1.mostrarResumo();

//        eq1.mostrarDados();
//        eq1.mostrarResumo();

//        tecnico1.mostrarDados();
//        tecnico1.mostrarResumo();

//        pesquisador1.mostrarDados();
//        pesquisador1.mostrarResumo();

//        exp1.mostrarDados();
//        exp1.mostrarResumo();

//        projeto1.mostrarDados();
//        projeto1.mostrarResumo();

    }   
}
