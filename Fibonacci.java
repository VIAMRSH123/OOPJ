import java.util.Scanner;

class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int num = sc.nextInt();
        int prevNum = 0, newNum = 1;

        if (num >= 1) {
            System.out.print(prevNum + " ");
        }
        if (num >= 2) {
            System.out.print(newNum + " ");
        }
        for (int i = 2; i < num; i++) {
            int nextNum = prevNum + newNum;
            System.out.print(nextNum + " ");
            prevNum = newNum;
            newNum = nextNum;
        }
        sc.close();
    }
}
