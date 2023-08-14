package exemplo03.modelo;

public class Livro extends Produto {
    protected String autor;
    protected int quantidadeDePaginas;
    
    public Livro(String nome, double preco, String autor, int quantidadeDePaginas) {
        this.nome = nome;
        this.preco = preco;
        this.autor = autor;
        this.quantidadeDePaginas = quantidadeDePaginas;
    }

    public boolean ehGrande(){
        return quantidadeDePaginas > 200;
    }

    public String getAutor() {
        return autor;
    }

    public int getQuantidadeDePaginas() {
        return quantidadeDePaginas;
    }    
}
