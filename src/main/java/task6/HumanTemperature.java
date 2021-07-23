package task6;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class HumanTemperature {
    private final double temperature;

    private HumanTemperature(double temperature) {
        this.temperature = temperature;
    }

    public static HumanTemperature of(double temperature) {
        if (temperature < 20 || temperature > 43) {
            throw new IllegalTemperatureValueException();
        }
        return new HumanTemperature(temperature);
    }

    public double getTemperature() {
        return temperature;
    }

    public double getKelvin() {
        return temperature + 273;
    }

    public double getFahrenheit() {
        BigDecimal constant = new BigDecimal("1.8");
        BigDecimal temperature = new BigDecimal(this.temperature);
        temperature = constant.multiply(temperature).add(new BigDecimal("32"));
        return temperature.doubleValue();
    }

    public boolean isNormal() {
        if (temperature < 36 || temperature > 37) {
            return false;
        }
        return true;
    }

    public String format() {
        return String.format("%.02f", temperature);
    }


}
