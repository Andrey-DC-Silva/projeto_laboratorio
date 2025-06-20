package partes_laboratorio;

import java.time.LocalDate;

public abstract class Pessoa{
    private int id;
    private String nome;
    private String cpf;
    private LocalDate dtNasc;
    
    public Pessoa(int id, String nome, String cpf, LocalDate dtNasc) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.dtNasc = dtNasc;
    }
    
    public int getId() {
        return id;
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
    
}