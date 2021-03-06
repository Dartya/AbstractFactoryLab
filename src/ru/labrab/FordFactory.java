package ru.labrab;

public class FordFactory implements AbstractFactory{
    String Sedans = "Выпущено седанов Ford: ";
    String Minivans = "Выпущено минивэнов Ford: ";
    static int countSedans = 0;
    static int countMinivans = 0;

    @Override
    public FordSedan createSedan() {
        countSedans++;
        System.out.println(Sedans+countSedans);
        return new FordSedan();
    }

    @Override
    public FordMinivan createMinivan() {
        countMinivans++;
        System.out.println(Minivans+countMinivans);
        return new FordMinivan();
    }
}