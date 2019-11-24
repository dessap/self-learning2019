package com.company.basics;

public class OperatorsChallenge {
    public OperatorsChallenge(double doubleNumber1, double doubleNumber2) {
        double doubleOperation = (doubleNumber1 + doubleNumber2) * 100.00;
        double remainder = doubleOperation % 40.00;
        boolean isRemainderZero = remainder == 0;

        if (!isRemainderZero) {
            System.out.println("Got some remainder " + remainder);
        }
    }
}
