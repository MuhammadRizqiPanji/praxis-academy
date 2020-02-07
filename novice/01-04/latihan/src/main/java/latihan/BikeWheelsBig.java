package latihan;

public class BikeWheelsBig extends BicycleKu{
    public int WheelsLarge;

    public BikeWheelsBig(int startWheelsLarge, int startCadence, int startSpeed, int startGear){
        super(startCadence,startSpeed,startGear); 
        WheelsLarge = startWheelsLarge; 
        System.out.println("WheelsLarge = " + startWheelsLarge +"\n"+ "Cadence = " + startCadence + "\n" + "Speed = " + startSpeed + "\n" + "Gear = " + startGear);
        System.out.println("================");
    }
}