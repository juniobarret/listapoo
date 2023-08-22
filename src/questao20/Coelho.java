package questao20;

public class Coelho extends Animal {
    public Coelho(String nome) {
        super(nome);
    }

    @Override
    public void falar() {
        System.out.println("Coelhinho: Fazendo um som fofo");
    }
}
