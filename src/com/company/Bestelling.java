package com.company;

public class Bestelling {
    private String bestelNummer;
    private AutoDealer autoDealer;
    private int aantalLeads;
    private double prijsPerLead;
    private String bestellingDatum;
    private Boolean bestellingVoltooid;
    private Boolean bestellingBetaald;

    public Bestelling(String bestelNummer, AutoDealer autoDealer, int aantalLeads, double prijsPerLead, String bestellingDatum, Boolean bestellingVoltooid, Boolean bestellingBetaald) {
        this.bestelNummer = bestelNummer;
        this.autoDealer = autoDealer;
        this.aantalLeads = aantalLeads;
        this.prijsPerLead = prijsPerLead;
        this.bestellingDatum = bestellingDatum;
        this.bestellingVoltooid = bestellingVoltooid;
        this.bestellingBetaald = bestellingBetaald;
    }

    public void printIsBestellingBetaald() {
        if (bestellingBetaald == false) {
            System.out.println("De bestelling van " + aantalLeads + " leads, geplaatst door " + autoDealer.getDealerNaam() + ", is nog niet betaald, begin dus nog niet met het uitvoeren van de bestelling");
        } else if (bestellingBetaald == true) {
            System.out.println("De bestelling van " + aantalLeads + " leads, geplaatst door " + autoDealer.getDealerNaam() + ", is betaald, begin met het uitvoeren van de bestelling");
        }
    }

    public void printIsBestellingVoltooid() {
        if (bestellingVoltooid == false) {
            System.out.println("De bestelling van " + aantalLeads + " leads, geplaatst door " + autoDealer.getDealerNaam() + ", is nog niet voltooid, laat de advertentiecampagne nog draaien");
        } else if (bestellingVoltooid == true) {
            System.out.println("De bestelling van " + aantalLeads + " leads, geplaatst door " + autoDealer.getDealerNaam() + ", is voltooid, stop de advertentiecampagne");
        }
    }

    public Boolean getBestellingVoltooid() {
        return bestellingVoltooid;
    }

    public Boolean getBestellingBetaald() {
        return bestellingBetaald;
    }

    public void printBestellingDatum() {
        System.out.println("De datum waarop deze bestelling werd geplaatst was " + bestellingDatum + ".");
    }

    public double getBestellingPrijsperLead() {
        return prijsPerLead;
    }

    public int getBestellingAantalLeads() {
        return aantalLeads;
    }

    public void setBestellingVoltooid() {
        bestellingVoltooid = true;
    }

    public String getBestellingDatum() {
        return bestellingDatum;
    }

    public void setBestellingBetaald() {
        bestellingBetaald = true;
    }

    public String getBestelNummer() {
        return bestelNummer;
    }
}
