package ua.lviv.iot.stuffForBar.model;

public class SetsForTheBar extends AbstractBar {
    private int numOfSets;

    public SetsForTheBar(int priceInUAH, ShapeOfIce shapeOfIce, int productionYear) {
        super(priceInUAH, shapeOfIce, productionYear);

    }

    public int getNumOfSets(){
        return numOfSets;
    }

    public String getCubes(){
        return super.getCubes() + ", " + "numOfSets";
    }

    public String toWhiskey(){
        return super.toWhiskey() + ", " + getNumOfSets();
    }

}


