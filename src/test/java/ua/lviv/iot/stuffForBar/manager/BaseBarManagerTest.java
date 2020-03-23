package ua.lviv.iot.stuffForBar.manager;

import org.junit.jupiter.api.BeforeEach;
import ua.lviv.iot.stuffForBar.model.*;

import java.util.LinkedList;
import java.util.List;

import static ua.lviv.iot.stuffForBar.model.ShapeOfIce.*;

public abstract class BaseBarManagerTest {

    protected List<AbstractBar> organizersForTheBar;
    protected List<AbstractBar> iceBuckets;
    protected List<AbstractBar> formsForIce;
    protected List<AbstractBar> setsForTheBar;


    @BeforeEach
    public void createOrganizersForTheBar() {
        organizersForTheBar = new LinkedList<>();
        setsForTheBar = new LinkedList<>();
        iceBuckets = new LinkedList<>();
        formsForIce = new LinkedList<>();

        organizersForTheBar.add(new OrganizersForTheBar(500, STAR, 2000));
        organizersForTheBar.add(new OrganizersForTheBar(335, SQUAR, 2001));
        organizersForTheBar.add(new OrganizersForTheBar(445, TRIANGLE, 2003));
        organizersForTheBar.add(new OrganizersForTheBar(665, SQUAR, 2005));
        organizersForTheBar.add(new OrganizersForTheBar(110, STAR, 2018));
        organizersForTheBar.add(new OrganizersForTheBar(355, TRIANGLE, 2020));
        setsForTheBar.add(new SetsForTheBar(531, SQUAR, 2010));
        iceBuckets.add(new IceBuckets(950, STAR, 2004));
        iceBuckets.add(new IceBuckets(350, SQUAR, 2006));
        iceBuckets.add(new IceBuckets(680, TRIANGLE, 2008));
        iceBuckets.add(new IceBuckets(700, SQUAR, 2018));
        formsForIce.add(new FormsForIce(1200, STAR, 2020));

    }
}
