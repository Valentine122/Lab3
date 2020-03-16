package ua.lviv.iot.stuffForBar.model;

public class OrganizersForTheBar extends AbstractBar {
    public OrganizersForTheBar(int priceInUAH, ShapeOfIce shapeOfIce, int productionYear) {
        super(priceInUAH, shapeOfIce, productionYear);

    }

    @Override
    protected int compare(float priceInUAH, float priceInUAH1) {
        return 0;
    }
}