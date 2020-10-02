import java.util.ArrayList;
import java.util.List;

class Main {
  public static void main(String[] args) {

    // creating first list
    List<Integer> prime = new ArrayList<>();
    prime.add(7);
    prime.add(1);
    prime.add(5);
    System.out.println("First List: " + prime);

    // creating second list
    List<Integer> even = new ArrayList<>();
    even.add(4);
    even.add(2);
    System.out.println("Second List: " + even);

    // create merged list
    List<Integer> numbers = new ArrayList<>();
    numbers.addAll(prime);
    numbers.addAll(even);

    System.out.println("Merged List: " + numbers);

  }
}