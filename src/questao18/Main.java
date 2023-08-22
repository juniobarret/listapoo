package questao18;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Ernane", 26, 12345, "ADS");
        Professor professor = new Professor("Leonan", 35, 7000.0, "PO");

        System.out.println("Aluno: " + aluno.getNome() + ", Matrícula: " + aluno.getMatricula() + ", Curso: " + aluno.getCurso());
        System.out.println("Professor: " + professor.getNome() + ", Salário: $" + professor.getSalario() + ", Disciplina: " + professor.getDisciplina());
    }
}
