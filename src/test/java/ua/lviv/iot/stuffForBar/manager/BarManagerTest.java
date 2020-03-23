package ua.lviv.iot.stuffForBar.manager;

import java.util.List;

import org.junit.jupiter.api.Assertions;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import ua.lviv.iot.stuffForBar.model.AbstractBar;


class BarManagerTest extends BaseBarManagerTest {

    private BarManager barManager;

    @BeforeEach
    public void setUp() {
        barManager = new BarManager();
        barManager.addStuffs(organizersForTheBar);

    }

    @Test
    public void testFindStuffByShapeOfIceT() {
        List<AbstractBar> stuffT = barManager.findStuffByShapeOfIceT(10);
        Assertions.assertEquals(6, stuffT.size());
        Assertions.assertEquals(500, stuffT.get(0).getPriceInUAH());
        Assertions.assertEquals(335, stuffT.get(1).getPriceInUAH());


    }

}