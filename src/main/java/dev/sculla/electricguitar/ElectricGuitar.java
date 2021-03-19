package dev.sculla.electricguitar;

public class ElectricGuitar {
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getNumOfPickups() {
        return numOfPickups;
    }

    public void setNumOfPickups(int numOfPickups) {
        this.numOfPickups = numOfPickups;
    }

    public boolean isRockStarUsesIt() {
        return rockStarUsesIt;
    }

    public void setRockStarUsesIt(boolean rockStarUsesIt) {
        this.rockStarUsesIt = rockStarUsesIt;
    }

    private String brand;
    private int numOfPickups;
    private boolean rockStarUsesIt;


}
