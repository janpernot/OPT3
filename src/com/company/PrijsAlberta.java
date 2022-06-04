package com.company;

public class PrijsAlberta extends BepaalBasisPrijs{

    public PrijsAlberta(String regio, int maximaalTijdsBestekInDagen, Bestelling bestelling) {
        super(regio, maximaalTijdsBestekInDagen, bestelling);
    }

    @Override
    public void checkRegio(){
        if (getRegio().equals("Rocky Mountains")){
            System.out.println("De Rocky Mountains in Alberta zijn dunbevolkt en daarom duurder om leads in te genereren. De prijs gaat hierdoor met 25% omhoog");
            veranderBasisPrijs(1.25);

        }
        else if(getRegio().equals("Canadian Shield")){
            System.out.println("Het Canadian Shield in Alberta is dun bevolkt, hierdoor is het duurder om leads te genereren en gaat de prijs 20% omhoog");
            veranderBasisPrijs(1.2);

        }
        else{
            System.out.println("De regio in Alberta waar deze klant een bestelling wil plaatsen heeft geen hogere kostprijs per lead.");
        }
    }
    @Override
    public void checkTijdsbestek(){
        if (getMaximaalTijdsBestekInDagen() <= 15){
            System.out.println(getMaximaalTijdsBestekInDagen() + " is heel kort in Alberta om een bestelling te kunnen voltooien. Hiervoor moet veel meer worden uitgegeven.\nDe prijs per lead is verhoogd met 15%.\nJe kan nu checken of er nog extra kosten boven op de leadprijs komen.");
            veranderBasisPrijs(1.15);

        }
        else if(getMaximaalTijdsBestekInDagen() <= 25){
            System.out.println(getMaximaalTijdsBestekInDagen() + " is lang genoeg om de bestelling in Alberta uit te kunnen voltooien, let wel goed op de kosten.\nJe kan nu checken of er nog extra kosten boven op de leadprijs komen.");
        }
        else{
            System.out.println(getMaximaalTijdsBestekInDagen() + " dagen is meer dan genoeg om de bestelling eenvoudig te voltooien.\nJe kan nu checken of er nog extra kosten boven op de leadprijs komen.");
        }
    }
}
