package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WinstPeriodeTest {
    //        er worden meerdere objecten aangemaakt omdat deze nodig zijn om een WinstPeriode aan te maken (zie line 19 en 32)

    @Test
    void testBerekenOmzet() {
        AutoDealer testDealer = new AutoDealer("testDealer", "BC", "vancouver", "testaddress", "a1a1aa");
        Bestelling testBestelling = new Bestelling("1", testDealer, 40, 145, "5 mei", true, true);
        OmzetPost testOmzetPost = new OmzetPost("1 januari - 4 mei", "1", testBestelling);

        Factuur testFactuur = new Factuur("1", 1000, "10 januari", Munteenheid.getInstance().getCanadianDollar());
        KostenPost testKostenPost = new KostenPost("3 maanden", "1", testFactuur);

        WinstPeriode testWinstPeriode = new WinstPeriode("10 maanden", "1", testOmzetPost, testKostenPost);
        assertEquals(5800, testWinstPeriode.berekenOmzet(testOmzetPost));
    }

    @Test
    void testBerekenKosten() {
        AutoDealer testDealer = new AutoDealer("testDealer", "BC", "vancouver", "testaddress", "a1a1aa");
        Bestelling testBestelling = new Bestelling("1", testDealer, 40, 145, "5 mei", true, true);
        OmzetPost testOmzetPost = new OmzetPost("1 januari - 4 mei", "1", testBestelling);

        Factuur testFactuur1 = new Factuur("1", 1000, "10 januari", Munteenheid.getInstance().getCanadianDollar());
        KostenPost testKostenPost = new KostenPost("3 maanden", "1", testFactuur1);

        WinstPeriode testWinstPeriode = new WinstPeriode("10 maanden", "1", testOmzetPost, testKostenPost);

        assertEquals(1000, testWinstPeriode.berekenKosten(testKostenPost));

    }
}