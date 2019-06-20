package com.logiciel.testinglegacycode.parameterizeconstructor;

import com.logiciel.testinglegacycode.otherclasses.Engine;

public class CarNew {

    private Engine engine;

    private int numWheels;

    /**
     * This is the original constructor, which still creates an {@link Engine object}, but calls our new constructor.
     * The production code will maintain existing behaviour.
     */
    public CarNew(int numWheels) {
        this(new Engine(), numWheels);
    }

    /**
     * This is the new constuctor, that we will use in our unit tests. We can now mock {@link Engine} and get {@link CarNew} unit tested
     * This constructor will be used in tests only, production code will use the original constructor
     */
    public CarNew(Engine engine, int numWheels) {
        this.engine = engine;
        this.numWheels = numWheels;
    }

    public double engineSize() {
        return engine.getSize();
    }
}
