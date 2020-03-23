package ua.lviv.iot.stuffForBar.model;

public class OrganizersForTheBar extends AbstractBar {
    public OrganizersForTheBar(int priceInUAH, ShapeOfIce shapeOfIce, int productionYear) {
        super(priceInUAH, shapeOfIce, productionYear);

    }

    public String getCubes(){
        return super.getCubes() + ", " + "shapeOfIce";
    }

    public String toWhiskey(){
        return super.toWhiskey() + ", " + getShapeOfIce();
    }

}