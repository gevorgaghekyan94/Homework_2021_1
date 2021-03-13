package com.company;

public final class CustomMath {

    private CustomMath() {

    }

    public static int giveNextPrime(int number) {
        int nextPrime = 0;
        boolean isPrime = true;
        for (int i = number; ; i++) {
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                } else {
                    isPrime = true;
                }
            }
            if (isPrime) {
                nextPrime = i;
                break;
            }
        }
        return nextPrime;
    }
}
