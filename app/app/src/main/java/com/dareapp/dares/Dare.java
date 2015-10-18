package com.dareapp.dares;

import java.util.Date;

/**
 * Created by pocobrio on 17/10/15.
 */
public class Dare {

    boolean claimed = false; //unecessary since the list will likely be segregated anyway
    int points = 0;
    Date date = new Date();
    String description;



    // Getters and setters

    private boolean getClaimed() {
        return claimed;
    }

    private void setClaimed(boolean c) {
        claimed = c;
    }

    private int getPoints() {
        return points;
    }

    private void setPoints(int p) {
        points = p;
    }

    private Date getDate() {
        return date;
    }

    private void setDate(Date d) {
        date = d;
    }

    private String getDescription() {
        return description;
    }

    private void setDescription(String d) {
        description = d;
    }


}
