package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Other extends Human{
    Logger logger = LogManager.getLogger(this.getClass());
    private boolean dreamListeningFlute;

    public Other(Place residence) {
        super("", Gender.MALE, residence);
        this.dreamListeningFlute = Math.random() > 0.5;
    }
    @Override
    public Place getPlace() {
        logger.info("Все в {}", this.residents.streetName());
        return this.residents;
    }

    @Override
    public String walk() {
        return "";
    }

    @Override
    public String eat() {
        return "";
    }

    @Override
    public String sleep() {
        return "";
    }

    public boolean isDreamListeningFlute() {
        if (this.dreamListeningFlute) {
            logger.info("Всем хотелось поскорей послушать игру на флейте, так как все в {} умели играть только на арфах", this.residents.streetName());
            return true;
        }else{
            logger.info("Никто в {} не хотел слушать игру на флейте", this.residents.streetName());
            return false;
        }
    }
}
