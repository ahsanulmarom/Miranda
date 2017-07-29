package com.ayotong.miranda.model;

/**
 * Created by Alpha on 16/07/2017.
 */

public class ExpLog {

    public static final String DATABASE_TABLE = "ExpLog";
    public static final int DATABASE_VERSION = 1;
    public static final String TABLE_CREATE =
            "create table if not exists ExpLog (timestamp text primary key, exp_gain integer);";
    public static final String COL_TIMESTAMP = "timestamp";
    public static final String COL_EXPGAIN = "exp_gain";

    private String timestamp;
    private int exp_gain;

    public ExpLog(){

    }

    public ExpLog(String timestamp, int exp_gain){
        this.setTimestamp(timestamp);
        this.setExp_gain(exp_gain);
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public int getExp_gain() {
        return exp_gain;
    }

    public void setExp_gain(int exp_gain) {
        this.exp_gain = exp_gain;
    }
}
