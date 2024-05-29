
public class Fitbyte {
    private int age, restingHeartRate;
    
    public Fitbyte(int age , int restingHeartRate){
        this.age = age;
        this.restingHeartRate = restingHeartRate;
    }
    
    public double targetHeartRate(double percentageOfMaximum){
        double MaximumHeartRate = 206.3 - (0.711 * age);
        return (MaximumHeartRate - restingHeartRate) * (percentageOfMaximum) + restingHeartRate;
    }
    
}
