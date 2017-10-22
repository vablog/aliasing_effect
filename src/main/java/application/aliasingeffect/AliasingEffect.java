package application.aliasingeffect;

import application.analogdigitalconverter.AnalogDigitalConverter;
import application.wave.Harmonic;
import application.wave.Wave;

public class AliasingEffect {

    public static void main ( String [] arguments ) {
        Wave voltageWave = new Wave(50.0, new Harmonic(230.0 * Math.sqrt(2.0), 0.0, true));
        AnalogDigitalConverter adc = new AnalogDigitalConverter(5000.0);

        adc.measureWave(voltageWave);

        for (Double d: adc.getSamples()) {
            System.out.println(d);
        }
    }
}
