package org.example;

public abstract class Human implements Life{
    protected final String profession;
    protected final Gender gender;
    protected Place residents;

    protected Human(String profession, Gender gender, Place residents) {
        this.profession = profession;
        this.gender = gender;
        this.residents = residents;
    }
}
