package com.company;

import java.util.ArrayList;

public class KostenPost extends Post {
    private ArrayList<Factuur> alleFacturen = new ArrayList<>();
    private static double totaalKostenBedrag;

    KostenPost(String tijdsbestek, String postNummer, Factuur factuur) {
        super(tijdsbestek, postNummer);
        addFactuur(factuur);
    }

    private static double getTotaalKostenBedrag() {
        return totaalKostenBedrag;
    }

    public void addFactuur (Factuur factuur) {
        this.alleFacturen.add(factuur);
        totaalKostenBedrag = totaalKostenBedrag + factuur.getFactuurBedrag();
    }

    public ArrayList<Factuur> getAlleFacturen(){
        return alleFacturen;
    }
}
