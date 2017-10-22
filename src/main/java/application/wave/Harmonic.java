package application.wave;

public class Harmonic {

    private int harmonic;
    private double amplitude;
    private double phase;

    public Harmonic(int harmonic, double amplitude, double phase)
    {
        setHarmonic(harmonic);
        setAmplitude(amplitude);
        setPhaseRad(phase);
    }

    public Harmonic(int harmonic, double amplitude, double phase, boolean deg)
    {
        this(harmonic, amplitude, deg ? Math.toRadians(phase) : phase);
    }

    public Harmonic(double amplitude, double phase, boolean deg)
    {
        this(1, amplitude, deg ? Math.toRadians(phase) : phase);
    }

    public Harmonic(double amplitude, double phase)
    {
        this(1, amplitude, phase);
    }

    public int getHarmonic() {
        return harmonic;
    }

    public void setHarmonic(int harmonic) {
        this.harmonic = harmonic;
    }

    public double getAmplitude() {
        return amplitude;
    }

    public void setAmplitude(double amplitude) {
        this.amplitude = amplitude;
    }

    public void setPhaseRad(double phase) {
        this.phase = phase;
    }

    public void setPhaseDeg(double phase) {
        this.phase = Math.toRadians(phase);
    }

    public double getPhaseRad() {
        return phase;
    }

    public double getPhaseDeg() {
        return Math.toDegrees(phase);
    }

}
