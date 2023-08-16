package questao01;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    
    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    
    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean ehIgual(Data outraData) {
        return this.dia == outraData.getDia() &&
               this.mes == outraData.getMes() &&
               this.ano == outraData.getAno();
    }
    
}
