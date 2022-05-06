package com.company;

public abstract class Post {
    private String tijdsbestek;
    private String postNummer;

    Post(String tijdsbestek, String postNummer) {
        this.tijdsbestek = tijdsbestek;
        this.postNummer = postNummer;
    }

    public String getTijdsbestek() {
        return tijdsbestek;
    }

    public String getPostNummer() {
        return postNummer;
    }

}
