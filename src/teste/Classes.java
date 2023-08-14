package teste;

class Animal {
    private String nome;
    
    public Animal(){}

    public Animal(String nome) {
        this.nome = nome;
    }
}

class Cachorro extends Animal {
    public Cachorro(String nome) {
        
    }
}
public class Classes {
    public static void main(String[] args) {
        Cachorro f = new Cachorro("Teste");

    }
}