package questao07;

public class Ponto3D extends Ponto2D {
    private double z;

    public Ponto3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public Ponto3D(Ponto2D ponto2D, double z) {
        super(ponto2D.getX(), ponto2D.getY());
        this.z = z;
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
}
