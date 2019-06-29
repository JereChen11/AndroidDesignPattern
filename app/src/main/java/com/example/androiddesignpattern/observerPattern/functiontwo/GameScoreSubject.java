package com.example.androiddesignpattern.observerPattern.functiontwo;

/**
 * @author jere
 */
public interface GameScoreSubject {
    void addObserver(GameScoreObserver gameScoreObserver);

    void removeObserver(GameScoreObserver gameScoreObserver);

    void notifyAllObserver();
}
