
public class AliasingEffect {

    public static void main ( String [] arguments ) {
        Wave voltageWave = new Wave(50.0, new Harmonic(230.0 * Math.sqrt(2.0), 90.0, true));

        System.out.println(voltageWave.getInstantaneousValue(0.01));
    }
}
