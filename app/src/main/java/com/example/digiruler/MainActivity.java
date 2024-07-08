package com.example.digiruler;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button measure_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize the measure button
        measure_btn = findViewById(R.id.measure_btn);

        // Set the click listener for the measure button
        measure_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the InterfaceActivity when the button is clicked
                Intent intent = new Intent(MainActivity.this, InterfaceActivity.class);
                startActivity(intent);
            }
        });
    }
}
