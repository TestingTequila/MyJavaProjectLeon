package day32;

public class SwitchStatement
{
    static void main() {

        //based on the browser name, we should execute the test cases

        String browserName = "Firefox";
        switch (browserName)
        {
            case "IE":
                System.out.println("Launch IE Browser...");
                break;

            case "Safari":
                System.out.println("Launch Safari Browser...");
                break;

            case "Chrome":
                System.out.println("Launch Chrome Browser...");
                break;

            case "Edge":
                System.out.println("Launch Edge Browser...");
                break;

            case "Firefox":
                System.out.println("Launch Firefox Browser...");
                break;

            default:
                System.out.println("PLease provide a valid browser name...");
                break;
        }
    }
}
