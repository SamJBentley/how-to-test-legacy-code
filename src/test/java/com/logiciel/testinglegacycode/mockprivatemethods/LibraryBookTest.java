package com.logiciel.testinglegacycode.mockprivatemethods;

import com.logiciel.testinglegacycode.mockprivatemethods.LibraryBook;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.Date;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Technique: Mocking private methods
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(fullyQualifiedNames = "com.logiciel.*")
public class LibraryBookTest {

    @Test
    public void canMockPrivateMethodsContaingLegacyCode() throws Exception {
        LibraryBook libraryBook = PowerMockito.spy(new LibraryBook());

        // Mock the legacy private method
        PowerMockito.when(libraryBook, "getTodaysDate").thenReturn(new Date(0));

        // Should fail if legacy method has not been mocked
        assertThat(libraryBook.isOverdue()).isFalse();
    }
}