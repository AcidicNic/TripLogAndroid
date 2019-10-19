package com.snekek.triplog.Util;

public class Trip {
    private String title;
    private Drug drug;
    private Dose dose;
    private Account user;

    public void Trip(String title, Drug drug, Dose dose, Account user) {
        this.title = title;
        this.drug = drug;
        this.dose = dose;
        this.user = user;
    }
}
