package ua.lviv.iot.stuffForBar.manager;

import java.util.LinkedList;
import java.util.List;

import ua.lviv.iot.stuffForBar.model.AbstractBar;

public class BarManager {
    private List<AbstractBar> stuffs = new LinkedList<AbstractBar>();

    public void addStuffs(List<AbstractBar> stuffs) {
        this.stuffs.addAll(stuffs);
    }

    public List<AbstractBar> findStuffByShapeOfIceT(int priceInUAH) {

        List<AbstractBar> result = new LinkedList<AbstractBar>();
        for (AbstractBar stuff : stuffs) {
            if (stuff.getPriceInUAH() > priceInUAH) {
                result.add(stuff);
            }
        }
        return result;as
    }
}

