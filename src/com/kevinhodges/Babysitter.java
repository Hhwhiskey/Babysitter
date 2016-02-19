package com.kevinhodges;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

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

    public int calculateShiftLength(Calendar shiftStartDate, Calendar shiftEndDate) {

        // Create calendar date with time of 1700 on feb 19th
        shiftStartDate.set(Calendar.YEAR, 2016);
        shiftStartDate.set(Calendar.MONTH, 2);
        shiftStartDate.set(Calendar.DATE, 19);
        shiftStartDate.set(Calendar.HOUR_OF_DAY, 17);

        // Convert shiftStartDate to millis
        long startingTime = shiftStartDate.getTimeInMillis();

        // Create calendar date with time of 0400 on feb 20th
        shiftEndDate.set(Calendar.YEAR, 2016);
        shiftEndDate.set(Calendar.MONTH, 2);
        shiftEndDate.set(Calendar.DATE, 20);
        shiftEndDate.set(Calendar.HOUR_OF_DAY, 4);

        // Convert shiftEndDate to millis
        long quittingTime = shiftEndDate.getTimeInMillis();

        // Subtract the starting time from quitting time to get the
        // length of the shift in millis
        long shiftLength = quittingTime - startingTime;

        // Convert the millis time to hours, rounded up to the hour.
        int shiftLengthHours = (int) TimeUnit.MILLISECONDS.toHours(shiftLength);

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
