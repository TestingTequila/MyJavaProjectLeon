package day33;

import java.util.Arrays;

public class EnhancedForLoop4 {
    static void main() {

        //12.34, 23.45, 34.56, 45.67, 56.78

        double[] temperature = {12.34, 23.45, 34.56, 45.67, 56.78};

        System.out.println("=====While Loop=======");
        int i = 0;
        while (i < temperature.length) {
            System.out.println(temperature[i]);
            i++;
        }

        System.out.println("=====For Loop=======");
        for (int j = 0; j < temperature.length; j++) {
            System.out.println(temperature[j]);
        }

        System.out.println("=====Enhanced For Loop=======");
        for (double k : temperature) {
            System.out.println(k);
        }

        System.out.println("=====Print Data only=======");
        System.out.println(Arrays.toString(temperature));
    }
}
