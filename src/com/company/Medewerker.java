package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Medewerker{
    private String naam;
    private String divisie;
    private double winstpercentageKommaGetal;


    Medewerker(String naam, String divisie, double winstpercentageKommaGetal) {
        this.naam = naam;
        this.winstpercentageKommaGetal = winstpercentageKommaGetal;
    }

    public String getNaam() {
        return naam;
    }

    public double getWinstpercentageKommaGetal() {
        return winstpercentageKommaGetal;
    }

    public void setWinstpercentageKommaGetal(double winstpercentageKommaGetal) {
        this.winstpercentageKommaGetal = winstpercentageKommaGetal;
    }
}