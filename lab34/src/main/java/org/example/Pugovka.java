package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;

public class Pugovka extends Character {
    Logger logger = LogManager.getLogger(Pugovka.class);
    private ArrayList<String> friends;

    public Pugovka(Place residents, ArrayList<String> friends) {
        super("Малышка", Gender.FEMALE, residents, "Пуговка");
        this.friends = friends;
    }

    public void addFriend(String friend) {
        friends.add(friend);
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
    public Place getPlace() {
        try {
            logger.info("{} {} жила в {} с {}", this.profession, this.name, this.residents.getName(), this.friends.getFirst());
        } catch (NullPointerException e) {
            logger.warn("{} жила одна", this.name);
        }
        return this.residents;
    }

    public ArrayList<String> getFriends() {
        return friends;
    }
}
