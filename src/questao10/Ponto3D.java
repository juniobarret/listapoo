package questao10;

public class Ponto3D {
    private Ponto2D ponto2D;
    private double z;

    public Ponto3D(double x, double y, double z) {
        this.ponto2D = new Ponto2D(x, y);
        this.z = z;
    }

    public Ponto3D(Ponto2D ponto2D, double z) {
        this.ponto2D = ponto2D;
        this.z = z;
    }

    public double getX() {
        return ponto2D.getX();
    }

    public void setX(double x) {
        ponto2D.setX(x);
    }

    public double getY() {
        return ponto2D.getY();
    }

    public void setY(double y) {
        ponto2D.setY(y);
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }    

    @Override
    public String toString() {
        return "(" + getX() + "," + getY() + "," + z + ")";
    }
     
    public double calcularDistancia(Ponto3D outroPonto) {
        double deltaX = getX() - outroPonto.getX();
        double deltaY = getY() - outroPonto.getY();
        double deltaZ = z - outroPonto.getZ();
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY + deltaZ * deltaZ);
    }

    public double calcularDistancia(double xOutro, double yOutro, double zOutro) {
        double deltaX = getX() - xOutro;
        double deltaY = getY() - yOutro;
        double deltaZ = z - zOutro;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY + deltaZ * deltaZ);
    }

    public static void main(String[] args) {
        Ponto3D ponto3D = new Ponto3D(1, 2, 3);
        System.out.println("A distância entre " + ponto3D + " e (4,5,6) é " + ponto3D.calcularDistancia(4, 5, 6));
    }
}