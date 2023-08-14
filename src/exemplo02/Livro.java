package exemplo02;

public class Livro extends Produto {
    private String autor;
    private int quantidadeDePaginas;
    
    public Livro(String nome, double preco, String autor, int quantidadeDePaginas) {
        this.setNome(nome);
        this.setPreco(preco);
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
