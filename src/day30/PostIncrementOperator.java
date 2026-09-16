package day30;

public class PostIncrementOperator {
    static void main() {

        //Post Increment --> AI rule {assign and increment}
        int a = 1;
        int b = a;
        System.out.println(a);//1
        System.out.println(b);//1

        System.out.println("==================");

        int c = 1;
        int d = c++;
        System.out.println(c);//2
        System.out.println(d);//1

        System.out.println("==================");

        int e = 99;
        int f = e++;
        System.out.println(e); //100
        System.out.println(f); //99

        System.out.println("==================");

        int g = 10;
        int h = g++;
        System.out.println(g);//11
        System.out.println(h);//10


    }
}
