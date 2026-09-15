public class MathOperations {
    static void main() {
        System.out.println("======Case 1. [I/I = I part]===================");

        System.out.println(10 / 2); //5
        System.out.println(16 / 4); //4
        System.out.println(9 / 2);  //4
        System.out.println(16 / 3); //5
        System.out.println(18 / 10);//1

        System.out.println("======Case 2. [I/D or D/I or D/D = I+D part]===================");

        System.out.println(10.0 / 2); //5.0
        System.out.println(16 / 4.0); //4.0
        System.out.println(9.0 / 2);  //4.5
        System.out.println(16 / 3.0); //5.333333333333333
        System.out.println(18.0 / 10.0); //1.8

        int a = 10;
        int b = 2;
        int c = 3;
        int divide = a / c;
        double div = a / c;
        System.out.println(divide);//3
        System.out.println(div);//3.0

        System.out.println("======Case 3. [Modulo Operator(%) --> Remainder ]===================");

        System.out.println(10 % 2);//0
        System.out.println(10 % 3); //1
        System.out.println(9.2 % 2);//1.1999999999999993


    }
}
