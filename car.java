public class car {
    String make;
    String model;
    int year;

    public car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Car: " + year + " " + make + " " + model);
    }
}
