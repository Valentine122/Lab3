package ua.lviv.iot.stuffForBar.manger;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.stuffForBar.model.AbstractBar;
import ua.lviv.iot.stuffForBar.manager.BarManager;

public class BarManagerTest extends BaseBarManger{

        public BarManager barManager;

        @BeforeEach
        public void setUp() {
            barManager = new BarManager();
            barManager.addStuffs(avaialableBar);
        }



        @Test
        public void testFindStuffForBarOfGlass() {
            List<AbstractBar> stuffOfGlass = barManager.findStuffForBarOfGlass(203);
            Assertions.assertEquals(4, stuffOfGlass.size());
            Assertions.assertEquals(253, stuffOfGlass.get(0).getPriceInUAH());
            Assertions.assertEquals(243, stuffOfGlass.get(1).getPriceInUAH());
            Assertions.assertEquals(223, stuffOfGlass.get(2).getPriceInUAH());
            Assertions.assertEquals(433, stuffOfGlass.get(3).getPriceInUAH());
        }
}
