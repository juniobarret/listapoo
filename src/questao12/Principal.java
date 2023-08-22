class DataHora extends Data {
     private Hora hora;

     // Erro: A chamada para o construtor da classe base Data deveria estar antes da inicialização da hora
     public DataHora(int dia, int mes, int ano, int hora, int minuto, int segundo)
     {
         this.hora = new Hora(hora, minuto, segundo);
         super(dia, mes, ano);
     }

     public String toString(){
         // Erro: A chamada a super.toString() no toString() está correta para a data, mas está faltando a chamada para hora.toString()
         return super.toString() + " " + hora.toString();
     }
 }
