package partes_laboratorio;

public class Equipamento implements Mostrar{
    private String modelo;
    private String descricao;
    private Estado estado;
    private Sala sala;

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
    
    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Sala getSala() {
        return sala;
    }
    public void setSala(Sala sala) {
        this.sala = sala;
    }
    
    @Override
        public void mostrarDados(){
            System.out.println("---- Dados do Equipamento ----");
            System.out.println("Modelo: " + modelo);
            System.out.print("Descrição"+ descricao);
            System.out.println("Estado: " + estado);
            System.out.println("Sala: " + sala);
    }
    
    @Override
        public void mostrarResumo(){
            System.out.println("--- Resumo do Equipamento ---");
            System.out.println("Modelo: " + modelo);
            System.out.println("Estado: " + estado);
            System.out.println("Sala: " + sala);
    }
}
