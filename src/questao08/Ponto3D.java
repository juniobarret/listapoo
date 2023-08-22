package questao08;

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
     
    public static void main(String[] args) {
        Ponto3D ponto3D = new Ponto3D(1, 2, 3);
        System.out.println(ponto3D);
    }
}