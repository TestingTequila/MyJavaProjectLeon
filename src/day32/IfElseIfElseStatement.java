package day32;

public class IfElseIfElseStatement
{
    static void main() {
        //Based on the marks scored by the students, teacher has to assign the grades
        // > 90 + ==> outstanding
        //80-90   ==> Excellent
        //70-80   ==> Very Good
        //60-70   ==> Good
        //50-60   ==> Average
        //40-50   ==> Below Average
        // < 40   ==> Work Hard
        int marks = 77;

        if(marks>90)
        {
            System.out.println("Outstanding");
        }
        else if (marks>80 && marks<=90)
        {
            System.out.println("Excellent");
        }
        else if (marks>70 && marks<=80)
        {
            System.out.println("Very Good");
        }
        else if (marks>60 && marks<=70)
        {
            System.out.println("Good");
        }
        else if (marks>50 && marks<=60)
        {
            System.out.println("Average");
        }
        else if (marks>40 && marks<=50)
        {
            System.out.println("Below Average");
        }
        else
        {
            System.out.println("Work Hard");
        }




    }
}
