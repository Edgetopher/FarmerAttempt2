package Shady;

abstract class Vehicle implements NoiseMaker{
    private String color;
    private int wheels;
    private boolean engine;
    private int speed;

    public Vehicle(String color, int wheels, boolean engine, int speed) {
        this.color = color;
        this.wheels = wheels;
        this.engine = engine;
        this.speed = speed;
    }

    public Vehicle() {
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWheels() {
        return this.wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
    public boolean getEngine(){
        return this.engine;
    }
    public void setEngine(boolean engine){
        this.engine = engine;
    }
    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String makeVehicle(){
        return "This vehicle is " + makeVehicle();
    }

}
