package day33;

public class WhileLoop
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

        System.out.println("==========while Loop-Print Name =======");

        int a=1;
        while (a<=10)
        {
            System.out.println("Leon");
            a++;
        }

        System.out.println("==========while Loop-Print number from 1 to 10 =======");

        int b =1;
        while (b<=10)
        {
            if(b!=7) {
                System.out.println(b);
                b++;
            }
            else
            {
                b++;
            }

        }

        System.out.println("==========while Loop-Print number from 10 to 1 =======");

        int c =10;
        while (c>0)
        {
            System.out.println(c);
            c--;
        }

        System.out.println("==========while Loop-Print table of 2  =======");

        int d =1;
        while (d<=10)
        {
            System.out.println(6 + "*" + d + " =" + 6*d);
            d++;
        }


    }
}
