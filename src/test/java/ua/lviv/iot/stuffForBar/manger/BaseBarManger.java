package ua.lviv.iot.stuffForBar.manger;

import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;

import ua.lviv.iot.stuffForBar.model.AbstractBar;
import ua.lviv.iot.stuffForBar.model.FormsForIce;
import ua.lviv.iot.stuffForBar.model.IceBuckets;
import ua.lviv.iot.stuffForBar.model.OrganizersForTheBar;
import ua.lviv.iot.stuffForBar.model.SetsForTheBar;
import ua.lviv.iot.stuffForBar.model.ShapeOfIce;

public class BaseBarManger {

    protected List<AbstractBar> avaialableBar;

    @BeforeEach
    public void createStuffs() {
        avaialableBar= new LinkedList<AbstractBar>();
        avaialableBar.add(new FormsForIce("Glass", 100, 2002, "Gelik", 100, 8, ShapeOfIce.SQUAR));
        avaialableBar.add(new FormsForIce("Plastic", 200, 2012, "Dumun", 200, 12, ShapeOfIce.TRIANGLE));
        avaialableBar.add(new IceBuckets("Glass", 253, 2018, "Loin", 500, 10, 20));
        avaialableBar.add(new IceBuckets("Metal", 133, 2019, "Jivan", 730, 15,16));
        avaialableBar.add(new OrganizersForTheBar("Plastic", 202, 2013, "Pulka", 950, 6));
        avaialableBar.add(new OrganizersForTheBar("Metal", 243, 2015, "Liser", 160, 7));
        avaialableBar.add(new SetsForTheBar("Wood", 223, 2011, "Pantu", 750, 4,  "Knife and Wood"));
        avaialableBar.add(new SetsForTheBar("Glass", 433, 2020, "Arando", 800, 2,  "Corkscrew and Garlic press "));

    }
}
