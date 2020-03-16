package ua.lviv.iot.stuffForBar.manger;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.stuffForBar.manager.BarManagerUtils;
import ua.lviv.iot.stuffForBar.model.ShapeOfIce;
import ua.lviv.iot.stuffForBar.model.SortType;

public class BarManagerTestUtilsTest extends BaseBarManagerTest {


    @Test
    public void testSortingDescending() {
        BarManagerUtils.sortByPriceInUAH(iceBuckets, SortType.DESCENDING);
        Assertions.assertEquals(700, iceBuckets.get(0).getPriceInUAH());
        Assertions.assertEquals(650, iceBuckets.get(1).getPriceInUAH());
        Assertions.assertEquals(500, iceBuckets.get(2).getPriceInUAH());
        Assertions.assertEquals(450, iceBuckets.get(3).getPriceInUAH());


    }

    @Test
    public void testSortByProductionYear() {
        BarManagerUtils.sortByProductionYear(organizersForTheBar, SortType.ASCENDING);
        Assertions.assertEquals(1999, organizersForTheBar.get(0).getProductionYear());
        Assertions.assertEquals(2005, organizersForTheBar.get(1).getProductionYear());
        Assertions.assertEquals(2008, organizersForTheBar.get(2).getProductionYear());
        Assertions.assertEquals(2015, organizersForTheBar.get(3).getProductionYear());
        Assertions.assertEquals(2018, organizersForTheBar.get(4).getProductionYear());
        Assertions.assertEquals(2020, organizersForTheBar.get(5).getProductionYear());
    }

    @Test
    public void testSortByShapeOfIceComparing() {
        BarManagerUtils.sortByShapeOfIce(iceBuckets, SortType.DESCENDING);
        Assertions.assertEquals(ShapeOfIce.SQUAR, organizersForTheBar.get(0).getShapeOfIce());
        Assertions.assertEquals(ShapeOfIce.TRIANGLE, organizersForTheBar.get(1).getShapeOfIce());
        Assertions.assertEquals(ShapeOfIce.STAR, organizersForTheBar.get(2).getShapeOfIce());
        Assertions.assertEquals(ShapeOfIce.TRIANGLE, organizersForTheBar.get(3).getShapeOfIce());
        Assertions.assertEquals(ShapeOfIce.STAR, organizersForTheBar.get(4).getShapeOfIce());
        Assertions.assertEquals(ShapeOfIce.SQUAR, organizersForTheBar.get(5).getShapeOfIce());
    }


    @Test
    public void testSortByShapeOfIceCompare() {
        BarManagerUtils.sortByPriceInUAHAndShapeOfIce(iceBuckets, SortType.ASCENDING);
        Assertions.assertEquals(ShapeOfIce.STAR, organizersForTheBar.get(0).getShapeOfIce());
        Assertions.assertEquals(ShapeOfIce.SQUAR, organizersForTheBar.get(1).getShapeOfIce());
        Assertions.assertEquals(ShapeOfIce.TRIANGLE, organizersForTheBar.get(2).getShapeOfIce());
        Assertions.assertEquals(ShapeOfIce.SQUAR, organizersForTheBar.get(3).getShapeOfIce());
        Assertions.assertEquals(ShapeOfIce.STAR, organizersForTheBar.get(4).getShapeOfIce());
        Assertions.assertEquals(ShapeOfIce.TRIANGLE, organizersForTheBar.get(5).getShapeOfIce());


    }
}
