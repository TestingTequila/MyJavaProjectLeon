package day32;

public class IfElseIfStatement
{
    static void main() {

        //12>8
        if(12>81)
        {
            System.out.println("left side number is greater than right side number");
        }
        else
        {
            System.out.println("left side number is smaller than right side number");
        }

        System.out.println("===========================================");

        //check if a person is eligible to vote or not

        int age =17;

        if(age>=18)
        {
            System.out.println("The person is eligible to Vote");
        }
        else
        {
            System.out.println("The person is not eligible to Vote");
        }

        System.out.println("===========================================");

        //Check if a given number is a positive or negative number

        int num =-44;

        if(num>0)
        {
            System.out.println("The number is a positive number");
        }
        else
        {
            System.out.println("The number is a negative number");
        }

    }
}
