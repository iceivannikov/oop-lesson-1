package com.ivannikov.lesson17SolarSystem;

import com.ivannikov.lesson17SolarSystem.enam.NameHeavenlyBody;
import com.ivannikov.lesson17SolarSystem.enam.TypeHeavenlyBody;

public abstract class HeavenlyBody {
    protected NameHeavenlyBody name;
    protected TypeHeavenlyBody type;
    protected double mass;
    protected double radius;
    protected double temperature;

    protected HeavenlyBody(NameHeavenlyBody name, TypeHeavenlyBody type, double mass, double radius, double temperature) {
        this.name = name;
        this.type = type;
        this.mass = mass;
        this.radius = radius;
        this.temperature = temperature;
    }

    public NameHeavenlyBody getName() {
        return name;
    }

    public TypeHeavenlyBody getType() {
        return type;
    }

    public double getMass() {
        return mass;
    }

    public double getRadius() {
        return radius;
    }

    public double getTemperature() {
        return temperature;
    }
}
