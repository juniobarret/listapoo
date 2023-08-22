package questao04;

public class Politico extends Pessoa {
    private String partido;

    public Politico(String nome, String cpf, String rg, String email, String partido) {
        super(nome, cpf, rg, email);
        this.partido = partido;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }
 
}
