package com.harmellaw;

public class AlternativeCharge {
    CriminalOffence offense;
    int probability; // 0-100

    public AlternativeCharge(CriminalOffence offense, int probability) {
        this.offense = offense;
        this.probability = probability;
    }
}
