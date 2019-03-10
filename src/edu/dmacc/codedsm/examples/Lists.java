package edu.dmacc.codedsm.examples;

import java.util.ArrayList;

public class Lists {
    public static final int[] INTEGERS = new int[10];
    public static final ArrayList<String> STRINGS = new ArrayList<String>();

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            INTEGERS[i] = i;
        }

        STRINGS.add("zero");
        STRINGS.add("one");
        STRINGS.add("two");
        STRINGS.add("three");
        STRINGS.add("four");
        STRINGS.add("five");
        STRINGS.add("six");
        STRINGS.add("seven");
        STRINGS.add("eight");
        STRINGS.add("nine");

        for (int j = 0; j < INTEGERS.length; j++) {
            System.out.println(j + " was \'" + STRINGS.get(j) + "\'");
        }

        for (String s : STRINGS) {
            System.out.println("s = " + s);
        }
    }

}
