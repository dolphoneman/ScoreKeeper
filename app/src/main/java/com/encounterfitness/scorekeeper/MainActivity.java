package com.encounterfitness.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int redTeamScore = 0;
    int blueTeamScore = 0;

    TextView winnerRedTextView;
    TextView winnerBlueTextView;
    TextView scoreViewRed;
    TextView scoreViewBlue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        winnerRedTextView = findViewById(R.id.redTeamWin);
        winnerBlueTextView = findViewById(R.id.blueTeamWin);
        scoreViewRed = findViewById(R.id.red_team_score);
        scoreViewBlue = findViewById(R.id.blue_team_score);
    }

     /** Updated method to go from two methods to one when determining the winner
     * @param winnerRed if red team wins
     * @param winnerBlue if blue team wins
     */
    public void displayWinner(String winnerRed, String winnerBlue){
        if (winnerRed.equals("WINNER")){
            winnerRedTextView.setText(String.valueOf(winnerRed));
        }

        else {
            if (winnerBlue.equals("WINNER")) {
                winnerBlueTextView.setText(String.valueOf(winnerBlue));}
        }
    }

    /**
     * Displays the given score for the Red Team.
     * Check to see if the Red team has 15 or more point for the win.
     */
    public void displayForRedTeam(int score) {
        scoreViewRed.setText(String.valueOf(score));

        if (redTeamScore >= 15) {
            displayWinner("WINNER", " ");
        }
    }

    /**
     * Add 3 points to the Red team's score.
     */
    public void ringerForRedTeam(View view) {
        redTeamScore = redTeamScore + 3;
        displayForRedTeam(redTeamScore);
    }

    /**
     * Add 2 points to the Red team's score.
     */
    public void leanerForRedTeam(View view) {
        redTeamScore = redTeamScore + 2;
        displayForRedTeam(redTeamScore);
    }

    /**
     * Add 1 point to Red team's score.
     */
    public void closestToPinRedTeam(View view) {
        redTeamScore = redTeamScore + 1;
        displayForRedTeam(redTeamScore);
    }


    /**
     * Displays the given score for the Blue Team.
     * Check to see if the Blue team has 15 or more point for the win.
     */
    public void displayForBlueTeam(int score) {
        scoreViewBlue.setText(String.valueOf(score));

        if (blueTeamScore >= 15) {
            displayWinner(" ", "WINNER");
        }
    }

    /**
     * Add 3 points to the Blue team's score.
     */
    public void ringerForBlueTeam(View view) {
        blueTeamScore = blueTeamScore + 3;
        displayForBlueTeam(blueTeamScore);
    }

    /**
     * Add 2 points to Blue team's score.
     */
    public void leanerForBlueTeam(View view) {
        blueTeamScore = blueTeamScore + 2;
        displayForBlueTeam(blueTeamScore);
    }

    /**
     * Add 1 point to Blue team's score.
     */
    public void closestToPinBlueTeam(View view) {
        blueTeamScore = blueTeamScore + 1;
        displayForBlueTeam(blueTeamScore);
    }

    /**
     * Reset the scores back to zero and clear the Winner value
     */
    public void resetScores(View view) {
        redTeamScore = 0;
        blueTeamScore = 0;
        displayForRedTeam(redTeamScore);
        displayForBlueTeam(blueTeamScore);
        winnerRedTextView.setText(String.valueOf(" "));
        winnerBlueTextView.setText(String.valueOf(" "));
    }
}
