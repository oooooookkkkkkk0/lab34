package org.example;

public class WrongAmountOfResidentsException extends Exception{
    private Place place;
    public WrongAmountOfResidentsException(Place place){
        this.place = place;
    }
    @Override
    public String getMessage(){
        return "Слишком много жильцов в " + place.getName();
    }
}
