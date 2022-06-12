package com.company;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


class BestellingTest3OPT3 {

    @Test
    void welOfGeenKorting() {
        AutoDealer testautodealer = new AutoDealer("testnaam", "BC", "teststad", "testadres", "1234");
        Bestelling bestelling1 = new Bestelling("1", testautodealer, 25, 120, "7 april", false, true);
        Bestelling bestelling2 = new Bestelling("1", testautodealer, 25, 120, "7 april", false, true);
        Bestelling bestelling3 = new Bestelling("1", testautodealer, 35, 120, "7 april", false, true);
        Bestelling bestelling4 = new Bestelling("1", testautodealer, 35, 120, "7 april", false, true);
        Bestelling bestelling5 = new Bestelling("1", testautodealer, 50, 120, "7 april", false, true);
        Bestelling bestelling6 = new Bestelling("1", testautodealer, 50, 120, "7 april", false, true);

        assertEquals(1.07, bestelling1.welOfGeenKorting(500000, true, true), 0.001);
        assertEquals(1.15, bestelling2.welOfGeenKorting(1500000, false, false), 0.001);
        assertEquals(1.14, bestelling3.welOfGeenKorting(500000, false, false), 0.001);
        assertEquals(0.92, bestelling4.welOfGeenKorting(1500000, true, true), 0.001);
        assertEquals(1.04, bestelling5.welOfGeenKorting(500000, false, true), 0.001);
        assertEquals(0.94, bestelling6.welOfGeenKorting(1500000, true, false), 0.001);
    }
}