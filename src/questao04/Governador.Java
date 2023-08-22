package questao04;

public class Governador extends Politico {
    private String estadoGovernado;

    public Governador(String nome, String cpf, String rg, String email, String partido, String estadoGovernado) {
        super(nome, cpf, rg, email, partido);
        this.estadoGovernado = estadoGovernado;
    }

    public String getEstadoGovernado() {
        return estadoGovernado;
    }

    public void setEstadoGovernado(String estadoGovernado) {
        this.estadoGovernado = estadoGovernado;
    }

    
}
