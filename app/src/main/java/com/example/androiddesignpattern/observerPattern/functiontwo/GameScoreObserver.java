package com.example.androiddesignpattern.observerPattern.functiontwo;

/**
 * @author jere
 */
public interface GameScoreObserver {
    void scoreChanged(String lakerTeamScores, String bostonTeamScores);
}
