public class Car extends Vehicle {

  // constructor
  public Car(String brand, int kilometers) {
    super(brand);
    this.setKilometers(kilometers);
  }

  @Override
  public String doStuff() {
    return "Je suis " + this.getBrand() + " et je fais vroum vroum !";
  }
}
