package ru.ssau.tk.Gumirishche.Practic.Collection;

import ru.ssau.tk.Gumirishche.Practic.Collection.Location;
import ru.ssau.tk.Gumirishche.Practic.Collection.Settlement;

public class Waypoint extends Location {
    private WaypointType type;
    private Settlement settlement;

    public Settlement getSettlement() {
        return settlement;
    }

    public WaypointType getType() {
        return type;
    }

    public void setSettlement(Settlement settlement) {
        this.settlement = settlement;
    }

    public void setType(WaypointType type) {
        this.type = type;
    }
}
