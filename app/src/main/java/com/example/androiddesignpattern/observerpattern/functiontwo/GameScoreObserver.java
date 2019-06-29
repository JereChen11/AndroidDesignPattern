package com.example.androiddesignpattern.observerpattern.functiontwo;

/**
 * @author jere
 */
public interface GameScoreObserver {
    void scoreChanged(String lakerTeamScores, String bostonTeamScores);
}
