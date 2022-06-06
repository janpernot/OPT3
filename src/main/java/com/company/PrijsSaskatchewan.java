package com.company;

public class PrijsSaskatchewan extends BepaalBasisPrijs{

    public PrijsSaskatchewan(String regio, int maximaalTijdsBestekInDagen, Bestelling bestelling) {
        super(regio, maximaalTijdsBestekInDagen, bestelling);
    }

    @Override
    public void checkRegio(){
        if (getRegio().equals("Prince Albert Area")){
            System.out.println("Het gebied rond Prince Albert is het dichtsbevolkt van de provincie Saskatchewan, de prijs per lead blijft hierdoor hetzelfde.");
        }
        else if(getRegio().equals("Far North Central")){
            System.out.println("De Far North Central regio is dunbevolkt en daarom erg duur om leads in te genereren, de prijs is daarom verhoogd met 50%.");
            veranderBasisPrijs(1.5);

        }
        else if (getRegio().equals("Far North West")){
            System.out.println("De regio Far North West is een dunbevolkt gebied in Saskatchewan en dus duurder om leads in te genereren, de prijs is daarom verhoogd met 30%.");
            veranderBasisPrijs(1.3);
        }
    }

    @Override
    public void checkTijdsBestek(){
        if (getMaximaalTijdsBestekInDagen() <= 10){
            System.out.println(getMaximaalTijdsBestekInDagen() + " is heel kort in Saskatchewan om een bestelling te kunnen voltooien. Hiervoor moet veel meer worden uitgegeven.\nDe prijs per lead is verhoogd met 10%.\nJe kan nu checken of er nog extra kosten boven op de leadprijs komen.");
            veranderBasisPrijs(1.1);
        }
        else if(getMaximaalTijdsBestekInDagen() <= 20){
            System.out.println(getMaximaalTijdsBestekInDagen() + " is lang genoeg om de bestelling in Saskatchewan uit te kunnen voltooien, let wel goed op de kosten.\nJe kan nu checken of er nog extra kosten boven op de leadprijs komen.");
        }
        else{
            System.out.println(getMaximaalTijdsBestekInDagen() + " dagen is meer dan genoeg om de bestelling eenvoudig te voltooien.\nJe kan nu checken of er nog extra kosten boven op de leadprijs komen.");
        }
    }
}
