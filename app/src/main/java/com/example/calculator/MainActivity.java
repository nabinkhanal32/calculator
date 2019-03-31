package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
    private Button btnPoint;
    private TextView tvOutput;
    private String display = "";
    private String currentOperator = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvOutput = (TextView) findViewById(R.id.tvoutput);
        tvOutput.setText(display);

        btnPoint = findViewById(R.id.btn13);
        btnPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display = tvOutput.getText() + ".";
                updateScreen();
            }
        });

    }

        private void updateScreen(){
            tvOutput.setText(display);
        }
    public void onClickNumber(View v){
        Button b = (Button) v;
        display += b.getText();
        updateScreen();
    }
    public void onClickOperator(View v){
        Button b = (Button) v;
        display += b.getText();
        currentOperator = b.getText().toString();
        updateScreen();
    }
    public void onClickClear(View v){
        display = "";
        currentOperator = "";
        updateScreen();
    }
    public double operate(String a, String b, String op){
        switch (op){
            case "+": return Double.valueOf(a) + Double.valueOf(b);
            case "-": return Double.valueOf(a) - Double.valueOf(b);
            case "*": return Double.valueOf(a) * Double.valueOf(b);
            case "/": return Double.valueOf(a) / Double.valueOf(b);

            default: return -1;
        }

    }
    public void onClickEquals(View v){
        String[] operation = display.split(Pattern.quote(currentOperator));
        if (operation.length < 2) return;

        Double result = operate(operation[0], operation[1] , currentOperator);
        tvOutput.setText(display + "\n" + String.valueOf(result));
    }


}
