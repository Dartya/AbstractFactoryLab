package ru.labrab;

public interface AbstractFactory {
    AbstractSedan createSedan();
    AbstractMinivan createMinivan();
}
