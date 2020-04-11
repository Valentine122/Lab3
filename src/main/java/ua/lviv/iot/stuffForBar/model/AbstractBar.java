package ua.lviv.iot.stuffForBar.model;

import static java.lang.Integer.compare;

public abstract class AbstractBar implements Comparable<AbstractBar> {
    private int priceInUAH;
    private ShapeOfIce shapeOfIce;
    private int productionYear;
    private int id;

    public AbstractBar() {

    }

    public AbstractBar(int priceInUAH) {
        this.priceInUAH = priceInUAH;
    }

    public AbstractBar(int priceInUAH, ShapeOfIce shapeOfIce) {
        this(priceInUAH);
        this.shapeOfIce = shapeOfIce;
    }

    public AbstractBar(int priceInUAH, ShapeOfIce shapeOfIce, int productionYear) {
        this(priceInUAH, shapeOfIce);
        this.productionYear = productionYear;

    }

    public AbstractBar(int priceInUAH, ShapeOfIce shapeOfIce, int productionYear, int id) {
        this(priceInUAH, shapeOfIce, productionYear);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPriceInUAH() {
        return priceInUAH;
    }

    public ShapeOfIce getShapeOfIce() {
        return shapeOfIce;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getHeaders() {
        return "priceInUAH, shapeOfIce, productionYear";
    }

    public String toCSV() {
        return getPriceInUAH() + ", " + getShapeOfIce() + ", " + getProductionYear();
    }

    @Override
    public int compareTo(AbstractBar another) {
        return compare(this.getPriceInUAH(), another.getPriceInUAH());
    }

}
