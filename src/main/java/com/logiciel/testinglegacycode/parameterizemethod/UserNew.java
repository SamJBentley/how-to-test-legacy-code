package com.logiciel.testinglegacycode.parameterizemethod;

import com.logiciel.testinglegacycode.otherclasses.Location;

public class UserNew {

    /**
     * Original method signature, which will be used in production and will work the same before the refactor
     */
    public String locationToString() {
        return locationToString(new Location("UK", "Cheshire"));
    }

    /**
     * New overloaded method, that we will use in tests with a mocked {@link Location}
     */
    public String locationToString(Location location) {
        return location.getCity() + ", " + location.getCountry();
    }
}
