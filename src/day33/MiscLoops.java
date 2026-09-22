package day33;

import java.util.Arrays;

public class MiscLoops {
    static void main() {

        int a = 8;
        int b = 3;
        int[] marks = new int[5];
        marks[0] = a + b;
        marks[1] = a - b;
        marks[2] = a * b;
        marks[3] = a / b;
        marks[4] = 2 * a + 3 * b;

        System.out.println("===== While Loop========");
        int i=0;
        while ( i <marks.length)
        {
            System.out.println(marks[i]);
            i++;
        }

        System.out.println("===== For Loop========");

        for(int j=0; j <marks.length; j++)
        {
            System.out.println(marks[j]);
        }


        System.out.println("======Enhanced For Loop========");
        for (int num : marks) {
            System.out.println(num);
        }

        System.out.println("======Print Direct values in Array===");
        System.out.println(Arrays.toString(marks));
    }
}
