package ua.lviv.iot.stuffForBar.model;

public class IceBuckets extends AbstractBar {
    public IceBuckets(int priceInUAH) {
        super(priceInUAH);
    }

    @Override
    protected int compare(float priceInUAH, float priceInUAH1) {
        return 0;
    }
}
