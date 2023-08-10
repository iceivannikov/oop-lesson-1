package com.ivannikov.oop.lesson17SolarSystem.enam.solarsystem;

import com.ivannikov.oop.lesson17SolarSystem.enam.TypeHeavenlyBody;

import static com.ivannikov.oop.lesson17SolarSystem.enam.TypeHeavenlyBody.*;

public enum Sun  {
    SUN(STAR, 1.98892, 696340, 5772);

    public final TypeHeavenlyBody type;
    public final double mass;
    public final double radius;
    public final double temperature;

    Sun(TypeHeavenlyBody type, double mass, double radius, double temperature) {
        this.type = type;
        this.mass = mass;
        this.radius = radius;
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "Sun{" +
                "type=" + type +
                ", mass=" + mass +
                ", radius=" + radius +
                ", temperature=" + temperature +
                '}';
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

