package questao01e02;

public class DataHoraHeranca extends Data {
    private int hora;
    private int minuto;

    public DataHoraHeranca(int dia, int mes, int ano, int hora, int minuto) {
        super(dia, mes, ano);
        this.hora = hora;
        this.minuto = minuto;
    }

    public String toString() {
        return super.toString() + " " + hora + ":" + minuto;
    }

    public boolean ehIgual(DataHoraHeranca outraDataHora) {
        return super.ehIgual(outraDataHora) &&
               this.hora == outraDataHora.hora &&
               this.minuto == outraDataHora.minuto;
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

    public static void main(String[] args) {
        DataHoraHeranca dh = new DataHoraHeranca(1, 1, 2000, 12, 30);
        System.out.println(dh);
    }
}

   
