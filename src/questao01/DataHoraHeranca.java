package questao01;

public class DataHoraHeranca extends Data {
    private int hora;
    private int minuto;

    public DataHoraHeranca(int dia, int mes, int ano, int hora, int minuto) {
        super(dia, mes, ano);
        this.hora = hora;
        this.minuto = minuto;
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
}
