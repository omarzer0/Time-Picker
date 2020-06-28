package com.azapps.timepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {
    TimePicker timePicker;
    TextView tvHours, tvMinutes;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timePicker = findViewById(R.id.timePicker);
        tvHours = findViewById(R.id.tv_hours);
        tvMinutes = findViewById(R.id.tv_minutes);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String hours = String.valueOf(timePicker.getHour());
                String minutes = String.valueOf(timePicker.getMinute());

                tvHours.setText(hours);
                tvMinutes.setText(minutes);
            }
        });
    }
}