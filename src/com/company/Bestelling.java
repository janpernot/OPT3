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

    public boolean magBestellingWordenToegevoegd(Boolean isEerderToegevoegd ){
        if (bestellingBetaald.equals(false)){
            return false;
        }
        else if (bestellingVoltooid.equals(false)){
            return false;
        }
        else if(isEerderToegevoegd.equals(false)){
            return false;
        }
        else{
            return true;
        }
    }

    public String bijwelkeProvincieHoortbestelling() {
        String besluit = "";
        if (prijsPerLead == 120) {
            besluit = "Saskatchewan";
            return besluit;
        } else if (prijsPerLead <= 125) {
            besluit = "Saskatchewan";
            return besluit;
        } else if (prijsPerLead == 126) {
            besluit = "Alberta";
            return besluit;
        } else if (prijsPerLead <= 135) {
            besluit = "Alberta";
            return besluit;
        } else if (prijsPerLead == 136) {
            besluit = "British-Columbia";
            return besluit;
        } else if (prijsPerLead <= 145) {
            besluit = "British-Columbia";
            return besluit;
        }
        else {
            return besluit = "Deze prijs bestaat niet";
        }
    }
    public double welOfGeenKorting(double inwoners, boolean dealerIsGedigitaliseerd, boolean dealerIsAlKlant) {
        double vermenigvuldiger = 1.0;
        if (aantalLeads <= 20) {
            vermenigvuldiger = vermenigvuldiger + 0.07;
        } else if (aantalLeads <= 30) {
            vermenigvuldiger = vermenigvuldiger + 0.07;
        } else if (aantalLeads <= 40) {
            vermenigvuldiger = vermenigvuldiger - 0.01;
        } else if (aantalLeads >= 41) {
            vermenigvuldiger = vermenigvuldiger - 0.05;
        }
        if (inwoners < 1000000) {
            vermenigvuldiger = vermenigvuldiger + 0.06;
        } else {
            vermenigvuldiger = vermenigvuldiger - 0.01;
        }
        if (dealerIsGedigitaliseerd == true){
            vermenigvuldiger = vermenigvuldiger - 0.01;
        }
        else{
            vermenigvuldiger = vermenigvuldiger + 0.08;
        }
        if (dealerIsAlKlant == true){
            vermenigvuldiger = vermenigvuldiger - 0.05;
        }
        else{
            vermenigvuldiger = vermenigvuldiger + 0.01;
        }
        return vermenigvuldiger;
    }

}
