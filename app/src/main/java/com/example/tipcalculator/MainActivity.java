package com.example.tipcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    DecimalFormat df = new DecimalFormat("#.00");

    public void calculate(View v) {
        EditText bill = (EditText) findViewById(R.id.Bill);
        EditText choice = (EditText) findViewById(R.id.Choice);
        TextView tip = (TextView) findViewById(R.id.Tip);
        TextView total = (TextView) findViewById(R.id.Final);
        double coconut = 9.8;

        try {
            double totalTip = Double.parseDouble(choice.getText().toString().trim());

            totalTip = totalTip / 100;
            double billStart = Double.parseDouble(bill.getText().toString().trim());
            totalTip = totalTip * billStart;

            double finalBill = billStart + totalTip;

            tip.setText("Total Tip: $" + df.format(totalTip));
            total.setText("Total Bill: $" + df.format(finalBill));
        } catch (Exception e) {

            //Toast.makeText(this, "please enter a value into the custom tip box", Toast.LENGTH_SHORT).show();
            choice.setError("please enter a value into the custom tip box");
            choice.requestFocus();
            return;
        }
    }



    public void rating(View v){
        EditText bill = (EditText) findViewById(R.id.Bill);
        EditText choice = (EditText) findViewById(R.id.Choice);
        TextView tip = (TextView)findViewById(R.id.Tip);
        TextView total = (TextView)findViewById(R.id.Final);
        RatingBar rate = (RatingBar) findViewById(R.id.rate);

        float num =  rate.getRating();
        if(num == 0){
            double billStart = Double.parseDouble(bill.getText().toString().trim());
            double totalTip = 0.00 * billStart;
            double finalBill = totalTip + billStart;
            tip.setText("Total Tip: $" + df.format(totalTip));
            total.setText("Total Bill: $" + df.format(finalBill));
        }
        if(num == 1){
            double billStart = Double.parseDouble(bill.getText().toString().trim());
            double totalTip = 0.02 * billStart;
            double finalBill = totalTip + billStart;
            tip.setText("Total Tip: $" + df.format(totalTip));
            total.setText("Total Bill: $" + df.format(finalBill));
        }
        if(num == 2){
            double billStart = Double.parseDouble(bill.getText().toString().trim());
            double totalTip = 0.035* billStart;
            double finalBill = totalTip + billStart;
            tip.setText("Total Tip: $" + df.format(totalTip));
            total.setText("Total Bill: $" + df.format(finalBill));
        }
        if(num == 3){
            double billStart = Double.parseDouble(bill.getText().toString().trim());
            double totalTip = 0.065 * billStart;
            double finalBill = totalTip + billStart;
            tip.setText("Total Tip: $" + df.format(totalTip));
            total.setText("Total Bill: $" + df.format(finalBill));
        }
        if(num == 4){
            double billStart = Double.parseDouble(bill.getText().toString().trim());
            double totalTip = 0.125 * billStart;
            double finalBill = totalTip + billStart;
            tip.setText("Total Tip: $" + df.format(totalTip));
            total.setText("Total Bill: $" + df.format(finalBill));
        }
        if(num == 5){
            double billStart = Double.parseDouble(bill.getText().toString().trim());
            double totalTip = 0.20 * billStart;
            double finalBill = totalTip + billStart;
            tip.setText("Total Tip: $" + df.format(totalTip));
            total.setText("Total Bill: $" + df.format(finalBill));
        }
    }
}

