package com.logiciel.testinglegacycode.parameterizemethod;

import com.logiciel.testinglegacycode.otherclasses.Location;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.powermock.api.mockito.PowerMockito.mock;
import static org.powermock.api.mockito.PowerMockito.when;

/**
 * Technique: Parameterize Method from Working Effectively with Legacy Code
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(fullyQualifiedNames = "com.logiciel.*")
public class UserNewTest {

    @Test
    public void locationToString() {
        // Mock the object for our new method
        Location mockLocation = mock(Location.class);
        when(mockLocation.getCity()).thenReturn("Barcelona");
        when(mockLocation.getCountry()).thenReturn("Spain");

        // Call our new method with the mocked Location
        String locationString = new UserNew().locationToString(mockLocation);

        assertThat(locationString).isEqualTo("Barcelona, Spain");
    }
}