package partes_laboratorio;

import java.util.ArrayList;
import java.util.List;

public class Sala implements Mostrar{
    private int numero;
    private TipoSala tipo;
    private Estado estado;
    private List<Equipamento> equipamentos = new ArrayList<>();
    
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public List<Equipamento> getEquipamentos() {
        return equipamentos;
    }
    public void setEquipamentos(List<Equipamento> equipamentos) {
        this.equipamentos = equipamentos;
    }
    
    public TipoSala getTipo() {
        return tipo;
    }
    public void setTipo(TipoSala tipo) {
        this.tipo = tipo;
    }

    public Estado getEstado() {
        return estado;
    }
    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
    @Override
        public void mostrarDados(){
            System.out.println("---- Dados da Sala ----");
            System.out.println("Número: " + numero);
            System.out.println("Tipo: " + tipo);
            System.out.println("Estado: " + estado);
            System.out.println("---Equipamentos na Sala:");
            if(equipamentos.isEmpty()) {
                System.out.println(" Nenhum equipamento no local.");
            }
            else{
                for(Equipamento e : equipamentos) {
                    System.out.println("Modelo: " + e.getModelo() + ", Estado: " + e.getEstado());
                }
            }
            System.out.println("===================");
    }
    
    @Override
        public void mostrarResumo(){
            System.out.println("--- Resumo da Sala ---");
            System.out.println("Número: " + numero);
            System.out.println("Tipo: " + tipo);
            System.out.println("Estado: " + estado);
        }
    
}
