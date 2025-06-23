package modelo;

import java.util.ArrayList;
import java.util.List;

public class Sala implements Mostrar {

    private String codigo;
    private String tipo;
    private String estado;
    private List<Equipamento> equipamentos = new ArrayList<>();

    public Sala(String codigo, String tipo, String estado) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.estado = estado;
        this.equipamentos = equipamentos != null ? equipamentos : new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public List<Equipamento> getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(List<Equipamento> equipamentos) {
        this.equipamentos = equipamentos;
    }

    public void adicionarEquipamento(Equipamento equipamento) {
        if (equipamento != null && !this.equipamentos.contains(equipamento)) {
            this.equipamentos.add(equipamento);
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return codigo;
    }

    @Override
    public void mostrarDados() {
        System.out.println("");
        System.out.println("===============================");
        System.out.println("---- Dados da Sala ----");
        System.out.println("Código: " + codigo);
        System.out.println("Tipo: " + tipo);
        System.out.println("Estado: " + estado);
        System.out.println("-Equipamentos na Sala:");
        if (equipamentos.isEmpty()) {
            System.out.println(" Nenhum equipamento no local.");
        } else {
            for (Equipamento e : equipamentos) {
                System.out.println(" - " + e.getModelo() + ", Estado: " + e.getEstado());
            }
        }
        System.out.println("===============================");
    }

    @Override
    public void mostrarResumo() {
        System.out.println("");
        System.out.println("===============================");
        System.out.println("--- Resumo da Sala ---");
        System.out.println("Código: " + codigo);
        System.out.println("Tipo: " + tipo);
        System.out.println("Estado: " + estado);
        System.out.println("===============================");
    }

}
