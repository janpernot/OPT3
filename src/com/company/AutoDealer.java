package com.company;

import org.w3c.dom.ls.LSOutput;

import java.lang.System;
import java.util.ArrayList;
import java.util.Scanner;

public class AutoDealer {
    private String dealerNaam;
    private String provincie;
    private String stad;
    private String adres;
    private String postcode;
    private String eigenaarNaam;
    private String dealerEmail;
    private String dealerTelefoon;

    public AutoDealer(String dealerNaam, String provincie, String stad, String adres, String postcode, String eigenaarNaam, String dealerEmail, String dealerTelefoon) {
        this.dealerNaam = dealerNaam;
        this.provincie = provincie;
        this.stad = stad;
        this.adres = adres;
        this.postcode = postcode;
        this.eigenaarNaam = eigenaarNaam;
        this.dealerEmail = dealerEmail;
        this.dealerTelefoon = dealerTelefoon;
    }

    public String getDealerTelefoon() {
        return dealerTelefoon;
    }

    public String getDealerEmail() {
        return dealerEmail;
    }

    public void printDealerInfo() {
        String dealerInformatie = ("De informatie van " + dealerNaam + " is:\nProvincie: " + provincie + "\nStad: " + stad + "\nPostcode: " + postcode + "\nNaam van eigenaar: " + eigenaarNaam + "\nTelefoonnummer: " + dealerTelefoon + "\nEmail: " + dealerEmail);
        System.out.println(dealerInformatie);
    }

    public void setDealerEmail(String y) {
        this.dealerEmail = y;
    }

    public void setDealerTelefoonNummer(String x) {
        this.dealerTelefoon = x;
    }

    public String getDealerNaam() {
        return dealerNaam;
    }
}