package ua.lviv.iot.stuffForBar.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class OrganizersForTheBar extends AbstractBar {

    public OrganizersForTheBar(){

    }
    public OrganizersForTheBar(int priceInUAH, ShapeOfIce shapeOfIce, int productionYear, String producer) {
        super(priceInUAH, shapeOfIce, productionYear, producer);

    }

    public OrganizersForTheBar(int priceInUAH, ShapeOfIce shapeOfIce, int productionYear) {
        super(priceInUAH, shapeOfIce, productionYear, null);

    }

    //public String getHeaders(){
    //    return super.getHeaders() + ", " + "shapeOfIce";
   // }

    public String toCSV(){
        return super.toCSV() + ", " + getShapeOfIce();
    }

}