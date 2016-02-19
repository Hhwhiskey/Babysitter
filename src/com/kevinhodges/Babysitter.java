package com.kevinhodges;

import java.text.SimpleDateFormat;

public class Babysitter {

    int dayRate = 12;
    int nightRate = 8;
    int lateRate = 16;
    int shiftLengthMax = 11;
    int shiftLengthMin = 1;
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH");

    public static void main(String[] args) {
    }

    public int getDayRate() {
        return dayRate;
    }

    public int getNightRate() {
        return nightRate;
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
