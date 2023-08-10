package com.ivannikov.oop.lesson17SolarSystem;

import com.ivannikov.oop.lesson17SolarSystem.enam.NameHeavenlyBody;
import com.ivannikov.oop.lesson17SolarSystem.enam.TypeHeavenlyBody;

public class Sun extends HeavenlyBody{

    protected Sun(NameHeavenlyBody name, TypeHeavenlyBody type, double mass, double radius, double temperature) {
        super(name, type, mass, radius, temperature);
    }
}
