package ru.labrab;

public class FordFactory implements AbstractFactory{
    @Override
    public SUV createSUV() {
        return new SUV();
    }

    @Override
    public Sedan createSedan() {
        return new Sedan();
    }

    @Override
    public Minivan createMinivan() {
        return new Minivan();
    }
}