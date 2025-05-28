package partes_laboratorio;

import java.time.LocalDate;

public class Afiliacao {
    private String nome;
    private String descricao;
    private LocalDate dt_inicio;

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
    
}
