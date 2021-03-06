package com.company;

public abstract class BepaalBasisPrijs {
    private String regio;
    private int maximaalTijdsBestekInDagen;
    private Bestelling bestelling;

    public BepaalBasisPrijs(String regio, int maximaalTijdsBestekInDagen, Bestelling bestelling) {
        this.regio = regio;
        this.maximaalTijdsBestekInDagen = maximaalTijdsBestekInDagen;
        this.bestelling = bestelling;
    }

    public void bepaalBasisPrijs(){
        checkRegio();
        checkTijdsBestek();
    }

    public abstract void checkRegio();
    public abstract void checkTijdsBestek();

    public String getRegio(){
        return regio;
    }
    public int getMaximaalTijdsBestekInDagen(){
        return maximaalTijdsBestekInDagen;
    }
    public Bestelling getBestelling(){
        return bestelling;
    }
    public void veranderBasisPrijs(double x){
        getBestelling().setBestellingLeadPrijs(getBestelling().getBestellingPrijsperLead()*x);
    }
}
