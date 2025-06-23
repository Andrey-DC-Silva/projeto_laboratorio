package modelo;

import java.time.format.DateTimeFormatter;

public class Equipamento implements Mostrar {
    
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private String modelo;
    private String descricao;
    private String estado;
    private Sala sala;

    public Equipamento(String modelo, String descricao, String estado, Sala sala) {
        this.modelo = modelo;
        this.descricao = descricao;
        this.estado = estado;
        this.sala = sala;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    @Override
    public void mostrarDados() {
        System.out.println("");
        System.out.println("===============================");
        System.out.println("---- Dados do Equipamento ----");
        System.out.println("Modelo: " + modelo);
        System.out.println("Descrição: " + descricao);
        System.out.println("Estado: " + estado);
        System.out.println("Sala: " + sala);
        System.out.println("===============================");
    }

    @Override
    public void mostrarResumo() {
        System.out.println("");
        System.out.println("===============================");
        System.out.println("--- Resumo do Equipamento ---");
        System.out.println("Modelo: " + modelo);
        System.out.println("Estado: " + estado);
        System.out.println("Sala: " + sala);
        System.out.println("===============================");
    }
}
