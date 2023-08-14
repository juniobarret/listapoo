package exemplo07;

public class Brinquedo {
    private int faixaEtaria;
    private String material;

    public Brinquedo(int faixaEtaria, String material) {
        this.faixaEtaria = faixaEtaria;
        this.material = material;
    }

    public int getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setFaixaEtaria(int faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
