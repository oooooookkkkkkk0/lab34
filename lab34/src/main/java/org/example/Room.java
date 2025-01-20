package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public record Room(Place place, Boolean window, int floor) {
    static Logger logger = LogManager.getLogger(Room.class);
    public String getPlace() {
        return place.getName();
    }

    public boolean haveWindow() {
        if (window){
            logger.info("В комнате было большое светлое окно во всю стену");
        }else{
            logger.info("Комната была без окон");
        }
        return window;
    }
    public boolean isWindow() {
        return window;
    }

    public void numberFloor() {
        logger.info("Комната была на {} этаже на {}", this.floor, getPlace());
    }
}
