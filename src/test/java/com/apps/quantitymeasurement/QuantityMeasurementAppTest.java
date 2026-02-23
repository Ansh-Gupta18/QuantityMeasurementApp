package com.apps.quantitymeasurement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.apps.quantitymeasurement.QuantityMeasurementApp.Feet;
import com.apps.quantitymeasurement.QuantityMeasurementApp.Inches;

/**
 * Unit tests for Feet and Inches equality
 */
public class QuantityMeasurementAppTest {

    // ============================
    // FEET TEST CASES (UC1)
    // ============================

    @Test
    public void testFeetEquality_SameValue() {

        Feet feet1 = new Feet(1.0);
        Feet feet2 = new Feet(1.0);

        assertTrue(feet1.equals(feet2),
                "Expected same feet values to be equal");
    }

    @Test
    public void testFeetEquality_DifferentValue() {

        Feet feet1 = new Feet(1.0);
        Feet feet2 = new Feet(2.0);

        assertFalse(feet1.equals(feet2),
                "Expected different feet values to NOT be equal");
    }

    @Test
    public void testFeetEquality_NullComparison() {

        Feet feet = new Feet(1.0);

        assertFalse(feet.equals(null),
                "Expected feet compared with null to return false");
    }

    @Test
    public void testFeetEquality_DifferentClass() {

        Feet feet = new Feet(1.0);
        Inches inches = new Inches(12.0);

        assertFalse(feet.equals(inches),
                "Expected feet and inches comparison to return false");
    }

    @Test
    public void testFeetEquality_SameReference() {

        Feet feet = new Feet(1.0);

        assertTrue(feet.equals(feet),
                "Expected same reference comparison to return true");
    }


    // ============================
    // INCHES TEST CASES (UC2)
    // ============================

    @Test
    public void testInchesEquality_SameValue() {

        Inches inch1 = new Inches(12.0);
        Inches inch2 = new Inches(12.0);

        assertTrue(inch1.equals(inch2),
                "Expected same inches values to be equal");
    }

    @Test
    public void testInchesEquality_DifferentValue() {

        Inches inch1 = new Inches(12.0);
        Inches inch2 = new Inches(24.0);

        assertFalse(inch1.equals(inch2),
                "Expected different inches values to NOT be equal");
    }

    @Test
    public void testInchesEquality_NullComparison() {

        Inches inch = new Inches(12.0);

        assertFalse(inch.equals(null),
                "Expected inches compared with null to return false");
    }

    @Test
    public void testInchesEquality_DifferentClass() {

        Inches inch = new Inches(12.0);
        Feet feet = new Feet(1.0);

        assertFalse(inch.equals(feet),
                "Expected inches and feet comparison to return false");
    }

    @Test
    public void testInchesEquality_SameReference() {

        Inches inch = new Inches(12.0);

        assertTrue(inch.equals(inch),
                "Expected same reference comparison to return true");
    }

}