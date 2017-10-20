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
        this(amplitude, frequency, deg ? degToRad(phase) : phase);
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
        return radToDeg(phase);
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
        this.phase = degToRad(phase);
    }

    private static double degToRad(double deg){
        return (Math.PI/180.0) * deg;
    }

    private static double radToDeg(double rad){
        return (180.0/Math.PI) * rad;
    }
}
