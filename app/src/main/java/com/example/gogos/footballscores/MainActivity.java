package com.example.gogos.footballscores;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int scoreForTeamA = 0;
    private int scoreForTeamB = 0;
    private int foulForTeamA = 0;
    private int foulForTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goalForTeamA(View view) {
        scoreForTeamA++;
        displayForTeamA(scoreForTeamA);
    }

    public void goalForTeamB(View view) {
        scoreForTeamB++;
        displayForTeamB(scoreForTeamB);
    }
    public void foulForTeamA(View view)
    {
        foulForTeamA++;
        displayFoulForTeamA(foulForTeamA);
    }
    public void foulForTeamB(View view)
    {
        foulForTeamB++;
        displayFoulForTeamB(foulForTeamB);
    }

    public void resetForAll(View view) {
        scoreForTeamA = 0;
        scoreForTeamB = 0;
        foulForTeamA = 0;
        foulForTeamB = 0;
        displayForTeamA(scoreForTeamA);
        displayForTeamB(scoreForTeamB);
        displayResult("");
        displayFoulForTeamB(foulForTeamB);
        displayFoulForTeamA(foulForTeamA);
    }

    public void resultForAll(View view) {
        if (scoreForTeamA > scoreForTeamB) {
            displayResult("team a win the match");
        } else if (scoreForTeamA < scoreForTeamB) {
            displayResult("team b win the match");
        } else {
            displayResult("draw");
        }
    }

    private void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    private void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    private void displayFoulForTeamA(int foul) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_foul);
        scoreView.setText(String.valueOf(foul));
    }

    private void displayFoulForTeamB(int foul) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_foul);
        scoreView.setText(String.valueOf(foul));
    }

    private void displayResult(String score) {
        TextView scoreView = (TextView) findViewById(R.id.win_team);
        scoreView.setText(String.valueOf(score));
    }
}

