package questao09;

public class Ponto2D {
    private double x;
    private double y;

    public Ponto2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    public double calcularDistancia(Ponto2D outroPonto) {
        double deltaX = x - outroPonto.x;
        double deltaY = y - outroPonto.y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    public double calcularDistancia(double xOutro, double yOutro) {
        double deltaX = x - xOutro;
        double deltaY = y - yOutro;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    public static void main(String[] args) {
        Ponto2D p1 = new Ponto2D(1, 1);
        Ponto2D p2 = new Ponto2D(2, 2);
        System.out.println("A distância entre " + p1 + " e " + p2 + " é " + p1.calcularDistancia(p2));
    }

}
