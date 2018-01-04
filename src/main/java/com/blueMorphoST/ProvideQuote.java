package com.blueMorphoST;


import java.util.Random;

public class ProvideQuote {
    private final String TheOracleSays;

    public ProvideQuote() {
        String[] quoteList = new String[]{
                "Live long and prosper",
                "Highly illogical",
                "Beam me up Scotty",
                "To boldly go where no man has gone before"
        };
        Random random = new Random();
        this.TheOracleSays = quoteList[random.nextInt(quoteList.length)];
    }

    public String getTheOracleSays() {
        return TheOracleSays;
    }
}
