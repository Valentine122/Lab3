package ua.lviv.iot.stuffForBar.model;

public class IceBuckets extends AbstractBar {
    private int numOfBottles;

    public IceBuckets(int priceInUAH, ShapeOfIce shapeOfIce, int productionYear) {
        super(priceInUAH, shapeOfIce, productionYear);

    }

    public int getNumOfBottles(){
        return numOfBottles;
    }

    public String getCubes(){
        return super.getCubes() + ", " + "numOfBottles";
    }

    public String toWhiskey() {
        return super.toWhiskey() + ", " + getNumOfBottles();
    }

}


