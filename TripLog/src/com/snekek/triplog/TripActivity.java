package com.snekek.triplog;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import java.io.Console;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TripActivity extends AppCompatActivity {
    Button add;
    ImageButton submit;
    EditText inputText;
    TextView timestamp;
    TextView note;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.triplog_main);
        add = (Button) findViewById(R.id.addActivity);
        inputText = (EditText) findViewById(R.id.inputText);
        submit = (ImageButton) findViewById(R.id.submit);
        timestamp = (TextView) findViewById(R.id.timestamp);
        note = (TextView) findViewById(R.id.note);
        inputText.setVisibility(View.INVISIBLE);
        submit.setVisibility(View.INVISIBLE);
        btnListener();
    }

    private void btnListener() {
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputText.setVisibility(View.VISIBLE);
                submit.setVisibility(View.VISIBLE);
                add.setVisibility(View.INVISIBLE);
            }
        });
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputText.setVisibility(View.INVISIBLE);
                submit.setVisibility(View.INVISIBLE);
                add.setVisibility(View.VISIBLE);

                System.out.println(inputText.getText().toString());

                note.setText(inputText.getText());
                inputText.getText().clear();

                Calendar calendar = Calendar.getInstance();
                SimpleDateFormat mdformat = new SimpleDateFormat("HH:mm:ss");

                timestamp.setText(mdformat.format(calendar.getTime()));
            }
        });
    }
}