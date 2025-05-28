package partes_laboratorio;

import java.util.ArrayList;
import java.util.List;

public class Pesquisador extends Pessoa{
 private String area_atuacao;
    private String cnpq;
    private List<AfiliacaoPesquisador> afiliacoes = new ArrayList<>();
  
    public String getArea_atuacao() {
        return area_atuacao;
    }
    public void setArea_atuacao(String area_atuacao) {
        this.area_atuacao = area_atuacao;
    }

    public String getCnpq() {
        return cnpq;
    }
    public void setCnpq(String cnpq) {
        this.cnpq = cnpq;
    }

    public void adicionarAfiliacao(AfiliacaoPesquisador afiliacao){
        afiliacoes.add(afiliacao);
    }
    public List<AfiliacaoPesquisador> getAfiliacoes(){
        return afiliacoes;
    }
    public void setAfiliacoes(List<AfiliacaoPesquisador> afiliacoes){
        this.afiliacoes = afiliacoes;
    }
}
