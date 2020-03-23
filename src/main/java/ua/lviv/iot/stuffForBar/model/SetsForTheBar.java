package ua.lviv.iot.stuffForBar.model;


public class SetsForTheBar extends AbstractBar {

private int numberOfItemsInPerSet;

private String amountOfStuffs;



public int getNumberOfItemsInPerSet() {

return numberOfItemsInPerSet;

}



public void setNumberOfItemsInPerSet(int numberOfItemsInPerSet) {

this.numberOfItemsInPerSet = numberOfItemsInPerSet;

}



public String getAmountOfStuffs() {

return amountOfStuffs;

}



public void setAmountOfStuffs(String amountOfStuffs) {

this.amountOfStuffs = amountOfStuffs;

}



public SetsForTheBar(String material, float priceInUAH, int productionYear, String producerName, int weightInGrams, int numberOfItemsInPerSet, String amountOfStuffs) {

super(material, priceInUAH, productionYear, producerName, weightInGrams);

this.numberOfItemsInPerSet = numberOfItemsInPerSet;

this.amountOfStuffs = amountOfStuffs;

}



}

