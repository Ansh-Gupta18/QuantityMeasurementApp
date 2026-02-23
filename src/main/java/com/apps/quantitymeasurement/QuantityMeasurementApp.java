package com.apps.quantitymeasurement;

/**
 * QuantityMeasurementApp – UC1 & UC2: Feet and Inches measurement equality
 *
 * This class checks equality of measurements in Feet and Inches.
 */
public class QuantityMeasurementApp {

    // ================================
    // Inner class to represent Feet measurement
    // ================================
    public static class Feet {

        private final double value;

        public Feet(double value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object obj) {

            // Reference check
            if (this == obj)
                return true;

            // Null check
            if (obj == null)
                return false;

            // Type check
            if (getClass() != obj.getClass())
                return false;

            // Cast safely
            Feet other = (Feet) obj;

            // Compare values
            return Double.compare(this.value, other.value) == 0;
        }

        @Override
        public int hashCode() {
            return Double.hashCode(value);
        }
    }


    // ================================
    // Inner class to represent Inches measurement (UC2)
    // ================================
    public static class Inches {

        private final double value;

        public Inches(double value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object obj) {

            // Reference check
            if (this == obj)
                return true;

            // Null check
            if (obj == null)
                return false;

            // Type check
            if (getClass() != obj.getClass())
                return false;

            // Cast safely
            Inches other = (Inches) obj;

            // Compare values
            return Double.compare(this.value, other.value) == 0;
        }

        @Override
        public int hashCode() {
            return Double.hashCode(value);
        }
    }


    // ================================
    // Method to demonstrate Feet equality
    // ================================
    public static void demonstrateFeetEquality() {

        Feet feet1 = new Feet(1.0);
        Feet feet2 = new Feet(1.0);
        Feet feet3 = new Feet(2.0);

        System.out.println("Feet Equality:");
        System.out.println("1.0 ft == 1.0 ft : " + feet1.equals(feet2)); // true
        System.out.println("1.0 ft == 2.0 ft : " + feet1.equals(feet3)); // false
    }


    // ================================
    // Method to demonstrate Inches equality
    // ================================
    public static void demonstrateInchesEquality() {

        Inches inch1 = new Inches(12.0);
        Inches inch2 = new Inches(12.0);
        Inches inch3 = new Inches(24.0);

        System.out.println("\nInches Equality:");
        System.out.println("12.0 in == 12.0 in : " + inch1.equals(inch2)); // true
        System.out.println("12.0 in == 24.0 in : " + inch1.equals(inch3)); // false
    }


    // ================================
    // Main method
    // ================================
    public static void main(String[] args) {

        demonstrateFeetEquality();
        demonstrateInchesEquality();

    }
}