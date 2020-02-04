package programku;

class Bermainclass{
    public static void main(String[] args) {
        Car ToyotaSupra = new Car(); 
        Car NissanSkyline = new Car(); 

        ToyotaSupra.changeMaxSpeed(250);
        ToyotaSupra.changeQty(25);
        ToyotaSupra.addInsurance(200000);
        ToyotaSupra.printAll();

        NissanSkyline.changeMaxSpeed(300);
        NissanSkyline.changeQty(25);
        NissanSkyline.addInsurance(200000);
        NissanSkyline.printAll();


    }
}