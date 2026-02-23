
package com.apps.quantitymeasurement;

//feature/UC4-YardEquality
import java.util.Objects;
    // Enum for all supported unit
    public enum LengthUnit {
        FEET(12.0),         // 1 foot = 12 inches
        INCHES(1.0),        // base unit
        YARDS(36.0),        // 1 yard = 3 feet = 36 inches
        CENTIMETERS(0.393701); // 1 cm = 0.393701 inches
 dev

// Generic Length class applying DRY principle
public class Length {
    public Length(double value, LengthUnit unit) {
        if (unit == null) {
            throw new IllegalArgumentException("Unit cannot be null");
        }
        this.value = value;
        this.unit = unit;
    }

    private double convertToBaseUnit() {
        return value * unit.getConversionFactor();
    }

    public boolean compare(Length other) {
        if (other == null) {
            return false;
        }
        return Double.compare(
                this.convertToBaseUnit(),
                other.convertToBaseUnit()
        ) == 0;
    }

    
    private double round(double value) {
        return Math.round(value * 10000.0) / 10000.0;
    }
    
    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;
        if (!(obj instanceof Length)) return false;

        Length other = (Length) obj;

        return round(this.convertToBaseUnit())
                == round(other.convertToBaseUnit());
    }

    @Override
    public int hashCode() {
        return Objects.hash(round(convertToBaseUnit()));
    }

    @Override
    public String toString() {
        return "Quantity(" + value + ", " + unit + ")";
    }
}
