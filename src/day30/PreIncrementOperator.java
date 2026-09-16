package day30;

public class PreIncrementOperator {
    static void main() {

        //Pre Increment --> AI rule {assign and increment}
        System.out.println("========1==========");

        int c = 1;
        int d = ++c;
        System.out.println(c);//2
        System.out.println(d);//2

        System.out.println("========2==========");

        int e = 99;
        int f = ++e;
        System.out.println(e); //100
        System.out.println(f); //100

        System.out.println("========3==========");

        int g = 10;
        int h = ++g;
        System.out.println(g);//11
        System.out.println(h);//11

        System.out.println("=========4=========");

        int i = 500;
        int j = ++i;
        System.out.println(i);//501
        System.out.println(j);//501

        System.out.println("=========4=========");

        int k = 34567;
        int l = ++k;
        System.out.println(k);//34568
        System.out.println(l);//34568


    }
}
