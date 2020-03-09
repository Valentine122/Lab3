package ua.lviv.iot.stuffForBar.model;

import ua.lviv.iot.stuffForBar.model.ShapeOfIce;

public class FormsForIce extends AbstractBar {
    private int amountOfIce;
    private ShapeOfIce shapeOfIce;

    public int getAmountOfIce() {
        return amountOfIce;
    }

    public void setAmountOfIce(int amountOfIce) {
        this.amountOfIce = amountOfIce;
    }

    public ShapeOfIce getShapeOfIce() {
        return shapeOfIce;
    }

    public void setShapeOfIce(ShapeOfIce shapeOfIce) {
        this.shapeOfIce = shapeOfIce;
    }

    public FormsForIce(String material, float priceInUAH, int productionYear, String producerName, int weightInGrams, int amountOfIce, ShapeOfIce shapeOfIce) {
        super(material, priceInUAH, productionYear, producerName, weightInGrams);
        this.amountOfIce = amountOfIce;
        this.shapeOfIce = shapeOfIce;
    }
}
