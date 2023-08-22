package questao05;

class Ponto2D {
    private double x;
    private double y;

    public Ponto2D(double _x, double _y) { // Classe com letra minúscula deve ser maiúscula e deve ser igual a nome da classe
        this.x = _x;
        this.y = _y;
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }
}

class Ponto3D extends Ponto2D {
    private double z;

    public Ponto3D(double _x, double _y, double _z) { // Classe com letra minúscula deve ser maiúscula e deve ser igual a nome da classe
        super(_x, _y);
        this.z = _z;
    }
        // é necessário usar o construtor da superclasse através do uso da palavra-chave super(_x, _y).
}

