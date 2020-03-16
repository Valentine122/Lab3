package ua.lviv.iot.stuffForBar.manger;
import java.util.List;

import org.junit.jupiter.api.Assertions;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import ua.lviv.iot.stuffForBar.manager.BarManager;
import ua.lviv.iot.stuffForBar.model.AbstractBar;


class BarManagerTest extends BaseBarManagerTest {

    private BarManager barManager;

    @BeforeEach
    public void setUp() {
        barManager = new BarManager();
        barManager.addStuffs(organizersForTheBar);

    }

    @Test
    public void testFindStuffByShapeOfIce() {
        List<AbstractBar> stuffs = barManager.findStuffByShapeOfIce(10);
        Assertions.assertEquals(6, stuffs.size());
        Assertions.assertEquals(500, stuffs.get(0).getPriceInUAH());
        Assertions.assertEquals(335, stuffs.get(1).getPriceInUAH());


    }

}