package com.company;

import junit.framework.TestCase;

public class AutoDealerTest extends TestCase {

    public void testGetDealerEmail() {
        AutoDealer autoDealer = new AutoDealer("testnaam", "AB", "teststad", "adres", "a1a1a1", "test1@gmail.com", "2152534617");
        assertEquals("test1@gmail.com", autoDealer.getDealerEmail());
    }

    public void testSetDealerEmail() {
        AutoDealer autoDealer = new AutoDealer("testnaam", "AB", "teststad", "adres", "a1a1a1", "test1@gmail.com", "2152534617");
        autoDealer.setDealerEmail("test2@gmail.com");
        assertEquals("test2@gmail.com", autoDealer.getDealerEmail());

    }
}