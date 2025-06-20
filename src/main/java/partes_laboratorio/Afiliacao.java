package partes_laboratorio;

import java.time.LocalDate;

public class Afiliacao {
    private Pesquisador pesquisador;
    private String instituicao_nome;
    private String funcao;
    private LocalDate dt_inicio;

    public Afiliacao(Pesquisador pesquisador, String instituicao_nome, String funcao, LocalDate dt_inicio) {
        this.pesquisador = pesquisador;
        this.instituicao_nome = instituicao_nome;
        this.funcao = funcao;
        this.dt_inicio = dt_inicio;
    }

    public int getId_pesquisador() {
        return pesquisador.getId();
    }
    public void vincularPesquisador(Pesquisador pesquisador) {
        this.pesquisador = pesquisador;
    }

    public String getInstituicao_nome() {
        return instituicao_nome;
    }
    public void setInstituicao_nome(String instituicao_nome) {
        this.instituicao_nome = instituicao_nome;
    }

    public String getFuncao() {
        return funcao;
    }
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    
    public LocalDate getDt_inicio() {
        return dt_inicio;
    }
    public void setDt_inicio(LocalDate dt_inicio) {
        this.dt_inicio = dt_inicio;
    }
    
}
