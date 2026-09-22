package day33;

import java.util.Arrays;

public class EnhancedForLoop {
    static void main() {

        //98,76,54,32,21,56

        int[] numbers = {98, 76, 54, 32, 21, 56};

        System.out.println("=====While Loop=======");
        int i = 0;
        while (i < numbers.length) {
            System.out.println(numbers[i]);
            i++;
        }

        System.out.println("=====For Loop=======");
        for (int j = 0; j < numbers.length; j++) {
            System.out.println(numbers[j]);
        }

        System.out.println("=====Enhanced For Loop=======");
        for(int k :numbers)
        {
            System.out.println(k);
        }

        System.out.println("=====Print Data only=======");
        System.out.println(Arrays.toString(numbers));
    }
}
