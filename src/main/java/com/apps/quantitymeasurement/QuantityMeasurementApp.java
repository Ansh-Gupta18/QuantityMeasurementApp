package com.apps.quantitymeasurement;

/**
 * QuantityMeasurementApp – UC1: Feet measurement equality
 *
 * This class is responsible for checking the equality of two numerical values
 * measured in feet in the Quantity Measurement Application.
 */
public class QuantityMeasurementApp {

    // Inner class to represent Feet measurement
    public static class Feet {

        // Immutable value field
        private final double value;

        /**
         * Constructor to initialize feet value
         * @param value measurement in feet
         */
        public Feet(double value) {
            this.value = value;
        }

        /**
         * Override equals() method to compare two Feet objects based on their value
         *
         * Important Checks:
         * 1. Reference Check
         * 2. Null Check
         * 3. Type Check
         * 4. Value Comparison using Double.compare()
         *
         * @param obj object to compare
         * @return true if equal, false otherwise
         */
        @Override
        public boolean equals(Object obj) {

            // 1. Reference check
            if (this == obj) {
                return true;
            }

            // 2. Null check
            if (obj == null) {
                return false;
            }

            // 3. Type check
            if (getClass() != obj.getClass()) {
                return false;
            }

            // 4. Cast object safely
            Feet other = (Feet) obj;

            // 5. Compare double values using Double.compare
            return Double.compare(this.value, other.value) == 0;
        }

        /**
         * Optional: Override hashCode when equals is overridden (best practice)
         */
        @Override
        public int hashCode() {
            return Double.hashCode(value);
        }
    }

    /**
     * Main method to test Feet equality
     */
    public static void main(String[] args) {

        Feet feet1 = new Feet(1.0);
        Feet feet2 = new Feet(1.0);
        Feet feet3 = new Feet(2.0);

        System.out.println("feet1 equals feet2: " + feet1.equals(feet2)); // true
        System.out.println("feet1 equals feet3: " + feet1.equals(feet3)); // false
        System.out.println("feet1 equals null: " + feet1.equals(null));   // false
        System.out.println("feet1 equals itself: " + feet1.equals(feet1)); // true
    }
}