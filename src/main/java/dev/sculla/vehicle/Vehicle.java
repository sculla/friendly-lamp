package dev.sculla.vehicle;

public class Vehicle {
    int passangers;
    int fuelcap;
    int mpg;

    Vehicle(int passangers, int fuelcap, int mpg) {
        this.passangers = passangers;
        this.fuelcap = fuelcap;
        this.mpg = mpg;
    }

    Vehicle() {
    }

    void range() {
        System.out.printf(
                "The range of this vehicle is %d miles\n\n",
                fuelcap * mpg
        );
    }

    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }
}

class twoVehicles {
    public static void main(String... arags) {
        Vehicle minivan = new Vehicle(7, 16, 21);
        Vehicle sportscar = new Vehicle(2, 14, 12);
        int distance = 256;
        double gallons;

        gallons = minivan.fuelneeded(distance);

        System.out.println("it will take " + gallons + " gallons to go " + distance + " miles in a minivan");

        gallons = sportscar.fuelneeded(distance);
        System.out.println("it will take " + gallons + " gallons to go " + distance + " miles in a sports car");

    }

}
