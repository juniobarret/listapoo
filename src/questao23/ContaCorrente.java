package questao23;

public class ContaCorrente extends Conta {
    private double limiteCredito = 500.0;
    private double taxaSaque = 1.5;
    private double taxaTransferencia = 2.0;

    public ContaCorrente(Cliente titular, String numero) {
        super(titular, numero);
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= saldo + limiteCredito) {
            saldo -= valor + taxaSaque;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    @Override
    public void transferir(Conta destino, double valor) {
        if (valor <= saldo + limiteCredito) {
            saldo -= taxaTransferencia;
            destino.depositar(valor);
        } else {
            System.out.println("Saldo insuficiente para transferência.");
        }
    }
}
