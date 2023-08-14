package exemplo01;

public class Livro extends Produto {
    String autor;
    int quantidadeDePaginas;
    
    public Livro(String nome, double preco, String autor, int quantidadeDePaginas) {
        this.nome = nome;
        this.preco = preco;
        this.autor = autor;
        this.quantidadeDePaginas = quantidadeDePaginas;
    }

    public boolean ehGrande(){
        return quantidadeDePaginas > 200;
    }    
}
