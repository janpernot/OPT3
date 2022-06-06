package com.company;

public class Munteenheid {
    private static Munteenheid object;
    // private constructor to force use of
    // getInstance() to create Singleton object
    private Munteenheid() {}

    public static Munteenheid getInstance()
    {
        if (object==null)
            object = new Munteenheid();
            return object;
    }
    public String getCanadianDollar(){
        return "Canadian Dollar";
    }
}
