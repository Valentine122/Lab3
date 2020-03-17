package ua.lviv.iot.stuffForBar.model;
import static java.lang.Integer.compare;

public abstract class AbstractBar implements Comparable<AbstractBar> {
    private int priceInUAH;
    private ShapeOfIce shapeOfIce;
    private int productionYear;

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

    public float getPriceInUAH() {
        return priceInUAH;
    }

    public ShapeOfIce getShapeOfIce() {
        return shapeOfIce;
    }

    public int getProductionYear() {
        return productionYear;
    }

    @Override
    public int compareTo(AbstractBar another) {
        return compare(this.getPriceInUAH(), another.getPriceInUAH());
    }

    protected abstract int compare(float priceInUAH, float priceInUAH1);


}