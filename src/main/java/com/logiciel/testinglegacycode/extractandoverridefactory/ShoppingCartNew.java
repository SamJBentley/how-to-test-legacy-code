package com.logiciel.testinglegacycode.extractandoverridefactory;

import com.logiciel.testinglegacycode.otherclasses.Discounts;

public class ShoppingCartNew {

    public int calculateTotal() {
        return calculateShoppingTotal() - calculateDiscountTotal();
    }

    private int calculateShoppingTotal() {
        return 20;
    }

    private int calculateDiscountTotal() {
        // We've replaced the constructor call with a factory method call
        return discountFactory().getDiscount();
    }

    /**
     * We've created a factory method that creates a Discount, which we can override with PowerMockito
     */
    private Discounts discountFactory() {
        return new Discounts();
    }
}
