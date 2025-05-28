package partes_laboratorio;

public class Tecnico extends Pessoa{
    private String especializacao;
    private String equipamentos;

    public String getEspecializacao() {
        return especializacao;
    }
    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    public String getEquipamentos() {
        return equipamentos;
    }
    public void setEquipamentos(String equipamentos) {
        this.equipamentos = equipamentos;
    }
    
}
