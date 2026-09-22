package day33;

import java.util.Arrays;

public class EnhancedForLoop2 {
    static void main() {

        //Jason, Kerrie, Mike, Rose, Leon

        String[] names = {"Jason", "Kerrie", "Mike", "Rose", "Leon"};

        System.out.println("=====While Loop=======");
        int i = 0;
        while (i < names.length) {
            System.out.println(names[i]);
            i++;
        }

        System.out.println("=====For Loop=======");
        for (int j = 0; j < names.length; j++) {
            System.out.println(names[j]);
        }

        System.out.println("=====Enhanced For Loop=======");
        for(String k :names)
        {
            System.out.println(k);
        }

        System.out.println("=====Print Data only=======");
        System.out.println(Arrays.toString(names));
    }
}
