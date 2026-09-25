package day35;

public class MethodsConcept4 {
    int a; //Global/Class level variable
    int b; //Global/Class level variable

    public void addition1() {
        int sum = a + b;
        System.out.println("The sum of " + a + " and " + b + " is: " + sum);
    }

    public int addition2() {
        int sum = a + b;
        System.out.println("The sum of " + a + " and " + b + " is: " + sum);
        return sum;
    }

    public void PrintFullName1(String fName, String lName) {
        String fullName = fName + lName;
    }

    public String PrintFullName2(String fName, String lName) {
        String fullName = fName + lName;
        return fullName;
    }


}
