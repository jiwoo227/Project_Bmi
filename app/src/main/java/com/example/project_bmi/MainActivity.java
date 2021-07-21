package com.example.project_bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editW, editH;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editW = findViewById(R.id.weight);
        editH = findViewById(R.id.height);
        Button btnCheck = findViewById(R.id.btn_checked);
        btnCheck.setOnClickListener(btnListener);
    }

    View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            double weight = Double.parseDouble(editW.getText().toString());
            double height = Double.parseDouble(editH.getText().toString());
            Intent intent = new Intent(getApplicationContext(), ResultActivity.class);
            Intent.putExtra("weight", weight);
            Intent.putExtra("height", height);
            startActivity(intent);
        }
    };
}