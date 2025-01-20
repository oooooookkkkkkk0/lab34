package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;

public class Main {
    static Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        Place greenCity = new Place("Зелёный город");
        Place appleSquare = new Place("Яблочная площадь");
        Room room = new Room(appleSquare, true, 2);

        ArrayList<String> pugovkasFriends = new ArrayList<>();
        pugovkasFriends.add("подружки");

        Tubik tubik = new Tubik(appleSquare);
        Guslya guslya = new Guslya(appleSquare);
        Other other = new Other(greenCity);
        Pugovka pugovka = new Pugovka(appleSquare, pugovkasFriends);

        try {
            appleSquare.addResident(guslya);
            appleSquare.addResident(tubik);
            appleSquare.addResident(pugovka);
        }catch (Exception e){
            logger.error(e.getMessage());
            System.exit(0);
        }

        tubik.greet();
        guslya.greet();
        guslya.isPlayInstrument(Instrument.FLUTE);
        other.isDreamListeningFlute();
        tubik.getPlace();
        guslya.getPlace();
        pugovka.getPlace();
        room.numberFloor();
        room.haveWindow();
        tubik.isLikeRoom(room);
    }
}