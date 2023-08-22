package questao03;

public class Funcionario extends Pessoa {
    private int matricula;
    private double salario;
    private Cargo cargo;
    private Data dataAdmissao;

    public Funcionario(int matricula, String nome, Data dataDeNascimento, Endereco endereco, String telefoneContato,
                       double salario, Cargo cargo, Data dataAdmissao) {
        super(nome, dataDeNascimento, endereco, telefoneContato);
        this.matricula = matricula;
        this.salario = salario;
        this.cargo = cargo;
        this.dataAdmissao = dataAdmissao;
    }

    public void reajustarSalario(double porcentagem) {
        salario *= (1 + porcentagem / 100);
    }

    public void promover(Cargo novoCargo) {
        cargo = novoCargo;
    }
}
