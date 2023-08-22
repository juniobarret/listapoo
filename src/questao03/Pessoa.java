package questao03;

public class Pessoa {
    protected String nome;
    protected Data dataDeNascimento;
    protected Endereco endereco;
    protected String telefoneContato;

    // Construtor, getters e setters
    public Pessoa(String nome, Data dataDeNascimento, Endereco endereco, String telefoneContato) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.endereco = endereco;
        this.telefoneContato = telefoneContato;
    }
}
