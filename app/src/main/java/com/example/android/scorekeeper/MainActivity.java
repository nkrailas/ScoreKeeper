package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.scorekeeper.R;

public class MainActivity extends AppCompatActivity {
    // Tracks score for Home.
    int scoreHome = 0;

    //Tracks score for Visitor.
    int scoreVisitor = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForHome(0);
    }

    /**
     * Displays the given score for Home.
     */
    public void displayForHome(int score) {
        TextView scoreView = (TextView) findViewById(R.id.home_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method is called when +3 Points button is clicked for Home.
     */
    public void addThreeForHome(View view) {
        scoreHome = scoreHome + 3;
        displayForHome(scoreHome);
    }

    /**
     * This method is called when the +2 Points button is clicked for Home.
     */
    public void addTwoForHome(View view) {
        scoreHome = scoreHome + 2;
        displayForHome(scoreHome);
    }

    /**
     * This method is called when the Free Throw button is clicked for Home.
     */
    public void addOneForHome(View view) {
        scoreHome = scoreHome + 1;
        displayForHome(scoreHome);
    }

    /**
     * Displays the given score for Visitor.
     */
    public void displayForVisitor(int score) {
        TextView scoreView = (TextView) findViewById(R.id.visitor_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method is called when +3 Points button is clicked for Visitor.
     */
    public void addThreeForVisitor(View view) {
        scoreVisitor = scoreVisitor + 3;
        displayForVisitor(scoreVisitor);
    }

    /**
     * This method is called when the +2 Points button is clicked for Visitor.
     */
    public void addTwoForVisitor(View view) {
        scoreVisitor = scoreVisitor + 2;
        displayForVisitor(scoreVisitor);
    }

    /**
     * This method is called when the Free Throw button is clicked for Visitor.
     */
    public void addOneForVisitor(View view) {
        scoreVisitor = scoreVisitor + 1;
        displayForVisitor(scoreVisitor);
    }

    /**
     * Resets the scores for Team A and Team B to 0.
     */
    public void resetScore(View view) {
        scoreHome = 0;
        scoreVisitor = 0;
        displayForHome(scoreHome);
        displayForVisitor(scoreVisitor);
    }

}


