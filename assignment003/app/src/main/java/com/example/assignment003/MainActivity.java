package com.example.assignment003;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);

        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent myIntent = new Intent(Settings.ACTION_BLUETOOTH_SETTINGS);
                MainActivity.this.startActivity(myIntent);
            }
        });

        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                Intent myIntent = new Intent(Settings.ACTION_BLUETOOTH_SETTINGS);
                MainActivity .this.startActivity(myIntent);
            break;
            case R.id.button2:
                Intent myIntent2 = new Intent(Settings.ACTION_SOUND_SETTINGS);
                MainActivity .this.startActivity(myIntent2);
                break;
            case R.id.button3:
                Intent myIntent3 = new Intent(Settings.ACTION_VOICE_INPUT_SETTINGS);
                MainActivity .this.startActivity(myIntent3);                break;
            case R.id.button4:
                Intent myIntent4 = new Intent(Settings.ACTION_DATE_SETTINGS);
                MainActivity .this.startActivity(myIntent4);
                break;
            case R.id.button5:
                Toast.makeText(this, "Button 5 clicked", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}