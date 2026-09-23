package day34;

public class TestEmployeeDetails {
    static void main() {

        EmployeeDetails resume1 = new EmployeeDetails();
        resume1.fName = "Leon";
        resume1.lName = "cunningham";
        resume1.totalExperience = 10;
        resume1.gender = 'M';
        resume1.isFromIT = false;

        System.out.println("FirstName: " + resume1.fName + ", Last Name: " + resume1.lName + ", Total Experience: " + resume1.totalExperience + ", Gender: " + resume1.gender + ", Is From IT: " + resume1.isFromIT);

        System.out.println("=========================================");

        EmployeeDetails resume2 = new EmployeeDetails();
        resume2.fName = "Kerrie";
        resume2.lName = "Wright";
        resume2.totalExperience = 5;
        resume2.gender = 'F';
        resume2.isFromIT = true;

        System.out.println("FirstName: " + resume2.fName + ", Last Name: " + resume2.lName + ", Total Experience: " + resume2.totalExperience + ", Gender: " + resume2.gender + ", Is From IT: " + resume2.isFromIT);

        System.out.println("=========================================");
        EmployeeDetails resume3 = new EmployeeDetails();
        resume3.fName = "Ben";
        resume3.lName = "Fletcher";
        resume3.totalExperience = 12;
        resume3.gender = 'M';
        resume3.isFromIT = true;
        System.out.println("FirstName: " + resume3.fName + ", Last Name: " + resume3.lName + ", Total Experience: " + resume3.totalExperience + ", Gender: " + resume3.gender + ", Is From IT: " + resume3.isFromIT);

    }
}
