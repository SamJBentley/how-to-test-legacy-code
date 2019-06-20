package com.logiciel.testinglegacycode.parameterizemethod;

import com.logiciel.testinglegacycode.otherclasses.Location;

/**
 * Problem: A method creates a legacy object that can't be mocked
 *
 * Solution: Add an overloaded method that can accept mocks for the legacy object, whilst keeping the production method signature the same
 *
 * Technique: Parameterize Method technique, from Working Effectively with Legacy Code
 */
public class UserOld {

    /**
     * Original method, which creates the legacy object {@link Location} that needs to be mocked
     */
    public String locationToString() {
        Location location = new Location("UK", "Cheshire");
        return location.getCity() + ", " + location.getCountry();
    }
}
