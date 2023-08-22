package questao23;

public class ContaPoupanca extends Conta {
    private double taxaDeposito = 0.5;

    public ContaPoupanca(Cliente titular, String numero) {
        super(titular, numero);
    }

    @Override
    public void depositar(double valor) {
        saldo += valor * (1 + taxaDeposito / 100);
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void transferir(Conta destino, double valor) {
        if (destino.titular.equals(this.titular)) {
            saldo -= valor;
            destino.depositar(valor);
        } else {
            System.out.println("Transferência não permitida para contas de outros titulares.");
        }
    }
}
