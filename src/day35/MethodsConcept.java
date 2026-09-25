package day35;

public class MethodsConcept {
    int a; //Global/Class level variable
    int b; //Global/Class level variable

    public void addition() {
        int sum = a + b;
        System.out.println("The sum of " + a + " and " + b + " is: " + sum);
    }

    public void subtraction() {
        int difference = a - b;
        System.out.println("The Difference of " + a + " and " + b + " is: " + difference);

    }

    public  void multiplication()
    {
        int product =a*b;
        System.out.println("The Product of " + a + " and " + b + " is: " + product);

    }
}
