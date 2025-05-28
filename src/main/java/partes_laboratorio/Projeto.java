package partes_laboratorio;

import java.util.ArrayList;
import java.util.List;

public class Projeto {
    private String nome;
    private String descricao;
    private String dt_inicio;
    private List<Pesquisador> pesquisadores = new ArrayList<>();
    private Supervisor supervisor;
    private String status;

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

    public String getDt_inicio() {
        return dt_inicio;
    }
    public void setDt_inicio(String dt_inicio) {
        this.dt_inicio = dt_inicio;
    }

    public List<Pesquisador> getPesquisadores() {
        return pesquisadores;
    }
    public void setPesquisadores(List<Pesquisador> pesquisadores) {
        this.pesquisadores = pesquisadores;
    }

    public Supervisor getSupervisor() {
        return supervisor;
    }
    public void setSupervisor(Supervisor supervisor) {
        this.supervisor = supervisor;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
