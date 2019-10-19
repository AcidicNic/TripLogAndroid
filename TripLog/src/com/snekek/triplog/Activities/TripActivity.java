package com.snekek.triplog.Activities;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.snekek.triplog.R;
import com.snekek.triplog.Adapters.NoteAdapter;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class TripActivity extends AppCompatActivity {
    private Button add;
    private ImageButton submit;
    private EditText inputText;
    private ArrayList<String> timestamps;
    private ArrayList<String> notes;
    private RecyclerView.Adapter mAdapter;


    private void setup() {
        add = (Button) findViewById(R.id.addActivity);
        inputText = (EditText) findViewById(R.id.inputText);
        submit = (ImageButton) findViewById(R.id.submit);
        timestamps = new ArrayList<>();
        notes = new ArrayList<>();

        inputText.setVisibility(View.INVISIBLE);
        submit.setVisibility(View.INVISIBLE);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        mAdapter = new NoteAdapter(this ,notes, timestamps);
        recyclerView.setAdapter(mAdapter);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.triplog_main);

        setup();
        btnListener();
    }

    //  TODO RecyclerView Java

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

                Calendar calendar = Calendar.getInstance();
                SimpleDateFormat hmsFormat = new SimpleDateFormat("HH:mm");

                notes.add(inputText.getText().toString());
                timestamps.add(hmsFormat.format(calendar.getTime()));

                mAdapter.notifyDataSetChanged();
                inputText.getText().clear();
            }
        });
    }
}