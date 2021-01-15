package com.example.gst_application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView text_gst_amount, text_total_amount;
EditText text_amount, text_gst_percent;
Button btn_calculate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text_amount=findViewById(R.id.text_amount);
        text_gst_amount=findViewById(R.id.text_gst_amount);
        text_gst_percent=findViewById(R.id.text_gst_percent);
        text_total_amount=findViewById(R.id.text_total_amount);
        btn_calculate=findViewById(R.id.btn_calculate);

        btn_calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float total =Float.parseFloat(text_amount.getText().toString());
                float gst_percent = Float.parseFloat(text_gst_percent.getText().toString());
                float gst_amount= (gst_percent/100)* total;
                text_gst_amount.setText("GST amount is:" + gst_amount);
                float total_amount=total+gst_amount;
                text_total_amount.setText("Total amount: "+ total_amount);
            }
        });
    }
}