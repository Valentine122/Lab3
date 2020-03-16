package ua.lviv.iot.stuffForBar.model;

public class SetsForTheBar extends AbstractBar {
    public SetsForTheBar(int priceInUAH) {
        super(priceInUAH);
    }

    @Override
    protected int compare(float priceInUAH, float priceInUAH1) {
        return 0;
    }

}
