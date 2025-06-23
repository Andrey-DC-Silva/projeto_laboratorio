package modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Projeto implements Mostrar {
    
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private String titulo;
    private String descricao;
    private LocalDate dtInicio;
    private LocalDate dtFim;
    private String status;
    private List<Pesquisador> pesquisadores = new ArrayList<>();
    private List<Experimento> experimentos = new ArrayList<>();

    public Projeto(String titulo, String descricao, LocalDate dtInicio, LocalDate dtFim,
            String status, List<Pesquisador> pesquisadores, List<Experimento> experimentos) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.dtInicio = dtInicio;
        this.dtFim = dtFim;
        this.status = status;
        this.pesquisadores = pesquisadores != null ? pesquisadores : new ArrayList<>();
        this.experimentos = experimentos != null ? experimentos : new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDtInicio() {
        return dtInicio;
    }

    public void setDtInicio(LocalDate dtInicio) {
        this.dtInicio = dtInicio;
    }

    public LocalDate getDtFim() {
        return dtFim;
    }

    public void setDtFim(LocalDate dtFim) {
        this.dtFim = dtFim;
    }

    public List<Pesquisador> getPesquisadores() {
        return pesquisadores;
    }

    public void setPesquisadores(List<Pesquisador> pesquisadores) {
        this.pesquisadores = pesquisadores;
    }

    public List<Experimento> getExperimentos() {
        return experimentos;
    }

    public void setExperimentos(List<Experimento> experimentos) {
        this.experimentos = experimentos;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void adicionarPesquisador(Pesquisador pesquisador) {
        if (pesquisador != null && !this.pesquisadores.contains(pesquisador)) {
            this.pesquisadores.add(pesquisador);
        }
    }

    public void adicionarExperimento(Experimento experimento) {
        if (experimento != null && !this.experimentos.contains(experimento)) {
            this.experimentos.add(experimento);
        }
    }

    @Override
    public void mostrarDados() {
        System.out.println("");
        System.out.println("===============================");
        System.out.println("---- Dados do Projeto ----");
        System.out.println("Titulo: " + titulo);
        System.out.println("Descrição: " + descricao);
        System.out.println("Início: " + dtInicio.format(formato));
        System.out.println("Fim: " + dtFim.format(formato));
        System.out.println("Status: " + status);

        System.out.println("Pesquisadores envolvidos:");
        for (Pesquisador p : pesquisadores) {
            System.out.println(" - ID:" + p.getId() + ", Nome: " + p.getNome());
        }

        System.out.println("Experimentos relacionados:");
        if (experimentos.isEmpty()) {
            System.out.println(" Nenhum experimento associado.");
        } else {
            for (Experimento e : experimentos) {
                System.out.println(" - Código: " + e.getCodigo()
                        + ", Título: " + e.getTitulo() + ", Data: " + e.getDtRealizacao().format(formato));
            }
        }
        System.out.println("===============================");
    }

    @Override
    public void mostrarResumo() {
        System.out.println("");
        System.out.println("===============================");
        System.out.println("---- Resumo do Projeto ----");
        System.out.println("Título: " + titulo);
        System.out.println("Status: " + status);
        System.out.print(" - Início: " + dtInicio.format(formato));
        if (dtFim != null) {
            System.out.println(" - Fim: " + dtFim.format(formato));
        }
        System.out.println("===============================");
    }

}
