package partes_laboratorio;

import java.util.ArrayList;
import java.util.List;

public class Experimento implements Mostrar{
    private int codigo;
    private String titulo;
    private String descricao;
    private String dt_realizacao;
    private String sala;
    private List<Equipamento> equipamentos_usados = new ArrayList<>();
    private Pesquisador responsavel;

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

    public String getDt_realizacao() {
        return dt_realizacao;
    }
    public void setDt_realizacao(String dt_realizacao) {
        this.dt_realizacao = dt_realizacao;
    }

    public String getSala() {
        return sala;
    }
    public void setSala(String sala) {
        this.sala = sala;
    }

    public List<Equipamento> getEquipamentos_usados() {
        return equipamentos_usados;
    }
    public void setEquipamentos_usados(List<Equipamento> equipamentos_usados) {
        this.equipamentos_usados = equipamentos_usados;
    }

    public Pesquisador getResponsavel() {
        return responsavel;
    }
    public void setResponsavel(Pesquisador responsavel) {
        this.responsavel = responsavel;
    }
    
    @Override
        public void mostrarDados(){
            System.out.println("---- Dados do Experimento ----");
            System.out.println("Código: " + codigo);
            System.out.println("Título: " + titulo);
            System.out.println("Descrição: " + descricao);
            System.out.println("Data de Realização: " + dt_realizacao);
            System.out.println("Sala: " + sala);
            System.out.println("Responsável: " + (responsavel != null ? responsavel.getNome() : "Não definido"));
    
            System.out.println("Equipamentos usados:");
            if (equipamentos_usados.isEmpty()) {
                System.out.println("  Nenhum equipamento registrado.");
            } 
            else {
                for(Equipamento e : equipamentos_usados) {
                    System.out.println("  - " + e.getModelo() + " (" + e.getEstado() + ")");
                }
            }
        System.out.println("===============================");
        }
    
    @Override
        public void mostrarResumo(){
            System.out.println("--- Resumo do Equipamento ---");
            System.out.println("Codigo: " + codigo);
            System.out.println("Titulo: " + titulo);
            System.out.println("Data: " + dt_realizacao);
            System.out.println("Responsável: " + responsavel);
    }
    
}
