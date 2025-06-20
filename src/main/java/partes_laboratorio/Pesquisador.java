package partes_laboratorio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pesquisador extends Pessoa implements Mostrar{
    private String area_atuacao;
    private String cnpq;
    private List<Afiliacao> afiliacoes = new ArrayList<>();

    public Pesquisador(int id, String nome, String cpf, LocalDate dtNasc) {
        super(id, nome, cpf, dtNasc);
    }
  
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

    public void adicionarAfiliacao(Afiliacao afiliacao) {
        afiliacao.vincularPesquisador(this);
        this.afiliacoes.add(afiliacao);
    }
    public List<Afiliacao> getAfiliacoes() {
        return afiliacoes;
    }
    
    @Override
        public void mostrarDados(){
            System.out.println("---- Dados do Pesquisador ----");
            System.out.println("ID: " + getId());
            System.out.println("Nome: " + getNome());
            System.out.println("CPF: " + getCpf());
            System.out.println("CNPQ: " + cnpq);
            System.out.println("Data de Nascimento: " + getDtNasc());
            System.out.println("Área de Atuação: " + area_atuacao);

            System.out.println("Afiliações:");
            if(afiliacoes.isEmpty()){
                System.out.println("Nenhuma afiliação registrada.");
            }
            else{
                for (Afiliacao afiliacao : afiliacoes){
                    System.out.println("Instituição: " + afiliacao.getInstituicao_nome());
                    System.out.println("Início: " + afiliacao.getDt_inicio());
                    System.out.println("Tipo: " + afiliacao.getFuncao());
                }
            }
            System.out.println("===================");
        }
    
    @Override
        public void mostrarResumo(){
            System.out.println("--- Resumo do Pesquisador ---");
            System.out.println("ID: " + getId());
            System.out.println("Nome: " + getNome());
            System.out.println("CPF: " + getCpf());
            System.out.println("CNPQ: " + cnpq);
            System.out.println("Área de Atuação: " + area_atuacao);
        }   
}   
