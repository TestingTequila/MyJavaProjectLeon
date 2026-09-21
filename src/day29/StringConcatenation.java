package day29;

public class StringConcatenation {
    static void main() {

        String x = "Hello";
        String y = "World";

        int a = 100;
        int b = 200;

        System.out.println(x);//Hello
        System.out.println(y);//World
        System.out.println(a); //100
        System.out.println(b); //200

        System.out.println(a + b); // 100+200 => 300
        System.out.println(x + y); // Hello+World => HelloWorld
        System.out.println(a + x); // 100+Hello   => 100Hello
        System.out.println(a + b + x);//100+200+Hello => 300Hello
        System.out.println(a + b + x + y);//100+200+Hello+World => 300HelloWorld
        System.out.println(x + a + b);//Hello+100+200 => Hello100200
        System.out.println(x + y + a + b);//HelloWorld100200
        System.out.println(a + b + x + y + a + b);//300HelloWorld100200

        double d = 12.34;
        float f = 56.78F;

        System.out.println(x + y + d + f); //HelloWorld12.3456.78

        System.out.println("The sum of a & b is: " + a+b);
        System.out.println("The sum of a & b is: " + (a+b));
    }
}
