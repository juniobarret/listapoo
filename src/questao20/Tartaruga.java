package questao20;

public class Tartaruga extends Animal {
    public Tartaruga(String nome) {
        super(nome);
    }

    @Override
    public void falar() {
        System.out.println("Tartaruga: Não faço barulho, só ando devagar");
    }
}

