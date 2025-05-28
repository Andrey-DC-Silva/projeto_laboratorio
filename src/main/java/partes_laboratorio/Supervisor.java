package partes_laboratorio;

public class Supervisor extends Pessoa{
    private String identificacao;
    private String departamento;
    private String projeto;

    public String getIdentificacao() {
        return identificacao;
    }
    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getProjeto() {
        return projeto;
    }
    public void setProjeto(String projeto) {
        this.projeto = projeto;
    }
    
}
