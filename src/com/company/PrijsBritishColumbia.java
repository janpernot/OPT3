package com.company;

public class PrijsBritishColumbia extends BepaalBasisPrijs{

    public PrijsBritishColumbia(String regio, int maximaalTijdsBestekInDagen, Bestelling bestelling) {
        super(regio, maximaalTijdsBestekInDagen, bestelling);
    }

    @Override
    public void checkRegio(){
        if (!getRegio().equals("Lower Mainland")){
            System.out.println("Dit gebied ligt buiten het dicht bevolkte gebied Lower Mainland van British Columbia. De prijs per lead is met 20% verhoogd.");
            veranderBasisPrijs(1.2);
        }
        else{
            System.out.println("Omdat de bestelling in Lower Mainland ligt blijft de prijs normaal.");
        }
    }
    @Override
    public void checkTijdsbestek(){
        if (getMaximaalTijdsBestekInDagen() <= 5){
            System.out.println(getMaximaalTijdsBestekInDagen() + " is heel kort in British Columbia om een bestelling te kunnen voltooien. Hiervoor moet veel meer worden uitgegeven.\nDe prijs per lead is verhoogd met 10%.\nJe kan nu checken of er nog extra kosten boven op de leadprijs komen.");
            veranderBasisPrijs(1.1);
        }
        else if(getMaximaalTijdsBestekInDagen() <= 10){
            System.out.println(getMaximaalTijdsBestekInDagen() + " is lang genoeg om de bestelling in British Columbia uit te kunnen voltooien, let wel goed op de kosten.\nJe kan nu checken of er nog extra kosten boven op de leadprijs komen.");
        }
        else{
            System.out.println(getMaximaalTijdsBestekInDagen() + " dagen is meer dan genoeg om de bestelling eenvoudig te voltooien.\nJe kan nu checken of er nog extra kosten boven op de leadprijs komen.");
        }
    }
}
