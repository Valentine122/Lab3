package ua.lviv.iot.stuffForBar.model;

public class IceBuckets extends AbstractBar {
    private int volumInLiters;
    private int amountOfBottles;

    public int getVolumInLiters() {
        return volumInLiters;
    }

    public void setVolumInLiters(int volumInLiters) {
        this.volumInLiters = volumInLiters;
    }

    public int getAmountOfBottles() {
        return amountOfBottles;
    }

    public void setAmountOfBottles(int amountOfBottles) {
        this.amountOfBottles = amountOfBottles;
    }

    public IceBuckets(String material, float priceInUAH, int productionYear, String producerName, int weightInGrams, int volumInLiters, int amountOfBottles) {
        super(material, priceInUAH, productionYear, producerName, weightInGrams);
        this.volumInLiters = volumInLiters;
        this.amountOfBottles = amountOfBottles;
    }
}
