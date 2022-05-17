package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BestellingTest2OPT3 {

    @Test
    void bijwelkeProvincieHoortbestelling() {
//        Equivalentieklassen en Randwaarden
        AutoDealer testautodealer = new AutoDealer("testnaam", "BC", "teststad", "testadres", "1234", "testnaameigenaar", "test@gmail.com", "11111");
        Bestelling bestelling1 = new Bestelling("4", testautodealer, 35, 120, "7 april", false, true);
        Bestelling bestelling2 = new Bestelling("4", testautodealer, 35, 121, "7 april", false, true);
        Bestelling bestelling3 = new Bestelling("4", testautodealer, 35, 124, "7 april", false, true);
        Bestelling bestelling4 = new Bestelling("4", testautodealer, 35, 125, "7 april", false, true);
        Bestelling bestelling5 = new Bestelling("4", testautodealer, 35, 126, "7 april", false, true);
        Bestelling bestelling6 = new Bestelling("4", testautodealer, 35, 127, "7 april", false, true);
        Bestelling bestelling7 = new Bestelling("4", testautodealer, 35, 134, "7 april", false, true);
        Bestelling bestelling8 = new Bestelling("4", testautodealer, 35, 135, "7 april", false, true);
        Bestelling bestelling9 = new Bestelling("4", testautodealer, 35, 136, "7 april", false, true);
        Bestelling bestelling10 = new Bestelling("4", testautodealer, 35, 137, "7 april", false, true);
        Bestelling bestelling11 = new Bestelling("4", testautodealer, 35, 144, "7 april", false, true);
        Bestelling bestelling12 = new Bestelling("4", testautodealer, 35, 145, "7 april", false, true);

        assertEquals("Saskatchewan", bestelling1.bijwelkeProvincieHoortbestelling());
        assertEquals("Saskatchewan", bestelling2.bijwelkeProvincieHoortbestelling());
        assertEquals("Saskatchewan", bestelling3.bijwelkeProvincieHoortbestelling());
        assertEquals("Saskatchewan", bestelling4.bijwelkeProvincieHoortbestelling());
        assertEquals("Alberta", bestelling5.bijwelkeProvincieHoortbestelling());
        assertEquals("Alberta", bestelling6.bijwelkeProvincieHoortbestelling());
        assertEquals("Alberta", bestelling7.bijwelkeProvincieHoortbestelling());
        assertEquals("Alberta", bestelling8.bijwelkeProvincieHoortbestelling());
        assertEquals("British-Columbia", bestelling9.bijwelkeProvincieHoortbestelling());
        assertEquals("British-Columbia", bestelling10.bijwelkeProvincieHoortbestelling());
        assertEquals("British-Columbia", bestelling11.bijwelkeProvincieHoortbestelling());
        assertEquals("British-Columbia", bestelling12.bijwelkeProvincieHoortbestelling());
    }
}