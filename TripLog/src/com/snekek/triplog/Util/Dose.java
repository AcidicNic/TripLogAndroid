package com.snekek.triplog.Util;

import java.util.Arrays;
import java.util.List;

public class Dose {

    private String[] unitsDefault = {"unknown", "μg", "mg", "g"};
    private List<String> UNITS = Arrays.asList(unitsDefault);
    private String unit;
    private float doseNum;
    private Drug drug;

    // Dose constructor
    public void Dose(float doseNum, int unitIndex, Drug drug) {
        this.doseNum = doseNum;
        this.unit = selectUnit(unitIndex);
        this.drug = drug;
    }

    // returns unit list
    public List<String> getUnitList() {
        return UNITS;
    }

    // add unit to list
    public void addUnit(String mUnit) {
        UNITS.add(mUnit);
        // TODO: save custom units to account
    }

    // get this unit
    public String getUnit() {
        return unit;
    }

    // return '0.00 unit, drug' String
    public String getDose() {
        if
        return String.format("%.2f %s, %s", doseNum, unit, drug.toString());
    }

    // set dose + unit
    public void setDose(float doseNum, int unitIndex) {
        this.doseNum = doseNum;
        this.unit = selectUnit(unitIndex);
    }

    // helper fxn to select from unit list.
    private String selectUnit(int unitIndex) {
        try {
            return UNITS.get(unitIndex);
        } catch(Exception e) {
            return UNITS.get(0);
        }
    }
}
