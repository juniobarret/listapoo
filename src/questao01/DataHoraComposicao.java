package questao01;

public class DataHoraComposicao {
    private Data data;
    private Hora hora;

    public DataHoraComposicao(int dia, int mes, int ano, int hora, int minuto) {
        this.data = new Data(dia, mes, ano);
        this.hora = new Hora(hora, minuto);
    }

    public int getDia() {
        return data.getDia();
    }

    public void setDia(int dia) {
        data.setDia(dia);
    }

    public int getMes() {
        return data.getMes();
    }

    public void setMes(int mes) {
        data.setMes(mes);
    }

    public int getAno() {
        return data.getAno();
    }

    public void setAno(int ano) {
        data.setAno(ano);
    }

    public int getHora() {
        return hora.getHora();
    }

    public void setHora(int hora) {
        this.hora.setHora(hora);
    }

    public int getMinuto() {
        return hora.getMinuto();
    }

    public void setMinuto(int minuto) {
        this.hora.setMinuto(minuto);
    }
}
