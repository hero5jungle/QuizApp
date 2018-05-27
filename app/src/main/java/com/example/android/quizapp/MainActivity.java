package com.example.android.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Check for Quiz Answers
        RadioButton answer1A = (RadioButton) findViewById(R.id.answer_1a);
        RadioButton answer1B = (RadioButton) findViewById(R.id.answer_1b);
        final RadioButton answer1C = (RadioButton) findViewById(R.id.answer_1c);
        RadioButton answer1D = (RadioButton) findViewById(R.id.answer_1d);
        final RadioButton answer2A = (RadioButton) findViewById(R.id.answer_2a);
        RadioButton answer2B = (RadioButton) findViewById(R.id.answer_2b);
        RadioButton answer2C = (RadioButton) findViewById(R.id.answer_2c);
        final RadioButton answer3A = (RadioButton) findViewById(R.id.answer_3a);
        RadioButton answer3B = (RadioButton) findViewById(R.id.answer_3b);
        RadioButton answer3C = (RadioButton) findViewById(R.id.answer_3c);
        RadioButton answer3D = (RadioButton) findViewById(R.id.answer_3d);
        final RadioButton answer4A = (RadioButton) findViewById(R.id.answer_4a);
        RadioButton answer4B = (RadioButton) findViewById(R.id.answer_4b);
        RadioButton answer4C = (RadioButton) findViewById(R.id.answer_4c);
        RadioButton answer4D = (RadioButton) findViewById(R.id.answer_4d);
        final RadioButton answer5A = (RadioButton) findViewById(R.id.answer_5a);
        RadioButton answer5B = (RadioButton) findViewById(R.id.answer_5b);
        RadioButton answer5C = (RadioButton) findViewById(R.id.answer_5c);

//        Final Score Message
        final String part1 = getResources().getString(R.string.score1);
        final String part2 = getResources().getString(R.string.score2);

//        EditText User Answer
        final EditText simpleEditText = (EditText) findViewById(R.id.edit_text);

//        CheckBox
        final CheckBox checkBox1 = (CheckBox) findViewById(R.id.check_box1);
        final CheckBox checkBox2 = (CheckBox) findViewById(R.id.check_box2);
        final CheckBox checkBox3 = (CheckBox) findViewById(R.id.check_box3);
        final CheckBox checkBox4 = (CheckBox) findViewById(R.id.check_box4);

//        Submit Button
        Button submit = (Button) findViewById(R.id.submit_button);

//        Calculate Score

        submit.setOnClickListener(new View.OnClickListener() {
            int score = 0;

            @Override
            public void onClick(View v) {

                if (answer1C.isChecked()) {
                    score += 1;
                }
                if (answer2A.isChecked()) {
                    score += 1;
                }
                if (answer3A.isChecked()) {
                    score += 1;
                }
                if (answer4A.isChecked()) {
                    score += 1;
                }
                if (answer5A.isChecked()) {
                    score += 1;
                }
                if (simpleEditText.getText().toString().trim().equalsIgnoreCase((getString(R.string.favColor)))) {
                    score += 1;
                } else {
                    simpleEditText.setText(getString(R.string.reset));
                }

                if (checkBox1.isChecked() && checkBox2.isChecked() && checkBox3.isChecked() && checkBox4.isChecked()) {
                    score += 1;
                }
                Toast.makeText(getApplicationContext(), part1 + " " + score + " " + part2, Toast.LENGTH_SHORT).show();
                score = 0;
            }
        });
    }
}