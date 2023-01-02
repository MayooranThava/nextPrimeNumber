import java.io.InputStream;
import java.util.Scanner;

class Main {

  public static boolean checkPrimeNumber(String input) {
    int num = Integer.parseInt(input);
    if (num < 2) {
      return false;
    }
    for (int x = 2; x < num; x++) {
      if (num % x == 0) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Please enter a number to check if its prime: ");
    String input = scanner.nextLine();
    System.out.println("input = " + input);
    System.out.println(checkPrimeNumber(input));

  }
}