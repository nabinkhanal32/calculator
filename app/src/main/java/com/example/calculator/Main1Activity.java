package com.example.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main1Activity  extends AppCompatActivity implements View.OnClickListener {
    private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    private Button btnEqual , btnadd, btnsub,btndiv,btnmul,btnpoint;
    EditText etview;

    boolean addBoolean, subBoolean;
    float value1, value2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnpoint = findViewById(R.id.btnpoint);
        btnEqual = findViewById(R.id.btnequal);
        btnadd = findViewById(R.id.btnadd);
        btnsub = findViewById(R.id.btnsub);
        btnmul = findViewById(R.id.btnMul);
        btndiv = findViewById(R.id.btnDiv);



    }



    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.btn1:
                etview.setText(etview.getText().toString() + "1");
                break;

            case R.id.btn2:
                etview.setText(etview.getText().toString() + "2");
                break;
            case R.id.btn3:
                etview.setText(etview.getText().toString() + "3");
                break;

            case R.id.btn4:
                etview.setText(etview.getText().toString() + "4");
                break;

            case R.id.btn5:
                etview.setText(etview.getText().toString() + "5");
                break;

            case R.id.btn6:
                etview.setText(etview.getText().toString() + "6");
                break;
            case R.id.btn7:
                etview.setText(etview.getText().toString() + "7");
                break;

            case R.id.btn8:
                etview.setText(etview.getText().toString() + "8");
                break;
            case R.id.btn9:
                etview.setText(etview.getText().toString() + "9");
                break;

            case R.id.btnpoint:
                etview.setText(etview.getText().toString() + ".");
                break;

            case R.id.btnadd:
                if (etview == null)
                {
                    etview.setText("");


                }
                else {
                    value1 = Float.parseFloat(etview.getText().toString());
                    addBoolean = true;
                    etview.setText("");
                }
                break;

            case R.id.btnsub:
                if (etview == null)
                {
                    etview.setText("");


                }
                else {
                    value1 = Float.parseFloat(etview.getText().toString());
                    addBoolean = true;
                    etview.setText("");
                }
                break;
            case R.id.btnMul:
                if (etview == null)
                {
                    etview.setText("");


                }
                else {
                    value1 = Float.parseFloat(etview.getText().toString());
                    addBoolean = true;
                    etview.setText("");
                }
                break;
            case R.id.btnDiv:
                if (etview == null)
                {
                    etview.setText("");


                }
                else {
                    value1 = Float.parseFloat(etview.getText().toString());
                    addBoolean = true;
                    etview.setText("");
                }
                break;
            case R.id.btnequal:
                value2 = Float.parseFloat(etview.getText().toString());
            if (addBoolean)
            {
                etview.setText(value1+value2 +"");


            }
            else {


                etview.setText( value1 - value2 +"");
            }
            break;

        }
    }
}
