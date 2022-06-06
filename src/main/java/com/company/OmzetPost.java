package com.company;

import java.util.ArrayList;

public class OmzetPost extends Post {
    private static double totaalOmzetBedrag;
    private ArrayList<Bestelling> alleBestellingen = new ArrayList<>();

    OmzetPost(String tijdsbestek, String postNummer, Bestelling bestelling) {
        super(postNummer, tijdsbestek);
        addBestelling(bestelling);
    }

    public static double getTotaalOmzetBedrag() {
        return totaalOmzetBedrag;
    }
    public void addBestelling (Bestelling bestelling){
        this.alleBestellingen.add(bestelling);
        totaalOmzetBedrag = totaalOmzetBedrag + (bestelling.getBestellingPrijsperLead() * bestelling.getBestellingAantalLeads());
    }
    public ArrayList<Bestelling> getAlleBestellingen(){
        return alleBestellingen;
    }
}

