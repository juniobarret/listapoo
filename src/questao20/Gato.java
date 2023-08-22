package questao20;

public class Gato extends Animal {
    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void falar() {
        System.out.println("Miau");
    }
}
