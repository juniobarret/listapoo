package exemplo01;

class Principal {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Capacete", 200);
        System.out.println("Nome:" + produto1.nome);
        System.out.println("é caro?" + produto1.ehCaro());
        System.out.println("--------------------------------");
        Livro meuLivro = new Livro("O Hobbit", 45.12, "J. R. R. Tolkien", 298);
        System.out.println("Nome:" + meuLivro.nome);
        System.out.println("Nome:" + meuLivro.autor);
        System.out.println("é caro?" + meuLivro.ehCaro());
        System.out.println("é grande?" + meuLivro.ehGrande());
    }
}