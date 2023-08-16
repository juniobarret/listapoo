package questao01;


public class DataHoraComposicao {
    private Data data;
    private Hora hora;

    public DataHoraComposicao(int dia, int mes, int ano, int hora, int minuto) {
        this.data = new Data(dia, mes, ano);
        this.hora = new Hora(hora, minuto);
    }

    public Data getData() {
        return data;
    }

    public Hora getHora() {
        return hora;
    }

    public boolean ehIgual(DataHora outraDataHora) { // 
        return this.getData().ehIgual(outraDataHora.getData()) &&
               this.getHora().getHora() == outraDataHora.getHora().getHora() &&
               this.getHora().getMinuto() == outraDataHora.getHora().getMinuto();
    }
}
