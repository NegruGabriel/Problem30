package Problem30;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem30 {
    public static void main(String[] args) {
        boolean shouldTerminateTheProgram =true;
        boolean canContinueRunProgram =false;

        System.out.println("Hello user. Welcome to the program");

        ArrayList<String>nameEmployees =new ArrayList<>();
        nameEmployees.add("Florin Neagu");
        nameEmployees.add("Diana Albu");
        nameEmployees.add("Elena Silvan");
        nameEmployees.add("Mirel Condur");

        ArrayList<Double>salaryEmployees = new ArrayList<>();
        salaryEmployees.add(99999.99);
        salaryEmployees.add(10000000.05);
        salaryEmployees.add(9777546.00);
        salaryEmployees.add(7896.65);

        for (int n =0; n<nameEmployees.size(); n++){
            System.out.println(nameEmployees.get(n) + " - " +salaryEmployees.get(n));
        }

        System.out.println("Tha salary of the employees is : "+salaryEmployees);

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the Employee name: ");
        String employeesName= sc.nextLine();

        System.out.println("Please enter the Employee salary: ");
        Double employeesSalary = sc.nextDouble();









    }
}
