import java.util.ArrayList;
import java.util.List;

public class ComplexWave {

    private double offset;
    private SineWave firstHarmonic;
    private List<Harmonic> harmonics = new ArrayList<Harmonic>();

    ComplexWave(double offset, SineWave firstHarmonic ){
        setFirstHarmonic(firstHarmonic); setOffset(offset);
    }

    ComplexWave(SineWave firstHarmonic){
        this(0.0, firstHarmonic);
    }

    ComplexWave(double offset, SineWave firstHarmonic, Harmonic...harmonics){
        this(offset, firstHarmonic);
        for (Harmonic h: harmonics) {
            this.addHarmonic(h);
        }
    }

    ComplexWave(SineWave firstHarmonic, Harmonic...harmonics){
        this(0.0, firstHarmonic);
        for (Harmonic h: harmonics) {
            this.addHarmonic(h);
        }
    }

    public double getOffset() {
        return offset;
    }

    public void setOffset(double offset) {
        this.offset = offset;
    }

    public void setFirstHarmonic(SineWave firstHarmonic) {
        this.firstHarmonic = firstHarmonic;
    }

    public SineWave getFirstHarmonic() {
        return firstHarmonic;
    }

    public void addHarmonic(Harmonic harmonic){
        for (Harmonic h: harmonics) {
            if(harmonic.getHarmonic() == h.getHarmonic()) {
                throw new RuntimeException("Harmonic already exists");
            }
        }
        harmonics.add(harmonic);
    }

    public double getInstantaneousValue(double time){
        double value = offset;
        value += (this.firstHarmonic.getAmplitude() * Math.sin((2 * Math.PI * firstHarmonic.getFrequency() * time) + firstHarmonic.getPhaseRad()));
        for (Harmonic h: harmonics) {
            value += (h.getAmplitude() * Math.sin((2 * Math.PI * (double)h.getHarmonic() * firstHarmonic.getFrequency() * time) + h.getPhaseRad()));
        }
        return value;
    }
}