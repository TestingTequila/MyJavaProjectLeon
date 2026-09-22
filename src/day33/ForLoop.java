package day33;

public class ForLoop
{
    static void main() {

        System.out.println("==========Normal Approach=======");
        System.out.println("Leon");
        System.out.println("Leon");
        System.out.println("Leon");
        System.out.println("Leon");
        System.out.println("Leon");
        System.out.println("Leon");
        System.out.println("Leon");
        System.out.println("Leon");
        System.out.println("Leon");
        System.out.println("Leon");

        System.out.println("==========for Loop-Print Name =======");


        for (int a=1;a<=10;a++)
        {
            System.out.println("Leon");

        }

        System.out.println("==========for Loop-Print number from 1 to 10 =======");


        for (int b =1;b<=10;b++)
        {
            if(b!=7) {
                System.out.println(b);
            }

        }

        System.out.println("==========for Loop-Print number from 10 to 1 =======");

        for (int c =10;c>0;c--)
        {
            System.out.println(c);

        }

        System.out.println("==========for Loop-Print table of 2  =======");


        for (int d =1;d<=10;d++)
        {
            System.out.println(6 + "*" + d + " =" + 6*d);

        }


    }
}
