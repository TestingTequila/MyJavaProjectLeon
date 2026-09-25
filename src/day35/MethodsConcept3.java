package day35;

public class MethodsConcept3 {

    public void addition(int a, int b) {
        int x = 5; // Local Variable
        int sum = (a + b) * x;
        System.out.println("The sum of " + a + " and " + b + " is: " + sum);
    }

    public void subtraction(int a, int b) {
        int difference = a - b;
        System.out.println("The Difference of " + a + " and " + b + " is: " + difference);

    }

    public void multiplication(int a, int b) {
        int product = a * b;
        System.out.println("The Product of " + a + " and " + b + " is: " + product);

    }
}
