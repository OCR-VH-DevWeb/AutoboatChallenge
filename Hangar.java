public class Hangar {

  public static void main(String[] args) {

    // create instances of Car and Boat
    Car clio = new Car("Clio", 142000);
    Boat titanic = new Boat("Titanic", 5000);
    Car impreza = new Car("Impreza", 3000);
    Boat france = new Boat("Le France", 73800);

    // display the result of doStuff() for each instance
    System.out.println(clio.doStuff() + " " + "J'ai parcouru " + clio.getKilometers() + " kilomètres.");
    System.out.println(titanic.doStuff() + " " + "J'ai parcouru " + titanic.getKilometers() + " kilomètres.");
    System.out.println(impreza.doStuff() + " " + "J'ai parcouru " + impreza.getKilometers() + " kilomètres.");
    System.out.println(france.doStuff() + " " + "J'ai parcouru " + france.getKilometers() + " kilomètres.");
  }

}
