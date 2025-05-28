package partes_laboratorio;

import java.time.LocalDate;

public abstract class Pessoa {
    private String identificacao;
    private String nome;
    private String cpf;
    private LocalDate dtNasc;
    
    public Pessoa(String n) {
        nome = n;
    }
    public Pessoa() {
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getCpf() {
        return cpf;
    }
    
    public void setCpf(String cpf) {
        cpf = cpf.replace(".", "").replace("-", "").trim();
        if (cpf != null && cpf.length() == 11){
            this.cpf = cpf;
        } else {
            System.out.println("CPF inválido");
        }
    }
    
    public LocalDate getDtNasc(){
        return dtNasc;
    }
    public void setDtNasc(LocalDate dtNasc){
        this.dtNasc = dtNasc;
    }
    
    public String getIdentificacao() {
        return identificacao;
    }
    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }
    
     @Override
    public String toString() {
        return nome;
    }
}