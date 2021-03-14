package com.company;

public class CurrencyConverter {

    public static int convertDramToDollar(int dram) {
        return (int) (dram / 526.63);
    }

    public static int convertDramToRuble(int dram) {
        return (int) (dram / 7.19);
    }

    public static int convertRubleToDollar(int ruble) {
        return (int) (ruble / 73.26);
    }

    public static int convertRubleToDram(int ruble) {
        return (int) (ruble * 7.19);
    }

    public static int convertDollarToDram(int dollar) {
        return (int) (dollar * 526.63);
    }

    public static int convertDollarToRuble(int dollar) {
        return (int) (dollar * 73.26);
    }
}
