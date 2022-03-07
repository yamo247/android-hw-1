package com.example.gradecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText num1 = findViewById(R.id.Number1);
        EditText num2 = findViewById(R.id.Number2);
        EditText num3 = findViewById(R.id.Number3);
        EditText num4 = findViewById(R.id.Number4);

        Button cal = findViewById(R.id.Calculate);
        TextView Result = findViewById(R.id.Total);

        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int Number1 = Integer.parseInt(num1.getText().toString());
                int Number2 = Integer.parseInt(num2.getText().toString());
                int Number3 = Integer.parseInt(num3.getText().toString());
                int Number4 = Integer.parseInt(num4.getText().toString());
                int Total = (Number1 + Number2 + Number3 + Number4)/4;
                        Result.setText(Total + "");
            }
        });
    }
}