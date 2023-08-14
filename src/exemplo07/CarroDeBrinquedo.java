package exemplo07;

public class CarroDeBrinquedo {
    private Carro carro;
    private Brinquedo brinquedo;

    public CarroDeBrinquedo(Carro carro, Brinquedo brinquedo) {
        this.carro = carro;
        this.brinquedo = brinquedo;
    }

    public CarroDeBrinquedo(String modelo, String cor, int ano, int faixaEtaria, String material) {
        this.carro = new Carro(modelo, cor, ano);
        this.brinquedo = new Brinquedo(faixaEtaria, material);
    }

    public String getModelo() {
        return carro.getModelo();
    }

    public int getAno() {
        return carro.getAno();
    }

    public String getCor() {
        return carro.getCor();
    }

    public int getFaixaEtaria() {
        return brinquedo.getFaixaEtaria();
    }

    public String getMaterial() {
        return brinquedo.getMaterial();
    }

    public void setModelo(String modelo) {
        carro.setModelo(modelo);
    }   

    public void setAno(int ano) {
        carro.setAno(ano);
    }

    public void setCor(String cor) {
        carro.setCor(cor);
    }

    public void setFaixaEtaria(int faixaEtaria) {
        brinquedo.setFaixaEtaria(faixaEtaria);
    }

    public void setMaterial(String material) {
        brinquedo.setMaterial(material);
    }

}
