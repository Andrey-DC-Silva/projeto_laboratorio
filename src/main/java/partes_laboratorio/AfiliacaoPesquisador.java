package partes_laboratorio;

import java.time.LocalDate;

public class AfiliacaoPesquisador {
    private int id_pesquisador;
    private int id_instituicao;
    private String afiliacao;
    private LocalDate data_inicio;

    public int getId_pesquisador() {
        return id_pesquisador;
    }
    public void setId_pesquisador(int id_pesquisador) {
        this.id_pesquisador = id_pesquisador;
    }

    public int getId_instituicao() {
        return id_instituicao;
    }
    public void setId_instituicao(int id_instituicao) {
        this.id_instituicao = id_instituicao;
    }

    public String getAfiliacao() {
        return afiliacao;
    }
    public void setAfiliacao(String afiliacao) {
        this.afiliacao = afiliacao;
    }

    public LocalDate getData_inicio() {
        return data_inicio;
    }
    public void setData_inicio(LocalDate data_inicio) {
        this.data_inicio = data_inicio;
    }

}
