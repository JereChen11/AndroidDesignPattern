package com.example.androiddesignpattern.observerPattern.functiontwo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.androiddesignpattern.R;

/**
 * @author jere
 */
public class FunctionTwoActivity extends AppCompatActivity implements GameScoreObserver {
    private TextView mLakerTeamScoreTv;
    private TextView mBostonTeamScoreTv;
    private TextView mEspnReportTv;
    private GameScoreData mGameScoreData;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mLakerTeamScoreTv = findViewById(R.id.laker_score_tv);
        mBostonTeamScoreTv = findViewById(R.id.boston_score_tv);
        mEspnReportTv = findViewById(R.id.espn_media_tv);

        mGameScoreData = new GameScoreData();
        mGameScoreData.addObserver(this);

        ESPNMediaScoreObserver espnMediaScoreObserver = new ESPNMediaScoreObserver();
        mGameScoreData.addObserver(espnMediaScoreObserver);

        mGameScoreData.setTwoTeamScores();
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        mGameScoreData.removeObserver(this);
    }

    @Override
    public void scoreChanged(String lakerTeamScores, String bostonTeamScores) {
        mLakerTeamScoreTv.setText(lakerTeamScores);
        mBostonTeamScoreTv.setText(bostonTeamScores);
    }

    public class ESPNMediaScoreObserver implements GameScoreObserver {

        @Override
        public void scoreChanged(String lakerTeamScores, String bostonTeamScores) {
            String newestReportString = "newest scores: \nLaker: " + lakerTeamScores
                    + " vs " + "Boston: " + bostonTeamScores + " \nKobe three ball killed game!!\nOMG!";
            mEspnReportTv.setText(newestReportString);
        }
    }
}
