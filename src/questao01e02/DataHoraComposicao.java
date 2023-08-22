package questao01e02;

public class DataHoraComposicao {
    private Data data;
    private int hora;
    private int minuto;

    public DataHoraComposicao(int dia, int mes, int ano, int hora, int minuto) {
        this.data = new Data(dia, mes, ano);
        this.hora = hora;
        this.minuto = minuto;
    }

    public boolean ehIgual(DataHoraComposicao outraDataHora) {
        return this.data.ehIgual(outraDataHora.data) &&
               this.hora == outraDataHora.hora &&
               this.minuto == outraDataHora.minuto;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public String toString() {
        return data.toString() + " " + hora + ":" + minuto;
    }


    public static void main(String[] args) {
        DataHoraComposicao dh = new DataHoraComposicao(1, 1, 2000, 12, 30);
        System.out.println(dh);
    }

}
