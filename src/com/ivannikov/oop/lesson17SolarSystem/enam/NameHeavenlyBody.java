package com.ivannikov.lesson17SolarSystem.enam;

public enum NameHeavenlyBody {
    SUN("Sun"),
    MERCURY("Mercury"),
    EARTH("Earth"),
    MARS("Mars"),
    JUPITER("Jupiter"),
    SATURN("Saturn"),
    URANUS("Uranus"),
    NEPTUNE("Neptune");

    private final String name;

    NameHeavenlyBody(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
