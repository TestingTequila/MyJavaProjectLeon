package day35;

public class TestMethodsConcept4 {
    static void main() {
        MethodsConcept4 mc = new MethodsConcept4();
        mc.a = 12;
        mc.b = 8;

        System.out.println("=====addition1=======");
        //int total1 = mc.addition1(); //void

        System.out.println("=====addition2=======");
        int total2 = mc.addition2();  //int

        System.out.println(total2 * 100);

        System.out.println("*****************************************");

        //String myName1 =mc.PrintFullName1("Leon", "Cunningham"); //void

        String myName2 =mc.PrintFullName2("Leon", " Cunningham"); //String {fullName}

        String statement = "Is learning Java";

        System.out.println(myName2 +", " +statement);

    }
}
