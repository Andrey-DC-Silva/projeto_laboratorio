package partes_laboratorio;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Tecnico extends Pessoa implements Mostrar{
    private String especializacao;
    private List<Equipamento> equipamentos = new ArrayList<>();

    public Tecnico(String especializacao, int id, String nome, String cpf, LocalDate dtNasc) {
        super(id, nome, cpf, dtNasc);
        this.especializacao = especializacao;
    }
    
    public String getEspecializacao() {
        return especializacao;
    }
    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    public List<Equipamento> getEquipamentos() {
        return equipamentos;
    }
    public void setEquipamentos(List<Equipamento> equipamentos) {
        this.equipamentos = equipamentos;
    }

    @Override
        public void mostrarDados(){
            System.out.println("---- Dados do Tecnico ----");
            System.out.println("ID: " + getId());
            System.out.println("Nome: " + getNome());
            System.out.println("CPF: " + getCpf());
            System.out.println("Data de Nascimento: " + getDtNasc());
            System.out.println("Especialização: " + getEspecializacao());

            System.out.println("Equipamentos Operados:");
            if(equipamentos.isEmpty()){
                System.out.println("Nenhum equipamento registrado.");
            }
            else{
                for (Equipamento equipamento : equipamentos){
                    System.out.println("Instituição: " + equipamento.getModelo());
                    System.out.println("Início: " + equipamento.getSala());
                    System.out.println("Tipo: " + equipamento.getEstado());
                }
            }
            System.out.println("===================");
        }
    
    @Override
        public void mostrarResumo(){
            System.out.println("--- Resumo do Tecnico ---");
            System.out.println("ID: " + getId());
            System.out.println("Nome: " + getNome());
            System.out.println("CPF: " + getCpf());
            System.out.println("Especialização: " + getEspecializacao());
        }
}
