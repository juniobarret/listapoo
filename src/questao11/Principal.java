package questao11;


class DataHora extends Data,Hora
{
    public DataHora(int dia, int mes, int ano, int hora, int minuto, int segundo)
    {
        super(dia, mes, ano); // Erro: Aqui você está chamando o construtor da classe Data, o que é correto.
        super(hora, minuto, segundo); // Erro: Aqui você está chamando o construtor da classe Hora, mas a chamada correta deveria estar dentro do construtor da classe Hora, não aqui.
    }

    public String toString()
    {
        return super.toString() + " " + super.toString(); // Erro: Você está chamando o método toString() duas vezes para as classes Data e Hora, o que não está correto.
    }
}
