public class Main {

  public static void main(String[] args) {

    // positive number
    int digit = 30;

    System.out.print("Factors of " + digit + " are: ");

    // loop runs from 1 to 30
    for (int i = 1; i <= digit; ++i) {

      
      if (digit % i == 0) {
        System.out.print(i + " ");
      }
    }
  }
}