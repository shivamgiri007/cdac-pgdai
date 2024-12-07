package Submissions.day_8_Associations;

class Car {
    private String model;
    private Engine engine;

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
        engine.setCar(this); // Set the car in the engine
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return "Car Model: " + model + ", " + engine.toString();
    }
}

class Engine {
    private String type;
    private Car car;

    public Engine(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Car getCar() {
        return car;
    }

    @Override
    public String toString() {
        return "Engine Type: " + type;
    }
}


public class singleAssociation {
	    public static void main(String[] args) {
	        Engine engine = new Engine("V8");
	        Car car = new Car("Mustang", engine);

	        System.out.println(car);
	        System.out.println("Associated Engine: " + car.getEngine());
	        System.out.println("Associated Car from Engine: " + engine.getCar());
	    }
	


}
