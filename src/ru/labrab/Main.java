package ru.labrab;

public class Main {

    public static void main(String[] args) {
        AbstractFactory fordFactory = new FordFactory();
        AbstractFactory bmwFactory = new BMWFactory();

        AbstractMinivan fordMinivan = fordFactory.createMinivan();
        AbstractSedan fordSedan1 = fordFactory.createSedan();
        AbstractSedan fordSedan2 = fordFactory.createSedan();
        AbstractMinivan bmwMinivan = bmwFactory.createMinivan();
        AbstractSedan bmwSedan1 = bmwFactory.createSedan();
        AbstractSedan bmwSedan2 = bmwFactory.createSedan();

    }
}
