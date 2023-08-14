package exemplo04;

public class Produto {
    private String nome;
    private double preco;
    
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
