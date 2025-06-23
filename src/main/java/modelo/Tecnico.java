package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Tecnico extends Pessoa implements Mostrar {

    private String especializacao;
    private List<Equipamento> equipamentos = new ArrayList<>();

    public Tecnico(String id, String nome, String cpf, LocalDate dtNasc, String especializacao, List<Equipamento> equipamentos) {
        super(id, nome, cpf, dtNasc);
        this.especializacao = especializacao;
        this.equipamentos = (equipamentos != null) ? equipamentos : new ArrayList<>();
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

    public void adicionarEquipamento(Equipamento equipamento) {
        if (equipamento != null && !this.equipamentos.contains(equipamento)) {
            this.equipamentos.add(equipamento);
        }
    }

    @Override
    public void mostrarDados() {
        System.out.println("");
        System.out.println("===============================");
        System.out.println("---- Dados do Tecnico ----");
        System.out.println("ID: " + getId());
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Data de Nascimento: " + getDtNasc().format(formato));
        System.out.println("Especialização: " + getEspecializacao());

        System.out.println("-Equipamentos Operados:");
        if (equipamentos.isEmpty()) {
            System.out.println("Nenhum equipamento registrado.");
        } else {
            for (Equipamento equipamento : equipamentos) {
                System.out.print(" - " + equipamento.getModelo());
                System.out.println(" / Sala: " + equipamento.getSala());
            }
        }
        System.out.println("==============================");
    }

    @Override
    public void mostrarResumo() {
        System.out.println("");
        System.out.println("===============================");
        System.out.println("--- Resumo do Tecnico ---");
        System.out.println("ID: " + getId());
        System.out.println("Nome: " + getNome());
        System.out.println("Especialização: " + getEspecializacao());
        System.out.println("===============================");
    }
}
