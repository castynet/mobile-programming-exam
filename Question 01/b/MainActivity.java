package com.example.nthnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText inputNumber;
    private Button add;
    private TextView answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputNumber = (EditText) findViewById(R.id.editTextNumber);
        add = (Button) findViewById(R.id.button);
        answer = (TextView) findViewById(R.id.textView3);
        add.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int number = Integer.parseInt(inputNumber.getText().toString());
                answer.setText(String.valueOf(sumOfDigitsFrom1ToN(number)));
            }
            int sumOfDigitsFrom1ToN(int n)
            {
                int result = 0;
                for (int x = 1; x <= n; x++)
                    result += sumOfDigits(x);

                return result;
            }

            int sumOfDigits(int x)
            {
                int sum = 0;
                while (x != 0)
                {
                    sum += x % 10;
                    x   = x / 10;
                }
                return sum;
            }

        });
    }
}