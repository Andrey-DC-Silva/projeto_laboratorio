package partes_laboratorio;

public class Instituicao {
    private int identificacao;
    private String nome;
    //cnpj?
    private String tipo;
    private String endereco;

    public int getIdentificacao() {
        return identificacao;
    }
    public void setIdentificacao(int identificacao) {
        this.identificacao = identificacao;
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
    
    
}
