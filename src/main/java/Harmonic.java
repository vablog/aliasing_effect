
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
        this(harmonic, amplitude, deg ? degToRad(phase) : phase);
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
        this.phase = degToRad(phase);
    }

    public double getPhaseRad() {
        return phase;
    }

    public double getPhaseDeg() {
        return radToDeg(phase);
    }

    private static double degToRad(double deg){
        return (Math.PI/180.0) * deg;
    }

    private static double radToDeg(double rad){
        return (180.0/Math.PI) * rad;
    }
}
