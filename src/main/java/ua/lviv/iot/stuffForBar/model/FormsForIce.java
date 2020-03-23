package ua.lviv.iot.stuffForBar.model;

public class FormsForIce extends AbstractBar {
   private int volume;

    public FormsForIce(int priceInUAH, ShapeOfIce shapeOfIce, int productionYear) {
        super(priceInUAH, shapeOfIce, productionYear);

    }

   public String getCubes(){
       return super.getCubes() + ", " + "volume";
   }

   public int getVolume(){
       return volume;
   }
   public String toWhiskey(){
       return super.toWhiskey() + ", " + getVolume();
   }
}
