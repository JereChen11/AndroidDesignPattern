package com.example.androiddesignpattern.observerPattern.functiontwo;

import android.os.Handler;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jere
 */
public class GameScoreData implements GameScoreSubject {
    private String mLakerTeamScore;
    private String mBostonTeamScore;
    private List<GameScoreObserver> mGameObserverList;

    public GameScoreData() {
        mGameObserverList = new ArrayList<>();
    }

    public String getLakerTeamScore() {
        return mLakerTeamScore;
    }

    public void setLakerTeamScore(String lakerTeamScore) {
        this.mLakerTeamScore = lakerTeamScore;
    }

    public String getBostonTeamScore() {
        return mBostonTeamScore;
    }

    public void setBostonTeamScore(String bostonTeamScore) {
        this.mBostonTeamScore = bostonTeamScore;
    }

    public void setTwoTeamScores() {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                setLakerTeamScore("102");
                setBostonTeamScore("99");
                notifyAllObserver();
            }
        }, 3000);
    }


    @Override
    public void addObserver(GameScoreObserver gameScoreObserver) {
        if (!mGameObserverList.contains(gameScoreObserver)) {
            mGameObserverList.add(gameScoreObserver);
        }
    }

    @Override
    public void removeObserver(GameScoreObserver gameScoreObserver) {
        if (mGameObserverList.contains(gameScoreObserver)) {
            mGameObserverList.remove(gameScoreObserver);
        }
    }

    @Override
    public void notifyAllObserver() {
        for (GameScoreObserver gameScoreObserver : mGameObserverList) {
            gameScoreObserver.scoreChanged(mLakerTeamScore, mBostonTeamScore);
        }
    }
}
