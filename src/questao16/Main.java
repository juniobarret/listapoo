package questao16;

public class Main {
    public static void main(String[] args) {
        Ingresso ingressoNormal = new Ingresso(50.0);
        System.out.println("Valor do Ingresso Normal: " + ingressoNormal.getValorFinal());

        IngressoVIP ingressoVip = new IngressoVIP(70.0, 30.0);
        System.out.println("Valor do Ingresso VIP: " + ingressoVip.getValorFinal());
    }
}
