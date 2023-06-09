package org.sample.myapp;

import org.sample.numberutils.Numbers;
import org.sample.stringutils.Strings;

public class Main {

    public static void main(String... args) {
        new Main().printAnswer();
    }

    public void printAnswer() {
        String output = Strings.concat(" The answer for addition is: ", Numbers.add(19, 23));
        System.out.println(output);

        output = Strings.concat("The answer for multiplication is: ", Numbers.multiply(19, 23));
        System.out.println(output);
    }
}
