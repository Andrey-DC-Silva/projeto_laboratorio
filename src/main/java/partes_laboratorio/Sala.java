package partes_laboratorio;

import java.util.ArrayList;
import java.util.List;

public class Sala {
    private int numero;
    private String bloco;
    private List<Equipamento> equipamentos = new ArrayList<>();
    private Tecnico tecnico;
    private String tipo;
    private String estado;

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBloco() {
        return bloco;
    }
    public void setBloco(String bloco) {
        this.bloco = bloco;
    }

    public List<Equipamento> getEquipamentos() {
        return equipamentos;
    }
    public void setEquipamentos(List<Equipamento> equipamentos) {
        this.equipamentos = equipamentos;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }
    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
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
    
    
}
