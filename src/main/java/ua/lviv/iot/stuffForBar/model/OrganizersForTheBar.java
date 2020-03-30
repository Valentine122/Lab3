package ua.lviv.iot.stuffForBar.model;

public class OrganizersForTheBar extends AbstractBar {
    public OrganizersForTheBar(int priceInUAH, ShapeOfIce shapeOfIce, int productionYear) {
        super(priceInUAH, shapeOfIce, productionYear);

    }

    public String getHeaders(){
        return super.getHeaders() + ", " + "shapeOfIce";
    }

    public String toCSV(){
        return super.toCSV() + ", " + getShapeOfIce();
    }

}