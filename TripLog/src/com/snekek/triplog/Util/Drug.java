package com.snekek.triplog.Util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Drug {
    private String[] drugsDefault = {"LSD", "Psilocybin", "25i", "Weed", "Alcohol"};
    private ArrayList<String> DRUGS = new ArrayList<>(Arrays.asList(drugsDefault));
    private String drug;

    // constructor
    public void Drug(int drugIndex) {
        this.drug = selectDrug(drugIndex);
    }

    // helper fxn to select from unit list.
    private String selectDrug(int drugIndex) {
        if (drugIndex < DRUGS.size()) {
            return DRUGS.get(drugIndex);
        } else {
            return DRUGS.get(0);
        }
    }

    // return selected drug
    public String toString() {
        return drug;
    }
}

//class LSD extends Drug {}
