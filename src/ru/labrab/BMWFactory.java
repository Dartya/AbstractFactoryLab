package ru.labrab;

public class BMWFactory implements AbstractFactory {
    String Sedans = "Выпущено седанов Ford: ";
    String Minivans = "Выпущено минивэнов Ford: ";
    static int countSedans = 0;
    static int countMinivans = 0;

    @Override
    public AbstractSedan createSedan() {
        countSedans++;
        System.out.println(Sedans+countSedans);
        return new BMWSedan();
    }

    @Override
    public AbstractMinivan createMinivan() {
        countMinivans++;
        System.out.println(Minivans+countMinivans);
        return new BMWMiniwan();
    }
}
