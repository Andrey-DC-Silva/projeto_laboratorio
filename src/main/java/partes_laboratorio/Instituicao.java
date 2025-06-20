package partes_laboratorio;

public class Instituicao {
    private int id;
    private String nome;
    private String tipo;
    private String endereco;

    public int getIdentificacao() {
        return id;
    }
    public void setIdentificacao(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    @Override
    public String toString(){
        return nome;
    }
    
}
