package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Random;

public class Guslya extends Character {
    Logger logger = LogManager.getLogger(Guslya.class);
    private ArrayList<Instrument> instruments = new ArrayList<>();

    public Guslya(Place residents) {
        super("Музыкант", Gender.MALE, residents, "Гусля");
        int count = (int) (Math.random() * 4);
        for (int i = 0; i < count; i++){
            instruments.add(getRandomInstrument());
        }
    }
    private Instrument getRandomInstrument(){
        Random random = new Random();
        int randomIndex = random.nextInt(Instrument.values().length);
        return Instrument.values()[randomIndex];
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

    public boolean isPlayInstrument(Instrument instrument) {
        if (instruments.contains(instrument)) {
            logger.info("{} умеет играть на {}", this.name, instrument.getName());
            return true;
        } else {
            logger.warn("{} не умеет играть на {}", this.name, instrument.getName());
            return false;
        }
    }

    public void play() {

    }
}
