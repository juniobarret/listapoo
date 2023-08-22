package questao22;

public class Calculadora {
    public int soma(int a, int b) {
        return a + b;
    }
}

public class CalculadoraCientifica extends Calculadora {
    @Override
    public int soma(double a, double b) {
        return a + b;
    }
}
/* 
O problema é que a classe CalculadoraCientifica não fez
a sobrescrita corretamente. O método soma na classe filha deveria ter
a mesma assinatura (mesmo nome e parâmetros) que o método na classe pai.
Na classe CalculadoraCientifica, eles mudaram os tipos dos parâmetros para
double, o que não está certo e causa um erro. A ideia é que a sobrescrita só 
mude o comportamento do método, mas a assinatura deve ser igual. */