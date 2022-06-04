package com.company;

import java.util.ArrayList;

public class Factuur {
    private String factuurNummer;
    private double factuurBedrag;
    private String factuurDatum;
    private String munteenheid;

    public Factuur(String factuurNummer, double factuurBedrag, String factuurDatum, String munteenheid) {
        this.factuurNummer = factuurNummer;
        this.factuurBedrag = factuurBedrag;
        this.factuurDatum = factuurDatum;
        this.munteenheid = munteenheid;
    }

    public double getFactuurBedrag() {
        return factuurBedrag;
    }

    public String getFactuurNaam() {
        return factuurNummer;
    }

    public String getFactuurDatum() {
        return factuurDatum;
    }

    public String getMunteenheid(){
        return munteenheid;
    }

}
