package exemplo05.v2;

public class Aluno extends Pessoa {
    private String curso;

    public Aluno(String nome, String cpf, String telefone, String email, String curso) {
        super(nome, cpf, telefone, email);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }
}
