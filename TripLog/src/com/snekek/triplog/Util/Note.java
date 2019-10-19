package com.snekek.triplog.Util;

public class Note {
    private String mTimestamp;
    private String mNote;
    // TODO use note object instead of passing timestamp and note separately to the adapter

    private void Note(String timestamp, String note) {
        this.mTimestamp = timestamp;
        this.mNote = note;
    }

    private String getNote() {
        return mNote;
    }
    private void setNote(String newNote) {
        mNote = newNote;
    }
    private String getTimestamp() {
        return mTimestamp;
    }
    private void setTimestamp(String newTimestamp) {
        mTimestamp = newTimestamp;
    }
}
