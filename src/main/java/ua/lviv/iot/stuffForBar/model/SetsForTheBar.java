package ua.lviv.iot.stuffForBar.model;

public class SetsForTheBar extends AbstractBar {
    private int numOfSets;

    public SetsForTheBar(int priceInUAH, ShapeOfIce shapeOfIce, int productionYear) {
        super(priceInUAH, shapeOfIce, productionYear);

    }

    public int getNumOfSets(){
        return numOfSets;
    }

    public String getHeaders(){
        return super.getHeaders() + ", " + "numOfSets";
    }

    public String toCSV(){
        return super.toCSV() + ", " + getNumOfSets();
    }

}
