package programku;

class Car {
    int maxSpeed = 0;
    int insurance = 0;
    int qty = 0;

    void changeMaxSpeed(int newValue){
        maxSpeed = newValue;
    }

    void changeQty(int newValue){
        qty = newValue;
    }

    void addInsurance(int insuranceAdd){
        insurance = insurance +insuranceAdd;
    }

    void discountInsruance(int insuranceDiscount){
        insurance = insurance - insuranceDiscount;
    }

    void printAll(){
        System.out.println("This car max speed is = " + maxSpeed + " and u must pay insurance = " + insurance +" and " + qty + " car available");
    }
}