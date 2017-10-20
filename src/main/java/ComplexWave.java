import java.util.ArrayList;
import java.util.List;

public class ComplexWave {

    private double offset;
    private SineWave firstHarmonic;
    private List<Harmonic> harmonics = new ArrayList<Harmonic>();

    ComplexWave(SineWave firstHarmonic){
        setFirstHarmonic(firstHarmonic);
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
}