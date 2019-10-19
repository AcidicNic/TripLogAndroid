package com.snekek.triplog.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.snekek.triplog.R;
import com.snekek.triplog.Util.Dose;
import com.snekek.triplog.Util.Drug;
import com.snekek.triplog.Util.Trip;

import androidx.appcompat.app.AppCompatActivity;


//This is advanced mode, TODO currentlyTripping = simplified. one question at a time > boring looking form.
public class NewTripActivity extends AppCompatActivity implements View.OnFocusChangeListener {

    private Button gotoTrip;
    private EditText titleText;
    private EditText drugText;
    private Trip currentTrip;
    private Dose[] doses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_trip);
        listeners();
    }

//  TODO Create Trip object
//  TODO trip

    private void listeners() {

        gotoTrip = (Button) findViewById(R.id.gotoTrip);
        titleText = (EditText) findViewById(R.id.titleEditText);
        drugText = (EditText) findViewById(R.id.drugEditText);
        gotoTrip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NewTripActivity.this, TripActivity.class));
            }
        });
    }


    @Override
    public void onFocusChange(View v, boolean hasFocus) {
//        if(v.getId() == R.id.whatever) {
//            if (!hasFocus) {
//            }
//        }
        saveData();
    }

    private void saveData() {
        // TODO save shit here

    }

}

//  TODO access @strings.xml; change "skip"-->"begin" and btn color to green;