package com.example.project_bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.widget.ImageView;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        ImageView imgv = findViewById(R.id.imgv);
        TextView text1 = findViewById(R.id.text_result);
        TextView text2 = findViewById(R.id.text_result2);
        Intent intent = getIntent();
        double w = intent.getDoubleExtra("weight", 0);
        double h = intent.getDoubleExtra("height", 0);
        double bmi = w/Math.pow(h/100,2);

        String bmiStr = "";
        int imgSrcId = 0;

        if(bmi < 18.5) {
            bmiStr = "저";
            imgSrcId = R.drawable.BMI1;
        }else if(bmi < 24){
            bmiStr ="정";
            imgSrcId = R.drawable.BMI1;
        }else if(bmi < 30){
            bmiStr ="과";
            imgSrcId = R.drawable.BMI2;
        }else if(bmi < 35){
            bmiStr ="비";
            imgSrcId = R.drawable.BMI2;
        }else if(bmi < 40){
            bmiStr ="고도비만";
            imgSrcId = R.drawable.BMI2;
        }else{
            bmiStr ="초고도비만";
            imgSrcId = R.drawable.BMI2;
        }
        imgv.setImageResource(imgSrcId);
        text1.setText(bmiStr + "체중");
    }
}