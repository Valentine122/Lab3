package ua.lviv.iot.stuffForBar.model;


public class OrganizersForTheBar extends AbstractBar {

private int numberOfCompartments;
    

public int getNumberOfCompartments() {

return numberOfCompartments;

}
    

public void setNumberOfCompartments(int numberOfCompartments) {

this.numberOfCompartments = numberOfCompartments;

}

public OrganizersForTheBar(String material, float priceInUAH, int productionYear, String producerName, int weightInGrams, int numberOfCompartments) {

super(material, priceInUAH, productionYear, producerName, weightInGrams);

this.numberOfCompartments = numberOfCompartments;

 }

}
