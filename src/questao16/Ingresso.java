
package questao16;

import java.util.Date;

class Ingresso {
    private double valor;

    public Ingresso(double valor) {
        this.valor = valor;
    }

    public double getValorFinal() {
        return valor;
    }
}

class IngressoVIP extends Ingresso {
    private double valorAdicional;

    public IngressoVIP(double valor, double valorAdicional) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    @Override
    public double getValorFinal() {
        return super.getValorFinal() + valorAdicional;
    }
}
