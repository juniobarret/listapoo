package questao04;

public class Prefeito extends Politico {
    private String cidadeGovernada;

    public Prefeito(String nome, String cpf, String rg, String email, String partido, String cidadeGovernada) {
        super(nome, cpf, rg, email, partido);
        this.cidadeGovernada = cidadeGovernada;
    }

    public String getCidadeGovernada() {
        return cidadeGovernada;
    }

    public void setCidadeGovernada(String cidadeGovernada) {
        this.cidadeGovernada = cidadeGovernada;
    }

}
