public class SineWave {

    private double amplitude;
    private double frequency;
    private double phase;

    public SineWave(double amplitude, double frequency, double phase){
        setAmplitude(amplitude);
        setFrequency(frequency);
        setPhaseRad(phase);
    }

    public SineWave(double amplitude, double frequency, double phase, boolean deg){
        this(amplitude, frequency, deg ? Math.toRadians(phase) : phase);
    }

    public SineWave(){
        this(0.0, 0.0, 0.0);
    }

    public double getAmplitude() {
        return amplitude;
    }

    public double getFrequency() {
        return frequency;
    }

    public double getPhaseRad() {
        return phase;
    }

    public double getPhaseDeg() {
        return Math.toDegrees(phase);
    }

    public void setAmplitude(double amplitude) {
        this.amplitude = amplitude;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public void setPhaseRad(double phase) {
        this.phase = phase;
    }

    public void setPhaseDeg(double phase) {
        this.phase = Math.toRadians(phase);
    }
}
