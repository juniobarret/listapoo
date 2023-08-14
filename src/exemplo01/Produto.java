package exemplo01;

public class Produto {
    String nome;
    double preco;

    public Produto(){}

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public boolean ehCaro(){
        return this.preco > 100;
    }
    
}
