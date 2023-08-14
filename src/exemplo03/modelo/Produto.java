package exemplo03.modelo;

public class Produto {
    protected String nome;
    protected double preco;

    public Produto(){}

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public boolean ehCaro(){
        return this.preco > 100;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
    
}
