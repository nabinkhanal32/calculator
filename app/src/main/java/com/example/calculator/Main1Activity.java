package com.example.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main1Activity  extends AppCompatActivity implements View.OnClickListener {
    private Button btn1,btn2;
    private Button btnEqual , btnadd, btnsub;
    EditText etview;

    boolean addBoolean, subBoolean;
    float value1, value2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btnEqual = findViewById(R.id.btnequal);
        btnadd = findViewById(R.id.btnadd);
        btnsub = findViewById(R.id.btnsub);


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
            case R.id.btnequal:
                value2 = Float.parseFloat(etview.getText().toString());
            if (addBoolean)
            {
                etview.setText(value1+value2 +"");


            }
            else {


                etview.setText( value1+ value2 +"");
            }
            break;

        }
    }
}
