package com.company;

import java.util.ArrayList;

public class WinstPeriode {
    private String periode;
    private String periodeNummer;
    private double omzet;
    private double kosten;
    private double winst;
    private static double totaleWinst;


    WinstPeriode(String periode, String periodeNummer, OmzetPost omzetPost, KostenPost kostenPost) {
        this.periode = periode;
        this.periodeNummer = periodeNummer;
        this.omzet = berekenOmzet(omzetPost);
        this.kosten = berekenKosten(kostenPost);
        this.winst = this.omzet - this.kosten;
        totaleWinst = totaleWinst + this.winst;
    }

    public double getOmzet() {
        return omzet;
    }

    public double getKosten() {
        return kosten;
    }

    public double getWinst() {
        return winst;
    }

    public double berekenOmzet(OmzetPost omzetPost) {
        double x = 0.0;
        for (Bestelling a : omzetPost.getAlleBestellingen()) {
            x = x + a.getBestellingAantalLeads() * a.getBestellingPrijsperLead();
        }
        return x;
    }

    public double berekenKosten(KostenPost kostenPost) {
        double x = 0.0;
        for (Factuur a : kostenPost.getAlleFacturen()) {
            x = x + a.getFactuurBedrag();
        }
        return x;
    }

}

