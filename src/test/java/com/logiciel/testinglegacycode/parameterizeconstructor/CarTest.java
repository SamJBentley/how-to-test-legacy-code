package com.logiciel.testinglegacycode.parameterizeconstructor;

import com.logiciel.testinglegacycode.otherclasses.Engine;
import com.logiciel.testinglegacycode.parameterizeconstructor.CarNew;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.powermock.api.mockito.PowerMockito.*;

/**
 * Technique: Parameterize Constructor from Working Effectively with Legacy Code
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(fullyQualifiedNames = "com.logiciel.*")
public class CarTest {

    @Test
    public void canMockObjectsCreatedInConstructor() {
        // Mock the object for our new constructor
        Engine mockEngine = mock(Engine.class);
        when(mockEngine.getSize()).thenReturn(2.0);

        // Call our new constructor with the mocked Engine
        CarNew car = spy(new CarNew(mockEngine, 4));

        assertThat(car.engineSize()).isEqualTo(2.0);
    }
}