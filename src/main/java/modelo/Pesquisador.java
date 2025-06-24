package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pesquisador extends Pessoa {

    private String areaAtuacao;
    private List<String> afiliacoes = new ArrayList<>();

    public Pesquisador(String id, String nome, String cpf, LocalDate dtNasc, String areaAtuacao, List<String> afiliacoes) {
        super(id, nome, cpf, dtNasc);
        this.areaAtuacao = areaAtuacao;
        this.afiliacoes = (afiliacoes != null) ? afiliacoes : new ArrayList<>();
    }

    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }

    public List<String> getAfiliacoes() {
        return afiliacoes;
    }

    public void setAfiliacoes(List<String> afiliacoes) {
        this.afiliacoes = afiliacoes;
    }

    public void adicionarAfiliacao(String afiliacao) {
        if (afiliacao != null) {
            this.afiliacoes.add(afiliacao);
        }
    }

    @Override
    public void mostrarDados() {
        System.out.println("");
        System.out.println("===============================");
        System.out.println("---- Dados do Pesquisador ----");
        System.out.println("ID: " + getId());
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Data de Nascimento: " + getDtNasc().format(formato));
        System.out.println("Área de Atuação: " + areaAtuacao);
        System.out.println("Afiliação: ");
        for (String afiliacao : afiliacoes) {
            System.out.println("* " + afiliacao);
        }
        System.out.println("===============================");
    }

    @Override
    public void mostrarResumo() {
        System.out.println("");
        System.out.println("===============================");
        System.out.println("--- Resumo do Pesquisador ---");
        System.out.println("ID: " + getId());
        System.out.println("Nome: " + getNome());
        System.out.println("Área de Atuação: " + areaAtuacao);
        System.out.println("===============================");
    }
}
