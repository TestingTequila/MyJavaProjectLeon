package day30;

public class PreDecrementOperator {
    static void main() {

        //Pre Decrement --> AI rule {assign and increment}
        System.out.println("========1==========");

        int c = 1;
        int d = --c;
        System.out.println(c);//0
        System.out.println(d);//0

        System.out.println("========2==========");

        int e = 99;
        int f = --e;
        System.out.println(e); //98
        System.out.println(f); //98

        System.out.println("========3==========");

        int g = 10;
        int h = --g;
        System.out.println(g);//9
        System.out.println(h);//9

        System.out.println("=========4=========");

        int i = 500;
        int j = --i;
        System.out.println(i);//499
        System.out.println(j);//499

        System.out.println("=========5=========");
        int k = 34567;
        int l = --k;
        System.out.println(k);//34566
        System.out.println(l);//34566

        System.out.println("=========5=========");
        int m = 98346;
        int n = --m;
        System.out.println(m);//98345
        System.out.println(n);//98345




    }
}
