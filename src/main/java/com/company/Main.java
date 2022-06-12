package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
/* User Story: Als CTO wil ik nieuwe klanten kunnen toevoegen aan het programma met al hun
informatie zoals adres en contactinformatie zodat ik deze informatie ten alle tijden eenvoudig
terug kan vinden doordat het niet meer in een ongestructureerde sheet staat. */

        AutoDealer Chilliwack = new AutoDealer("Chilliwack Mitsubishi", "British-Columbia", "Vancouver", "address", "a1a1a1");

        System.out.println("De naam van de dealer is " + Chilliwack.getDealerNaam());
        Chilliwack.printDealerInfo();
        System.out.println("");

/* Als CTO wil ik nieuwe bestellingen kunnen toevoegen en hier informatie over kunnen opvragen
zodat ik deze kan beheren in het programma. */

        Bestelling bestelling1 = new Bestelling("1", Chilliwack, 40, 145, "Zondag 5 juni", true, true);
        Bestelling bestelling2 = new Bestelling("2", Chilliwack, 30, 145, "Zondag 30 juni", true, true);
        System.out.println("mag bestelling worden toegevoegd: " +bestelling1.magBestellingWordenToegevoegd(false));
        System.out.println("Op basis van de prijs per lead hoort de bestelling bij: " +bestelling1.bijwelkeProvincieHoortbestelling());
        System.out.println("De vermenigvuldiger van de nieuwe leadprijs bedraagd: " +bestelling1.welOfGeenKorting(500000, true,true));
        System.out.println("");

/* Als CTO wil ik een factuur kunnen toevoegen met de juiste
munteenheid zodat ik de kosten goed in kaart kan brengen (Singleton pattern). */

        Factuur factuur1 = new Factuur("1", 1000, "Zondag 5 juni", Munteenheid.getInstance().getCanadianDollar());
        Factuur factuur2 = new Factuur("2", 1500, "Zondag 30 juni", Munteenheid.getInstance().getCanadianDollar());

/* Als CTO wil ik inkomsten, uitgaven en winst kunnen laten berekenen zonder
handmatig berekeningen te moeten doen zodat ik daar zelf geen tijd aan kwijt ben. */

        KostenPost kostenPost1 = new KostenPost("3 maanden", "1", factuur1);
        OmzetPost omzetPost1 = new OmzetPost("3 maanden", "1", bestelling1);
        kostenPost1.addFactuur(factuur1);
        omzetPost1.addBestelling(bestelling2);

        WinstPeriode winstPeriode1 = new WinstPeriode("3 maanden", "1", omzetPost1, kostenPost1);
        System.out.println("De kosten zijn: " +winstPeriode1.getKosten());
        System.out.println("De omzet is: " +winstPeriode1.getOmzet());
        System.out.println("De winst is: " +winstPeriode1.getWinst());
        System.out.println("");

/* Als CTO wil ik de uitbetaling van elk teamlid na elke bestelling
kunnen opvragen zodat ik die berekening niet meer handmatig hoef uit te voeren. */

        Medewerker jan = new Medewerker("Jan", "Marketing", 0.4);
        UitbetalingMedewerker uitbetalingenVanJan = new UitbetalingMedewerker(jan);

        System.out.println("De uitbetaling is: " +uitbetalingenVanJan.getUitbetaling(winstPeriode1));
        System.out.println("");


/*Als CTO wil ik op basis van een regio kijken of de prijs nog moet worden aangepast binnen de Regio zodat ik een accurate leadprijs kan bepalen (template method pattern) */
    BepaalBasisPrijs test = new PrijsSaskatchewan("Far North West", 20, bestelling1);
    test.bepaalBasisPrijs();
    }
}


