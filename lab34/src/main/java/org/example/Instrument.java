package org.example;

public enum Instrument {
    FLUTE("флейта"),
    HARP("арфа"),
    PIANO("пианино");

    private final String name;
    Instrument(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
