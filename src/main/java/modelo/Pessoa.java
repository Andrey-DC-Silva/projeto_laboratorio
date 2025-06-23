package modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Pessoa{
    
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
    private String id;
    private String nome;
    private String cpf;
    private LocalDate dtNasc;
    
    public Pessoa(String id, String nome, String cpf, LocalDate dtNasc) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.dtNasc = dtNasc;
    }
    
    public String getId() {
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
        if (cpf != null && cpf.length() == 11){
            cpf = cpf.replace(".", "").replace("-", "").trim();
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
    
    @Override
    public String toString(){
        return nome;
    }
    
}