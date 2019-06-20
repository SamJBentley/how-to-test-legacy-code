package com.logiciel.testinglegacycode.breakout;

/**
 * Problem: The method we want to test is huge, with lots of dependencies. We'll spend all day mocking them
 *
 * Solution: Use the IDE's Extract Method refactoring technique to split the large method up into lots of private method, which we can then mock.
 * Using the IDE to do this is usually reliable
 *
 * Technique: Break Out technique, from Working Effectively With Legacy Code
 */
public class BankAccountOld {

    public int getBalance() {
        // Code we want to test
        int codeWeWantToTest = 10;

        // Lots of code, with lots of objects being created here
        int lotsOfCode = 1;

        // Loads of code, with loads of objects being created here
        int loadsOfCodeHere = 2;

        // Even more code, with even more objects being created here
        int evenMoreCodeHere = 3;

        return codeWeWantToTest + lotsOfCode + loadsOfCodeHere + evenMoreCodeHere;
    }
}
