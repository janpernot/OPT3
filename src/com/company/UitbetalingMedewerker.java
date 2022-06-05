package com.company;

import java.util.ArrayList;

public class UitbetalingMedewerker {
    private Medewerker medewerker;
    private ArrayList<WinstPeriode> alleWinstPeriodesPerMedewerker = new ArrayList<>();


    UitbetalingMedewerker(Medewerker medewerker) {
        this.medewerker = medewerker;
    }

    public double getUitbetaling(WinstPeriode winstPeriode) {
        return (winstPeriode.getWinst() * medewerker.getWinstpercentageKommaGetal());
    }

    public void addAlleWinstPeriodes(WinstPeriode winstPeriode) {
        this.alleWinstPeriodesPerMedewerker.add(winstPeriode);
    }

    public void printAlleUitbetalingen() {
        System.out.println("Hier onder volgen alle bedragen die " + medewerker.getNaam() + " heeft ontvangen:");
        int i = 1;
        for (WinstPeriode m : this.alleWinstPeriodesPerMedewerker) {
            System.out.println("Uitbetaling " + i + ") " + getUitbetaling(m) + " Canadian Dollar");
            i++;
        }
    }

}
