package org.launchcode;
import java.util.HashMap;

public class Count {
    public static void main(String [] args) {

        String quote = "It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only.";
        char[] quoteArray = quote.toCharArray();
        HashMap<Character, Integer> finalMap = new HashMap<>();

        for (char letter : quoteArray) {
            if (!finalMap.containsKey(letter)) {
                finalMap.put(letter, 1);
            } else {
                int increment = finalMap.get(letter);
                finalMap.put(letter, increment + 1);
            }

        }
        for (Character entry : finalMap.keySet()) {
            System.out.println(entry + " : " + finalMap.get(entry));
        }
        }
    }
