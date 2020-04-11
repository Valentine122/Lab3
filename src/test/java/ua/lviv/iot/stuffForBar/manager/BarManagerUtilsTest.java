package ua.lviv.iot.stuffForBar.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.stuffForBar.model.ShapeOfIce;
import ua.lviv.iot.stuffForBar.model.SortType;

public class BarManagerUtilsTest extends BaseBarManagerTest {


    @Test
    public void testSortingDescending() {
        BarManagerUtils.sortByPriceInUAH(iceBuckets, SortType.DESCENDING);
        Assertions.assertEquals(950, iceBuckets.get(0).getPriceInUAH());
        Assertions.assertEquals(700, iceBuckets.get(1).getPriceInUAH());
        Assertions.assertEquals(680, iceBuckets.get(2).getPriceInUAH());
        Assertions.assertEquals(350, iceBuckets.get(3).getPriceInUAH());


    }

    @Test
    public void testSortByProductionYear() {
        BarManagerUtils.sortByProductionYear(organizersForTheBar, SortType.ASCENDING);
        Assertions.assertEquals(2000, organizersForTheBar.get(0).getProductionYear());
        Assertions.assertEquals(2001, organizersForTheBar.get(1).getProductionYear());
        Assertions.assertEquals(2003, organizersForTheBar.get(2).getProductionYear());
        Assertions.assertEquals(2005, organizersForTheBar.get(3).getProductionYear());
        Assertions.assertEquals(2018, organizersForTheBar.get(4).getProductionYear());
        Assertions.assertEquals(2020, organizersForTheBar.get(5).getProductionYear());
    }

    @Test
    public void testSortByShapeOfIceTComparing() {
        BarManagerUtils.sortByShapeOfIce(iceBuckets, SortType.DESCENDING);
        Assertions.assertEquals(ShapeOfIce.STAR, organizersForTheBar.get(0).getShapeOfIce());
        Assertions.assertEquals(ShapeOfIce.SQUAR, organizersForTheBar.get(1).getShapeOfIce());
        Assertions.assertEquals(ShapeOfIce.TRIANGLE, organizersForTheBar.get(2).getShapeOfIce());
        Assertions.assertEquals(ShapeOfIce.SQUAR, organizersForTheBar.get(3).getShapeOfIce());
        Assertions.assertEquals(ShapeOfIce.STAR, organizersForTheBar.get(4).getShapeOfIce());
        Assertions.assertEquals(ShapeOfIce.TRIANGLE, organizersForTheBar.get(5).getShapeOfIce());
    }


    @Test
    public void testSortByShapeOfIceCompare() {
        BarManagerUtils.sortByShapeOfIceAndPriceInUAH(iceBuckets, SortType.ASCENDING);
        Assertions.assertEquals(ShapeOfIce.STAR, organizersForTheBar.get(0).getShapeOfIce());
        Assertions.assertEquals(ShapeOfIce.SQUAR, organizersForTheBar.get(1).getShapeOfIce());
        Assertions.assertEquals(ShapeOfIce.TRIANGLE, organizersForTheBar.get(2).getShapeOfIce());
        Assertions.assertEquals(ShapeOfIce.SQUAR, organizersForTheBar.get(3).getShapeOfIce());
        Assertions.assertEquals(ShapeOfIce.STAR, organizersForTheBar.get(4).getShapeOfIce());
        Assertions.assertEquals(ShapeOfIce.TRIANGLE, organizersForTheBar.get(5).getShapeOfIce());


    }
}
