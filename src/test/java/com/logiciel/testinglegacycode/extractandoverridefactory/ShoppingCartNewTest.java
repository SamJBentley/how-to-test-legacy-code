package com.logiciel.testinglegacycode.extractandoverridefactory;

import com.logiciel.testinglegacycode.otherclasses.Discounts;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.powermock.api.mockito.PowerMockito.mock;
import static org.powermock.api.mockito.PowerMockito.when;

/**
 * Technique: Extract and Override Factory method from Working Effectively with Legacy Code
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(fullyQualifiedNames = "com.logiciel.*")
public class ShoppingCartNewTest {

    @Test
    public void canMockFactoryMethods() throws Exception {
        ShoppingCartNew shoppingCart = PowerMockito.spy(new ShoppingCartNew());

        // Mock Discounts and the factory method
        Discounts mockDiscounts = mock(Discounts.class);
        when(mockDiscounts.getDiscount()).thenReturn(5);
        when(shoppingCart, "discountFactory").thenReturn(mockDiscounts);

        // Will fail if factory method has not been mocked
        assertThat(shoppingCart.calculateTotal()).isEqualTo(15);
    }
}