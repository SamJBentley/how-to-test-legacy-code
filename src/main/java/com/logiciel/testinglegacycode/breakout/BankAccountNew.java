package com.logiciel.testinglegacycode.breakout;

public class BankAccountNew {

    public int getBalance() {
        // Code we want to test
        int codeWeWantToTest = 10;

        return codeWeWantToTest + lotsOfCodeHere() + loadsOfCodeHere() + evenModeCodeHere();
    }

    /**
     * These 3 methods were created using the IDE's Extract Method refactoring technique.
     *
     * We can mock them using PowerMockito
     */

    private int lotsOfCodeHere() {
        return 1;
    }

    private int loadsOfCodeHere() {
        return 2;
    }

    private int evenModeCodeHere() {
        return 3;
    }
}
