package application.analogdigitalconverter;

import application.wave.Wave;

import java.util.ArrayList;
import java.util.List;

public class AnalogDigitalConverter {

    private double samplingFrequency;
    private List<Double> samples = new ArrayList<Double>();

    public AnalogDigitalConverter(double samplingFrequency){
        this.samplingFrequency = samplingFrequency;
    }

    public double getSamplingFrequency() {
        return samplingFrequency;
    }

    public void setSamplingFrequency(double samplingFrequency) {
        this.samplingFrequency = samplingFrequency;
    }

    public List<Double> getSamples() {
        return samples;
    }

    public void setSamples(List<Double> samples) {
        this.samples = samples;
    }

    public void measureWave(Wave wave){

        double samplingTime = 1.0/samplingFrequency;
        double endSamplingTime = 1.0/wave.getFrequency();
        double time = 0;

        samples.clear();

        while(time <= endSamplingTime){
            samples.add(wave.getInstantaneousValue(time));
            time += samplingTime;
        }
    }
}
