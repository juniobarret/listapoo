package questao03;

public class Cargo {
    private String nome;
    private double acrescimoNoSalario;

    public Cargo(String nome, double acrescimoNoSalario) {
        this.nome = nome;
        this.acrescimoNoSalario = acrescimoNoSalario;
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getAcrescimoNoSalario() {
        return acrescimoNoSalario;
    }
    public void setAcrescimoNoSalario(double acrescimoNoSalario) {
        this.acrescimoNoSalario = acrescimoNoSalario;
    }

    

}
