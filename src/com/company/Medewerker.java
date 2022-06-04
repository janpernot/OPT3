package com.company;

import java.util.ArrayList;

public class Medewerker implements Observer {
    private String naam;
    private double winstpercentageKommaGetal;
    private ArrayList<WinstPeriode> alleWinstPeriodesPerMedewerker = new ArrayList<>();


    Medewerker(String naam, double winstpercentageKommaGetal) {
        this.naam = naam;
        this.winstpercentageKommaGetal = winstpercentageKommaGetal;
    }

    public double getUitbetaling(WinstPeriode winstPeriode) {

        return (winstPeriode.getWinst() * winstpercentageKommaGetal);
    }

    public void addAlleWinstPeriodes(WinstPeriode winstPeriode) {
        this.alleWinstPeriodesPerMedewerker.add(winstPeriode);
    }

    public void printAlleUitbetalingen() {
        System.out.println("Hier onder volgen alle bedragen die " + naam + " heeft ontvangen:");
        int i = 1;
        for (WinstPeriode m : this.alleWinstPeriodesPerMedewerker) {
            System.out.println("Uitbetaling " + i + ") " + getUitbetaling(m) + " Canadian Dollar");
            i++;
        }
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