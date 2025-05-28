package partes_laboratorio;

public class Experimento {
    private int numero;
    private String titulo;
    private String descricao;
    private String dt_realizacao;
    private String sala;
    private String equipamentos_usados;
    private String responsavel;

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
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

    public String getEquipamentos_usados() {
        return equipamentos_usados;
    }
    public void setEquipamentos_usados(String equipamentos_usados) {
        this.equipamentos_usados = equipamentos_usados;
    }

    public String getResponsavel() {
        return responsavel;
    }
    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }
    
}
