package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MedewerkerTest {

    @Test
    void testGetUitbetaling() {
//        er worden meerdere objecten aangemaakt omdat deze nodig zijn om een WinstPeriode aan te maken (zie line 19)
        AutoDealer testDealer = new AutoDealer("testDealer", "BC", "vancouver", "testaddress", "a1a1as1", "testnaameigenaar", "testemail@gmail.com", "2152534617");
        Bestelling testBestelling = new Bestelling("1", testDealer, 40, 145, "5 mei", true, true);
        OmzetPost testOmzetPost = new OmzetPost("1 januari - 4 mei", "1", testBestelling);

        Factuur testFactuur = new Factuur("1", 1000, "10 januari");
        KostenPost testKostenPost = new KostenPost("3 maanden", "1", testFactuur);

        WinstPeriode testWinstPeriode = new WinstPeriode("10 maanden", "1", testOmzetPost, testKostenPost);
        Medewerker jan = new Medewerker("Jan Pernot", 0.4);

        assertEquals(1920, jan.getUitbetaling(testWinstPeriode));
    }
}