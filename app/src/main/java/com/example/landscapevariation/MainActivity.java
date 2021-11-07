package com.example.landscapevariation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    EditText cash, loan, silver, gold, tax, borrow;
    TextView zakatpayable;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cash =  (EditText)findViewById(R.id.inhand);
        loan = (EditText)findViewById(R.id.loan);
        silver = (EditText)findViewById(R.id.silver);
        gold = (EditText)findViewById(R.id.gold);
        tax = (EditText)findViewById(R.id.tax);
        borrow = (EditText)findViewById(R.id.borrow);
        btn=findViewById(R.id.ok);
        zakatpayable = findViewById(R.id.result);
    }
    public void onClick(View v)
    {
        try {

            int result; double totalZakat;
            result = Integer.parseInt(cash.getText().toString()) + Integer.parseInt(loan.getText().toString()) + Integer.parseInt(silver.getText().toString()) +
                    Integer.parseInt(gold.getText().toString()) - Integer.parseInt(tax.getText().toString()) - Integer.parseInt(borrow.getText().toString());


            totalZakat = (result* 2.5) / 100;
            zakatpayable.setText(String.valueOf("Rs : "+totalZakat));
        }
        catch (Exception e){
            zakatpayable.setText("You missed the field");

        }

    }
}