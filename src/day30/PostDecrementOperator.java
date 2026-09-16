package day30;

public class PostDecrementOperator {
    static void main() {

        //Post Decrement --> AI rule {assign and increment}

        System.out.println("========1==========");

        int c = 1;
        int d = c--;
        System.out.println(c);//0
        System.out.println(d);//1

        System.out.println("==========2========");

        int e = 99;
        int f = e--;
        System.out.println(e); //98
        System.out.println(f); //99

        System.out.println("=========3=========");

        int g = 10;
        int h = g--;
        System.out.println(g);//9
        System.out.println(h);//10

        System.out.println("=========4=========");

        int i = 500;
        int j = i--;
        System.out.println(i);//499
        System.out.println(j);//500


    }
}
