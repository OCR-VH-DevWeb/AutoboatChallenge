public class Boat extends Vehicle {

  // constructor
  public Boat(String brand, int kilometers) {
    super(brand);
    this.setKilometers(kilometers);
  }

  @Override
  public String doStuff() {
    return "Je suis " + this.getBrand() + " et je fais glou glou !";
  }

}
