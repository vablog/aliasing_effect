package application.wave;

import java.util.ArrayList;
import java.util.List;

public class Wave {

    private double offset;
    private double frequency;
    private Harmonic firstHarmonic;
    private List<Harmonic> higherHarmonics = new ArrayList<>();

    public Wave(double offset, double frequency , Harmonic firstHarmonic){
        firstHarmonic.setHarmonic(1);
        setFirstHarmonic(firstHarmonic);
        setFrequency(frequency);
        setOffset(offset);
    }

    public Wave(Harmonic firstHarmonic){
        this(0.0, firstHarmonic);
    }

    public Wave(double offset, double frequency, Harmonic firstHarmonic, Harmonic... higherHarmonics){
        this(offset, frequency, firstHarmonic);
        for (Harmonic h: higherHarmonics) {
            this.addHigherHarmonic(h);
        }
    }

    public Wave(double frequency, Harmonic firstHarmonic, Harmonic... higherHarmonics){
        this(0.0, frequency, firstHarmonic);
        for (Harmonic h: higherHarmonics) {
            this.addHigherHarmonic(h);
        }
    }

    public double getOffset() {
        return offset;
    }

    public void setOffset(double offset) {
        this.offset = offset;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public void setFirstHarmonic(Harmonic firstHarmonic) {
        firstHarmonic.setHarmonic(1);
        this.firstHarmonic = firstHarmonic;
    }

    public Harmonic getFirstHarmonic() {
        return firstHarmonic;
    }

    public void addHigherHarmonic(Harmonic harmonic){
        for (Harmonic h: higherHarmonics) {
            if(harmonic.getHarmonic() == h.getHarmonic()) {
                throw new RuntimeException("Harmonic already exists");
            }

            if(h.getHarmonic() == 1) {
                throw new RuntimeException("You can not add the first harmonic");
            }
        }
        higherHarmonics.add(harmonic);
    }

    public double getInstantaneousValue(double time){
        double value = offset;
        value += (this.firstHarmonic.getAmplitude() * Math.sin((2 * Math.PI * frequency * time) + firstHarmonic.getPhaseRad()));
        for (Harmonic h: higherHarmonics) {
            value += (h.getAmplitude() * Math.sin((2 * Math.PI * (double)h.getHarmonic() * frequency * time) + h.getPhaseRad()));
        }
        return value;
    }
}