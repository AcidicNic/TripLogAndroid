package com.snekek.triplog.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.snekek.triplog.R;

import java.util.ArrayList;

public class NoteAdapter extends RecyclerView.Adapter<NoteAdapter.NoteViewHolder> {
    Context context;
    ArrayList<String> noteList;
    ArrayList<String> timestampList;
    public class NoteViewHolder extends RecyclerView.ViewHolder {
        public TextView note;
        public TextView timestamp;

        public NoteViewHolder(View v) {
            super(v);
            note = (TextView) v.findViewById(R.id.note);
            timestamp = (TextView) v.findViewById(R.id.timestamp);
        }
    }
    public NoteAdapter(Context context, ArrayList<String> notes, ArrayList<String> timestamps) {
        this.context = context;
        this.noteList = notes;
        this.timestampList = timestamps;
    }

    @Override
    public NoteAdapter.NoteViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.note_list, viewGroup, false);
        NoteViewHolder vh = new NoteViewHolder(itemView);
        return vh;
    }

    @Override
    public void onBindViewHolder(NoteViewHolder vh, int position) {
        vh.note.setText(noteList.get(position));
        vh.timestamp.setText(timestampList.get(position));
    }

    @Override
    public int getItemCount() {
        return noteList.size();
    }
}