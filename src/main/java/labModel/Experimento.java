package labModel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Experimento implements Mostrar {

    private int codigo;
    private String titulo;
    private String descricao;
    private LocalDate dtRealizacao;
    private Sala sala;
    private List<Equipamento> equipamentosUsados = new ArrayList<>();
    private Pesquisador responsavel;

    public Experimento(int codigo, String titulo, String descricao, LocalDate dtRealizacao, Sala sala, Pesquisador responsavel) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.descricao = descricao;
        this.dtRealizacao = dtRealizacao;
        this.sala = sala;
        this.responsavel = responsavel;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public LocalDate getDtRealizacao() {
        return dtRealizacao;
    }

    public void setDtRealizacao(LocalDate dtRealizacao) {
        this.dtRealizacao = dtRealizacao;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public List<Equipamento> getEquipamentosUsados() {
        return equipamentosUsados;
    }

    public void setEquipamentosUsados(List<Equipamento> equipamentosUsados) {
        this.equipamentosUsados = equipamentosUsados;
    }

    public void adicionarEquipamento(Equipamento equipamento) {
        if (equipamento != null && !equipamentosUsados.contains(equipamento)) {
            equipamentosUsados.add(equipamento);
        }
    }

    public Pesquisador getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Pesquisador responsavel) {
        this.responsavel = responsavel;
    }

    @Override
    public String toString() {
        return titulo;
    }

    @Override
    public void mostrarDados() {
        System.out.println("");
        System.out.println("===============================");
        System.out.println("---- Dados do Experimento ----");
        System.out.println("Código: " + codigo);
        System.out.println("Título: " + titulo);
        System.out.println("Descrição: " + descricao);
        System.out.println("Data de Realização: " + dtRealizacao);
        System.out.println("Sala: " + sala);
        System.out.println("Responsável: " + (responsavel != null ? responsavel.getNome() : "Não definido"));

        System.out.println("Equipamentos usados:");
        if (equipamentosUsados.isEmpty()) {
            System.out.println("  Nenhum equipamento registrado.");
        } else {
            for (Equipamento e : equipamentosUsados) {
                System.out.println("  - " + e.getModelo() + " (" + e.getEstado() + ")");
            }
        }
        System.out.println("===============================");
    }

    @Override
    public void mostrarResumo() {
        System.out.println("");
        System.out.println("===============================");
        System.out.println("--- Resumo do Equipamento ---");
        System.out.println("Codigo: " + codigo);
        System.out.println("Titulo: " + titulo);
        System.out.println("Data: " + dtRealizacao);
        System.out.println("Responsável: " + responsavel);
        System.out.println("===============================");
    }

}
