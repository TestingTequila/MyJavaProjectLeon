package day32;

public class SwitchStatement2
{
    static void main() {

        //based on the browser name, we should execute the test cases

        String day = "Saturday";
        switch (day)
        {
            case "Monday":
                System.out.println("Go to office...");
                break;

            case "Tuesday":
                System.out.println("Go for Prayers...");
                break;

            case "Wednesday":
                System.out.println("Go for product Launch...");
                break;

            case "Thursday":
                System.out.println("Do some cooking...");
                break;

            case "Friday":
                System.out.println("Go for movie");
                break;

            default:
                System.out.println("Its weekend, lets party...");
                break;
        }
    }
}
