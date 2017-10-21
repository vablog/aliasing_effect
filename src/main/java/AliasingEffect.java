
public class AliasingEffect {

    public static void main ( String [] arguments ) {
        ComplexWave voltageWave = new ComplexWave(new SineWave(230.0 * Math.sqrt(2.0), 50.0, 90.0, true));

        System.out.println(voltageWave.getInstantaneousValue(0.01));
    }
}
