package com.example.android.educationalquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.TextView;
import java.text.NumberFormat;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import java.text.NumberFormat;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
public class educationalQuiz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_educational_quiz);
    }
        int numberRight = 0;
        boolean columbus = false;
        boolean firstMath = false;
        boolean secondMath = false;
        boolean russia = false;
        boolean killian = false;
        boolean element = false;



        private void done(View view) {
            TextView name1 = (TextView) findViewById(R.id.answer1492);
            String answer1492 = "" + name1.getText();
            if (answer1492.equals("1492")) {
                columbus = true;
                numberRight++;
            }

            //displayAnswer("columbusQ","Question 1: What year did Columbus sail the ocean blue?"+columbus+"" );

            TextView name2 = (TextView) findViewById(R.id.answer2);
            String answer2 = "" + name2.getText();
            if (answer2.equals("2")){
                firstMath = true;
                numberRight++;
            }
            TextView name3 = (TextView) findViewById(R.id.answer4);
            String answer4 = "" + name3.getText();
            if (answer4.equals("4")){
                secondMath = true;
                numberRight++;
            }

            TextView name4 = (TextView) findViewById(R.id.answerStacy);
            String answerStacy = "" + name4.getText();
            if (answerStacy.equals("Stacy"))
                killian = true;{
                numberRight++;
            }
            TextView name5 = (TextView) findViewById(R.id.answerHydrogen);
            String answerHydrogen = "" + name5.getText();
            if (answerHydrogen.equals("Hydrogen")){
                element = true;
                numberRight++;
            }

            TextView name6 = (TextView) findViewById(R.id.answerRussia);
            String answerRussia = "" + name6.getText();
            if (answerRussia.equals("Russia")){
                russia = true;
                numberRight++;
            }

            display1492();
            displayMath1();
            displayMath2();
            displayRussia();
            displayHydrogen();
            displayStacy();

            TextView outTextView = (TextView) findViewById(R.id.doneB);
            outTextView.setText("Number Correct: "+numberRight);
        }
   /* private void display(String textId, String answerPrompt) {
        TextView qTextView = (TextView) findViewById(R.id.textId);
        qTextView.setText(answerPrompt);
    }
*/
    private void display1492(){
        TextView outTextView = (TextView) findViewById(R.id.columbusQ);
        outTextView.setText("Question 1: What year did Columbus sail the ocean blue?"+columbus+"");
    }
    private void displayMath1(){
        TextView outTextView = (TextView) findViewById(R.id.math1Q);
        outTextView.setText("Question 2: What is 1+1?"+firstMath);
    }
    private void displayMath2(){
        TextView outTextView = (TextView) findViewById(R.id.math2Q);
        outTextView.setText("Question 6: What is 8/2?"+secondMath);
    }
    private void displayRussia(){
        TextView outTextView = (TextView) findViewById(R.id.russiaQ);
        outTextView.setText("Question 3: What is the biggest country on Earth?"+russia);
    }
    private void displayHydrogen(){
        TextView outTextView = (TextView) findViewById(R.id.columbusQ);
        outTextView.setText("Question 4: What element has only one proton?"+element);
    }
    private void displayStacy(){
        TextView outTextView = (TextView) findViewById(R.id.columbusQ);
        outTextView.setText("Question 5: What is Killian's last name?"+killian);
    }
    }


