package partes_laboratorio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Projeto  implements Mostrar{
    private String nome;
    private String descricao;
    private LocalDate dt_inicio;
    private LocalDate dt_fim;
    private List<Pesquisador> pesquisadores = new ArrayList<>();
    private String status;
    private List<Experimento> experimentos;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDt_inicio() {
        return dt_inicio;
    }
    public void setDt_inicio(LocalDate dt_inicio) {
        this.dt_inicio = dt_inicio;
    }
    
    public LocalDate getDt_fim() {
        return dt_fim;
    }
    public void setDt_fim(LocalDate dt_fim) {
        this.dt_fim = dt_fim;
    }
    
    public List<Pesquisador> getPesquisadores() {
        return pesquisadores;
    }
    public void setPesquisadores(List<Pesquisador> pesquisadores) {
        this.pesquisadores = pesquisadores;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    
    public Projeto(String nome, String descricao, LocalDate dt_inicio, LocalDate dt_fim,
                   List<Pesquisador> pesquisadores, String status) {
        this.nome = nome;
        this.descricao = descricao;
        this.dt_inicio = dt_inicio;
        this.dt_fim = dt_fim;
        this.pesquisadores = pesquisadores != null ? pesquisadores : new ArrayList<>();
        this.status = status;
        this.experimentos = new ArrayList<>();
    }
    
    public void adicionarExperimento(Experimento experimento) {
        if (experimento != null && !this.experimentos.contains(experimento)) {
            this.experimentos.add(experimento);
        }
    }
    
    @Override
        public void mostrarDados(){
            System.out.println("---- Dados do Projeto ----");
            System.out.println("Titulo: " + nome);
            System.out.println("Descrição: " + descricao);
            System.out.println("Início: " + dt_inicio);
            System.out.println("Fim: " + dt_fim);
            System.out.println("Status: " + status);
            System.out.println("Pesquisadores envolvidos:");
            for (Pesquisador p : pesquisadores) {
                System.out.println(" - " + p.getNome());
            }

            System.out.println("Experimentos relacionados:");
            if(experimentos.isEmpty()) {
                System.out.println(" Nenhum experimento associado.");
            }
            else{
                for(Experimento e : experimentos) {
                    System.out.println(" - Código: " + e.getCodigo() + 
                        ", Título: " + e.getTitulo() + ", Data: " + e.getDt_realizacao());
                }
            }
            System.out.println("===================");
        }
    
    @Override
        public void mostrarResumo(){
            System.out.println("---- Resumo do Projeto ----");
            System.out.println("Título: " + nome);
            System.out.println("Descrição: " + descricao);
            System.out.println("Status: " + status);
            System.out.println("Data de Início:" + dt_inicio);
            if(dt_fim != null){ System.out.println("Data de Finalização: " + dt_fim); }
        }
}
