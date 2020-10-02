public class SwapingNumbers {

    public static void main(String[] args) {

        float a = 1.50f, b = 2.05f;

        System.out.println("--Before swaping--");
        System.out.println("First number = " + a);
        System.out.println("Second number = " + b);

        // Value of first number is assigned to temporary
        float temporary = a;

        // Value of second number is assigned to first
        a = b;

        // Value of temporary which contains the initial value of first number is assigned to second
        b = temporary;

        System.out.println("--After swaping--");
        System.out.println("First number = " + a);
        System.out.println("Second number = " + b);
    }
}