package com.kevinhodges;

import java.text.SimpleDateFormat;

public class Babysitter {

    private static final String TAG = "Babysitter";
    int dayRate = 12;
    int afterBedRate = 8;
    int lateRate = 16;
    int shiftLengthMax = 11;
    int shiftLengthMin = 1;
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH");

    public static void main(String[] args) {
    }

    public int calculateShiftLength(long startingTime, long quittingTime) {

        int shiftLengthHours = 0;

        return shiftLengthHours;
    }

    public int getDayRate() {
        return dayRate;
    }

    public int getAfterBedRate() {
        return afterBedRate;
    }

    public int getLateRate() {
        return lateRate;
    }

    public int getShiftLengthMax() {
        return shiftLengthMax;
    }

    public int getShiftLengthMin() {
        return shiftLengthMin;
    }
}
