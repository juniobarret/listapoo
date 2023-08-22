package questao03;

public class Cliente extends Pessoa {
    private int codigo;

    public Cliente(int codigo, String nome, Data dataDeNascimento, Endereco endereco, String telefoneContato) {
        super(nome, dataDeNascimento, endereco, telefoneContato);
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        if (codigo > 0) {
            this.codigo = codigo;
        }
    }

}
