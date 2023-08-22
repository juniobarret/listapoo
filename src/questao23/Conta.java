package questao23;

public abstract class Conta {
    protected Cliente titular;
    protected String numero;
    protected double saldo;

    public Conta(Cliente titular, String numero) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = 0.0;
    }

    public abstract void depositar(double valor);
    public abstract void sacar(double valor);
    public abstract void transferir(Conta destino, double valor);

    public double getSaldo() {
        return saldo;
    }
}
