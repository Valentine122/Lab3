package ua.lviv.iot.stuffForBar.model;

public abstract class AbstractBar {
    protected String material;
    protected float priceInUAH;
    protected int productionYear;
    protected String producerName;
    protected int weightInGrams;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public float getPriceInUAH() {
        return priceInUAH;
    }

    public void setPriceInUAH(float priceInUAH) {
        this.priceInUAH = priceInUAH;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public String getProducerName() {
        return producerName;
    }

    public void setProducerName(String producerName) {
        this.producerName = producerName;
    }

    public int getWeightInGrams() {
        return weightInGrams;
    }

    public void setWeightInGrams(int weightInGrams) {
        this.weightInGrams = weightInGrams;
    }

    public AbstractBar(String material, float priceInUAH, int productionYear, String producerName, int weightInGrams) {
        this.material = material;
        this.priceInUAH = priceInUAH;
        this.productionYear = productionYear;
        this.producerName = producerName;
        this.weightInGrams = weightInGrams;
    }
}