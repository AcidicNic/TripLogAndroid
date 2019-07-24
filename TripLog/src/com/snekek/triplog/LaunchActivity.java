package com.snekek.triplog;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class LaunchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.launch_menu);
        buttons();
    }

    private void buttons() {
        Button gotoArchive = (Button) findViewById(R.id.gotoArchive);
        Button gotoNewTrip = (Button) findViewById(R.id.gotoNewTrip);
        gotoNewTrip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LaunchActivity.this, TripActivity.class));
            }
        });

        gotoArchive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                startActivity(new Intent(LaunchActivity.this, [whatever i call it].class));
            }
        });
    }
}
