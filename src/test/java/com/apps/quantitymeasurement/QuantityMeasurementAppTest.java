
package com.apps.quantitymeasurement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.apps.quantitymeasurement.QuantityMeasurementApp.Feet;

/**
 * Unit tests for QuantityMeasurementApp.Feet equality
 */
public class QuantityMeasurementAppTest {

    /**
     * Test Case 1:
     * givenSameFeetValue_whenCompared_shouldReturnTrue
     */
    @Test
    public void testFeetEquality_SameValue() {

        // Arrange
        Feet feet1 = new Feet(1.0);
        Feet feet2 = new Feet(1.0);

        // Act & Assert
        assertTrue(feet1.equals(feet2),
                "Expected feet measurements with same value to be equal");
    }

    /**
     * Test Case 2:
     * givenDifferentFeetValue_whenCompared_shouldReturnFalse
     */
    @Test
    public void testFeetEquality_DifferentValue() {

        // Arrange
        Feet feet1 = new Feet(1.0);
        Feet feet2 = new Feet(2.0);

        // Act & Assert
        assertFalse(feet1.equals(feet2),
                "Expected feet measurements with different values to NOT be equal");
    }

    /**
     * Test Case 3:
     * givenFeetAndNull_whenCompared_shouldReturnFalse
     */
    @Test
    public void testFeetEquality_NullComparison() {

        // Arrange
        Feet feet = new Feet(1.0);

        // Act & Assert
        assertFalse(feet.equals(null),
                "Expected feet measurement compared with null to return false");
    }

    /**
     * Test Case 4:
     * givenFeetAndDifferentClass_whenCompared_shouldReturnFalse
     */
    @Test
    public void testFeetEquality_DifferentClass() {

        // Arrange
        Feet feet = new Feet(1.0);
        String otherObject = "Not a Feet object";

        // Act & Assert
        assertFalse(feet.equals(otherObject),
                "Expected comparison with different class to return false");
    }

    /**
     * Test Case 5:
     * givenSameFeetReference_whenCompared_shouldReturnTrue
     */
    @Test
    public void testFeetEquality_SameReference() {

        // Arrange
        Feet feet = new Feet(1.0);

        // Act & Assert
        assertTrue(feet.equals(feet),
                "Expected same reference comparison to return true");
    }
}