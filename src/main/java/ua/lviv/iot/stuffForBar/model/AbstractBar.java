package ua.lviv.iot.stuffForBar.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import static java.lang.Integer.compare;

@Entity
public abstract class AbstractBar implements Comparable<AbstractBar> {
    private int priceInUAH;
    private ShapeOfIce shapeOfIce;
    private int productionYear;
    private String producer;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

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

    public AbstractBar(int priceInUAH, ShapeOfIce shapeOfIce, int productionYear, String producer) {

        this.priceInUAH = priceInUAH;
        this.shapeOfIce = shapeOfIce;
        this.productionYear = productionYear;
        this.producer = producer;
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

    public void setPriceInUAH(int priceInUAH){
        this.priceInUAH = priceInUAH;
    }

    public void setShapeOfIce(ShapeOfIce shapeOfIce){
        this.shapeOfIce = shapeOfIce;
    }

    public void setProductionYear(int productionYear){
        this.productionYear = productionYear;
    }

    public String getProducer(){
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
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
