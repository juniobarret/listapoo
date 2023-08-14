package exemplo02;

class Principal {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Capacete", 200);
        System.out.println("Nome:" + produto1.getNome());
        System.out.println("é caro?" + produto1.ehCaro());
        System.out.println("--------------------------------");
        Livro meuLivro = new Livro("O Hobbit", 45.12, "J. R. R. Tolkien", 298);
        System.out.println("Nome:" + meuLivro.getNome());
        System.out.println("Nome:" + meuLivro.getAutor());
        System.out.println("é caro?" + meuLivro.ehCaro());
        System.out.println("é grande?" + meuLivro.ehGrande());
    }
}