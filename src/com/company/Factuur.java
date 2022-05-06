package com.company;

import java.util.ArrayList;

public class Factuur {
    private String factuurNummer;
    private double factuurBedrag;
    private String factuurDatum;

    public Factuur(String factuurNummer, double factuurBedrag, String factuurDatum) {
        this.factuurNummer = factuurNummer;
        this.factuurBedrag = factuurBedrag;
        this.factuurDatum = factuurDatum;
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

}
