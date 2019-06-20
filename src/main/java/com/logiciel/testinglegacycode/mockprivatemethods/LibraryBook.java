package com.logiciel.testinglegacycode.mockprivatemethods;

import java.util.Date;

/**
 * Problem: I want to test a method I have changed, but this method calls private methods containing legacy code
 *
 * Solution: Use a mocking framework that can mock private methods, so that we can isolate the unit of code we want to test
 *
 * Technique: Mocking private methods
 */
public class LibraryBook {

    public boolean isOverdue() {
        return getLoanDate().compareTo(getTodaysDate()) < 0;
    }

    /**
     * This contains the new code that we have written that we want to test
     */
    private Date getLoanDate() {
        return new Date(0);
    }

    /**
     * This contains horrible legacy code, that just won't run in our automation tests: We need to mock
     */
    private Date getTodaysDate() {
        return new Date(1);
    }
}
