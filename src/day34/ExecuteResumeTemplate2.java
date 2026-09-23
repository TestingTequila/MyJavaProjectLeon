package day34;

public class ExecuteResumeTemplate2 {
    static void main() {
        ResumeTemplate resume1 = new ResumeTemplate();
        resume1.fName = "Leon";
        resume1.lName = "Hill";
        resume1.yearsExperience = 7;
        resume1.isMarried = false;
        resume1.gender = 'M';

        System.out.println(resume1.fName);
        System.out.println(resume1.lName);
        System.out.println(resume1.yearsExperience);
        System.out.println(resume1.isMarried);
        System.out.println(resume1.gender);

        System.out.println("============================");

        ResumeTemplate resume2 = new ResumeTemplate();
        resume2.fName = "Kerrie";
        resume2.lName = "Wright";
        resume2.yearsExperience = 14;
        resume2.isMarried = true;
        resume2.gender = 'F';

        System.out.println(resume2.fName);
        System.out.println(resume2.lName);
        System.out.println(resume2.yearsExperience);
        System.out.println(resume2.isMarried);
        System.out.println(resume2.gender);
        System.out.println("============================");

        ResumeTemplate resume3 = new ResumeTemplate();
        resume3.fName = "Lee";
        resume3.lName = "Fletcher";
        resume3.yearsExperience = 4;
        resume3.isMarried = true;
        resume3.gender = 'M';

        System.out.println(resume3.fName);
        System.out.println(resume3.lName);
        System.out.println(resume3.yearsExperience);
        System.out.println(resume3.isMarried);
        System.out.println(resume3.gender);

        System.out.println("=================Miscellaneous==============");

        resume1 = resume2; //resume1 has broken its original connection and is pointing resume2 is pointing

        System.out.println("======resume1 => resume2;========");
        System.out.println(resume1.fName);
        System.out.println(resume1.lName);
        System.out.println(resume1.yearsExperience);
        System.out.println(resume1.isMarried);
        System.out.println(resume1.gender);

        System.out.println("********************************");
        System.out.println(resume2.fName);
        System.out.println(resume2.lName);
        System.out.println(resume2.yearsExperience);
        System.out.println(resume2.isMarried);
        System.out.println(resume2.gender);

        System.out.println("********************************");
        System.out.println(resume3.fName);
        System.out.println(resume3.lName);
        System.out.println(resume3.yearsExperience);
        System.out.println(resume3.isMarried);
        System.out.println(resume3.gender);

        System.out.println("======resume2 => resume3;========");
        resume2 = resume3;
        System.out.println(resume1.fName);
        System.out.println(resume1.lName);
        System.out.println(resume1.yearsExperience);
        System.out.println(resume1.isMarried);
        System.out.println(resume1.gender);

        System.out.println("********************************");
        System.out.println(resume2.fName);
        System.out.println(resume2.lName);
        System.out.println(resume2.yearsExperience);
        System.out.println(resume2.isMarried);
        System.out.println(resume2.gender);

        System.out.println("********************************");
        System.out.println(resume3.fName);
        System.out.println(resume3.lName);
        System.out.println(resume3.yearsExperience);
        System.out.println(resume3.isMarried);
        System.out.println(resume3.gender);

        System.out.println("======resume3 = resume1;========");
        resume3 = resume1;
        System.out.println(resume1.fName);
        System.out.println(resume1.lName);
        System.out.println(resume1.yearsExperience);
        System.out.println(resume1.isMarried);
        System.out.println(resume1.gender);

        System.out.println("********************************");
        System.out.println(resume2.fName);
        System.out.println(resume2.lName);
        System.out.println(resume2.yearsExperience);
        System.out.println(resume2.isMarried);
        System.out.println(resume2.gender);

        System.out.println("********************************");
        System.out.println(resume3.fName);
        System.out.println(resume3.lName);
        System.out.println(resume3.yearsExperience);
        System.out.println(resume3.isMarried);
        System.out.println(resume3.gender);

        System.out.println("======resume3 = resume1 = resume2;========");
        resume3 = resume1 = resume2;
        System.out.println(resume1.fName);
        System.out.println(resume1.lName);
        System.out.println(resume1.yearsExperience);
        System.out.println(resume1.isMarried);
        System.out.println(resume1.gender);

        System.out.println("********************************");
        System.out.println(resume2.fName);
        System.out.println(resume2.lName);
        System.out.println(resume2.yearsExperience);
        System.out.println(resume2.isMarried);
        System.out.println(resume2.gender);

        System.out.println("********************************");
        System.out.println(resume3.fName);
        System.out.println(resume3.lName);
        System.out.println(resume3.yearsExperience);
        System.out.println(resume3.isMarried);
        System.out.println(resume3.gender);

    }
}
