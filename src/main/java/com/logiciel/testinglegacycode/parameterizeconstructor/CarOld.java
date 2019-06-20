package com.logiciel.testinglegacycode.parameterizeconstructor;

import com.logiciel.testinglegacycode.otherclasses.Engine;

/**
 * Problem: The constructor creates a legacy object that can't be mocked
 *
 * Solution: Add a new constructor that can accept mocks for the legacy object, whilst keeping the production method signature the same
 *
 * Technique: Parameterize Constructor technique, from Working Effectively With Legacy Code
 */
public class CarOld {

    /**
     * This property is used throughout this legacy class. In order to test {@link CarOld}, we need to mock this somehow.
     */
    private Engine engine;

    private int numWheels;

    /**
     * This is the original constructor, which creates an {@link Engine object}. {@link Engine} is used throughout this legacy class
     * and is impossible to get into a test suite.
     */
    public CarOld(int numWheels) {
        this.engine = new Engine();
        this.numWheels = numWheels;
    }

    public double engineSize() {
        return engine.getSize();
    }
}
