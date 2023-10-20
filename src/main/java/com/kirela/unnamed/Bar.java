package com.kirela.unnamed;

public class Bar {
    public static int parse(String num) {
        try {
            return Integer.parseInt(num);
        } catch (NumberFormatException _) {
            return -1;
        }
    }
}
