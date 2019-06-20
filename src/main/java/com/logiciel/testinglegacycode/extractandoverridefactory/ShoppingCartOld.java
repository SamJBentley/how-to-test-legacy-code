package com.logiciel.testinglegacycode.extractandoverridefactory;

import com.logiciel.testinglegacycode.otherclasses.Discounts;

/**
 * Problem: There are objects created deep in a call stack that can't be mocked
 *
 * Solution: Create a private factory method that creates the object, then override with PowerMockito
 *
 * Technique: Extract and Override Factory technique, from Working Effectively With Legacy Code
 */
public class ShoppingCartOld {

    public float calculateTotal() {
        return calculateShoppingTotal() - calculateDiscountTotal();
    }

    private float calculateShoppingTotal() {
        return 20f;
    }

    private float calculateDiscountTotal() {
        // Discounts is deep in the call stack, contains legacy code and looks like it can't be mocked
        return new Discounts().getDiscount();
    }
}
