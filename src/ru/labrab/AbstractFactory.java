package ru.labrab;

public interface AbstractFactory {
    SUV createSUV ();
    Sedan createSedan();
    Minivan createMinivan();
}
