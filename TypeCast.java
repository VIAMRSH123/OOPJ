import java.util.Scanner;
class TypeCast {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter an integer for widening conversion: ");
    int inum1 = sc.nextInt();
    double dnum1 = inum1;
    System.out.println("Widening conversion: " + dnum1);

    System.out.print("Enter a double for explicit conversion: ");
    double dnum2 = sc.nextDouble();
    int inum2 = (int) dnum2;
    System.out.println("Explicit conversion: " + inum2);
  }
}