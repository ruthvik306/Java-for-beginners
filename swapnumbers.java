public class SwapingNumbers {

    public static void main(String[] args) {

        float a = 1.50f, b = 2.05f;

        System.out.println("--Before swaping--");
        System.out.println("First number = " + a);
        System.out.println("Second number = " + b);
        a=a+b;
        // Value of a is assigned to b
        b=a-b;

        // Value of b is assigned to a
        a = a-b;

        System.out.println("--After swaping--");
        System.out.println("First number = " + a);
        System.out.println("Second number = " + b);
    }
}
