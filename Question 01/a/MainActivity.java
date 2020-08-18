package com.example.getgrade;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText inputNumber;
    private Button getGrade;
    private TextView answerGrade;
    private EditText inputName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputGrade = (EditText) findViewById(R.id.textView1);
        inputName = (EditText) findViewById(R.id.textView2);
        getGrade = (Button) findViewById(R.id.button);
        answerGrade = (TextView) findViewById(R.id.textView3);

        getGrade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int inputGrade = Integer.parseInt(inputNumber.getText().toString());
                String grade;
                if (inputGrade >= 75 && inputGrade < 100) {
                    grade = "A";
                } else if (inputGrade >= 65 && inputGrade < 74) {
                    grade = "B";
                } else if (inputGrade >= 50 && inputGrade < 64) {
                    grade = "C";
                } else {
                    grade = "Fail";
                }
                answerGrade.setText(inputName + "your grade is a" + grade);

            }

        });
    }
}