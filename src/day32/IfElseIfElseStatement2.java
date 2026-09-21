package day32;

public class IfElseIfElseStatement2
{
    static void main() {
        // based on the browser name, we should execute the test cases

        String browserName = "Edge";

        if(browserName.equals("IE"))
        {
            System.out.println("Launch Internet Explorer browser....");
        }
        else if (browserName.equals("Safari"))
        {
            System.out.println("Launch Safari browser....");
        }
        else if (browserName.equals("Chrome"))
        {
            System.out.println("Launch Chrome browser....");
        }
        else if (browserName.equals("Edge"))
        {
            System.out.println("Launch Edge browser....");
        }
        else if (browserName.equals("Firefox"))
        {
            System.out.println("Launch Firefox browser....");
        }
        else
        {
            System.out.println("Please provide a valid browser name...");
        }
    }
}
