package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;

public class Tubik extends Character{
    Logger logger = LogManager.getLogger(Tubik.class);
    public Tubik(Place residents) {
        super("Художник", Gender.MALE, residents, "Тюбик");
    }

    @Override
    public String walk() {
        return this.name + " вообушевленно ходит";
    }

    @Override
    public String eat() {
        return "";
    }

    @Override
    public String sleep() {
        return "";
    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public String say() {
        return "";
    }

    @Override
    public Place getPlace() {
        logger.info("{} поселился в {}", this.name, this.residents.getName());
        return this.residents;
    }

    public boolean isLikeRoom(Room room) {
        if (room.isWindow()){
            logger.info("{} понравилась комната за то, что она была очень светлая", this.name);
        }else{
            logger.info("{} не понравилась комната, потому что в ней было темно", this.name);
        }
        return room.isWindow();
    }
}
