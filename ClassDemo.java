import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Car myCar = new Car();
    System.out.print("Enter car name: ");
    myCar.carName = sc.nextLine();
    System.out.print("Enter car model: ");
    myCar.carModel = sc.nextLine();
    System.out.print("Enter car manufacturing year: ");
    myCar.carYear = sc.nextInt();
    System.out.println("\nThe Car details are :-");
    System.out.println(
        myCar.carName + "\t" + myCar.carModel + "\t" + myCar.carYear + "\t");
    myCar.drive();
  }
}
class Car {
  String carName;
  String carModel;
  int carYear;
  void drive() {
    System.out.println("The car is driving ");
  }
}