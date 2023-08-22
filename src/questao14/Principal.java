package questao14;

class Animal {
    protected String nome;

    public Animal(String nome) {
        this.nome = nome;
    }
}

class Cachorro extends Animal {
    public Cachorro(String nome) {
        super(nome);
    }
}

 /*Explique o que aconteceria se removêssemos a palavra-chave super
  da primeira linha do construtor da classe Cachorro e substituíssemos por super.nome = nome.

    R:Se trocar super(nome) por super.nome = nome, o código ainda vai funcionar. No entanto, a 
    primeira forma é mais recomendada. Usar super(nome) é como acionar a classe mãe para definir
    o nome do animal da maneira correta. Por outro lado, super.nome = nome é mais como você mexesse
    diretamente na organização dela, o que pode trazer complicações. Então, é mais seguro seguir
    com super(nome) para manter tudo organizado.
  */