package com.logiciel.testinglegacycode.breakout;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.powermock.api.mockito.PowerMockito.when;

/**
 * Technique: Break Out method from Working Effectively with Legacy Code
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(fullyQualifiedNames = "com.logiciel.*")
public class BankAccountNewTest {

    @Test
    public void canMockExtractedPrivateMethods() throws Exception {
        BankAccountNew bankAccount = PowerMockito.spy(new BankAccountNew());

        // Mock the private methods that we've extracted
        when(bankAccount, "lotsOfCodeHere").thenReturn(11);
        when(bankAccount, "loadsOfCodeHere").thenReturn(12);
        when(bankAccount, "evenModeCodeHere").thenReturn(13);

        // This will fail if we've not mocked the extracted methods
        assertThat(bankAccount.getBalance()).isEqualTo(46);
    }
}