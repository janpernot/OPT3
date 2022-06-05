package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BestellingTestOPT3 {

    @Test
    void testMagBestellingWordenToegevoegd() {

//        Condition Coverage
        AutoDealer testautodealer = new AutoDealer("testnaam", "AB", "teststad", "testadres", "1234", "test@gmail.com", "11111");
        Bestelling bestelling1 = new Bestelling("1", testautodealer, 40, 130, "4 april", false, true);
        Bestelling bestelling2 = new Bestelling("2", testautodealer, 40, 130, "5 april", true, false);
        Bestelling bestelling3 = new Bestelling("3", testautodealer, 40, 130, "6 april", false, false);

        assertFalse(bestelling1.magBestellingWordenToegevoegd(false));
        assertFalse(bestelling2.magBestellingWordenToegevoegd(false));
        assertFalse(bestelling3.magBestellingWordenToegevoegd(true));
    }
    @Test
    void testMagBestellingWordenToegevoegd2() {

//        Decision Coverage
        AutoDealer testautodealer = new AutoDealer("testnaam", "AB", "teststad", "testadres", "1234", "test@gmail.com", "11111");
        Bestelling bestelling1 = new Bestelling("4", testautodealer, 40, 130, "7 april", true, true);
        Bestelling bestelling2 = new Bestelling("3", testautodealer, 40, 130, "6 april", false, false);
        assertTrue(bestelling1.magBestellingWordenToegevoegd(true));
        assertFalse(bestelling2.magBestellingWordenToegevoegd(false));
    }
    @Test
    void testMagBestellingWordenToegevoegd3() {

        //        Condition / Decision Coverage
        AutoDealer testautodealer = new AutoDealer("testnaam", "AB", "teststad", "testadres", "1234", "test@gmail.com", "11111");
        Bestelling bestelling1 = new Bestelling("1", testautodealer, 40, 130, "4 april", false, true);
        Bestelling bestelling2 = new Bestelling("2", testautodealer, 40, 130, "5 april", true, false);
        Bestelling bestelling3 = new Bestelling("3", testautodealer, 40, 130, "6 april", false, false);
        Bestelling bestelling4 = new Bestelling("4", testautodealer, 40, 130, "7 april", true, true);

        assertFalse(bestelling1.magBestellingWordenToegevoegd(false));
        assertFalse(bestelling2.magBestellingWordenToegevoegd(false));
        assertFalse(bestelling3.magBestellingWordenToegevoegd(true));
        assertTrue(bestelling4.magBestellingWordenToegevoegd(true));
    }
    @Test
    void testMagBestellingWordenToegevoegd4() {

        //        Modified Condition / Decision Coverage
        AutoDealer testautodealer = new AutoDealer("testnaam", "AB", "teststad", "testadres", "1234", "test@gmail.com", "11111");
        Bestelling bestelling1 = new Bestelling("4", testautodealer, 40, 130, "7 april", true, true);
        Bestelling bestelling2 = new Bestelling("4", testautodealer, 40, 130, "7 april", true, false);
        Bestelling bestelling3 = new Bestelling("4", testautodealer, 40, 130, "7 april", false, true);
        Bestelling bestelling4 = new Bestelling("4", testautodealer, 40, 130, "7 april", true, true);

        assertTrue(bestelling1.magBestellingWordenToegevoegd(true));
        assertFalse(bestelling2.magBestellingWordenToegevoegd(true));
        assertFalse(bestelling3.magBestellingWordenToegevoegd(true));
        assertFalse(bestelling4.magBestellingWordenToegevoegd(false));

    }
    @Test
    void testMagBestellingWordenToegevoegd5() {
//        Multiple Condition Coverage
        AutoDealer testautodealer = new AutoDealer("testnaam", "AB", "teststad", "testadres", "1234", "test@gmail.com", "11111");
        Bestelling bestelling1 = new Bestelling("4", testautodealer, 40, 130, "7 april", false, true);
        Bestelling bestelling2 = new Bestelling("4", testautodealer, 40, 130, "7 april", true, false);
        Bestelling bestelling3 = new Bestelling("4", testautodealer, 40, 130, "7 april", false, false);
        Bestelling bestelling4 = new Bestelling("4", testautodealer, 40, 130, "7 april", true, true);
        Bestelling bestelling5 = new Bestelling("4", testautodealer, 40, 130, "7 april", false, true);
        Bestelling bestelling6 = new Bestelling("4", testautodealer, 40, 130, "7 april", true, false);
        Bestelling bestelling7 = new Bestelling("4", testautodealer, 40, 130, "7 april", true, true);
        Bestelling bestelling8 = new Bestelling("4", testautodealer, 40, 130, "7 april", false, false);

        assertFalse(bestelling1.magBestellingWordenToegevoegd(false));
        assertFalse(bestelling2.magBestellingWordenToegevoegd(false));
        assertFalse(bestelling3.magBestellingWordenToegevoegd(true));
        assertFalse(bestelling4.magBestellingWordenToegevoegd(false));
        assertFalse(bestelling5.magBestellingWordenToegevoegd(true));
        assertFalse(bestelling6.magBestellingWordenToegevoegd(true));
        assertTrue(bestelling7.magBestellingWordenToegevoegd(true));
        assertFalse(bestelling8.magBestellingWordenToegevoegd(false));

    }



    }