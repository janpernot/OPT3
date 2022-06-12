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
    private String dealerEmail;
    private String dealerTelefoon;

    public AutoDealer(String dealerNaam, String provincie, String stad, String adres, String postcode) {
        this.dealerNaam = dealerNaam;
        this.provincie = provincie;
        this.stad = stad;
        this.adres = adres;
        this.postcode = postcode;
    }

    public String getDealerNaam() {
        return dealerNaam;
    }

    public void printDealerInfo() {
        String dealerInformatie = ("De informatie van " + dealerNaam + " is:\nProvincie: " + provincie + "\nStad: " + stad + "\nPostcode: " + postcode);
        System.out.println(dealerInformatie);
    }
}