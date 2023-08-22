package questao19;

public class Calculadora {
    public int soma(int a, int b) {
        return a + b;
    }

    public double soma(int x, int y) {
        return x + b;
    }
}


/* O problema é que os dois métodos soma são parecidos demais,
com dois números inteiros. Isso deixa a coisa confusa. O certo é fazer os métodos diferentes,
com tipos de números diferentes ou até uma quantidade diferente de números. Aí fica mais claro
para a máquina saber qual usar quando você chamar o método. */
