package latihan;

class BicycleKu {

    // the BicycleKu class has
    // three fields
    public int cadence;
    public int gear;
    public int speed;

    // the BicycleKu class has
    // one constructor
    BicycleKu(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;

        // System.out.println("Cadence = " + startCadence + "\n" + "Speed = " + startSpeed + "\n" + "Gear = " + startGear);
        // System.out.println("================");
    }

    // the BicycleKu class has
    // four methods
    public void setCadence(int newValue) {

        cadence = newValue;
    }

    public void setGear(int newValue)
    {
        gear = newValue;
    }


    public int applyBrake(int decrement) {
        speed -= decrement;
        System.out.println("Speed Decrement become");
        return speed;
    }



    public void speedUp(int increment) {
        speed = speed+increment;
    }
}
