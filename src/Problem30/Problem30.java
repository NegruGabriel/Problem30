package Problem30;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem30 {
    public static void main(String[] args) {
        boolean shouldTerminateTheProgram = true;
        boolean canContinueRunProgram = false;

        System.out.println("Hello user. Welcome to the program");

        // names = []
        ArrayList<String> nameEmployees = new ArrayList<>();
        //
        ArrayList<Double> salaryEmployees = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        String userAnswer;

        // read name
        System.out.print("Please enter the Employee name: ");
        String employeesName = sc.nextLine();

        do {
            //read salary
            System.out.print("Please enter the Employee salary: ");
            Double employeesSalary = sc.nextDouble();
            sc.nextLine();

            // add to lists
            nameEmployees.add(employeesName);
            salaryEmployees.add(employeesSalary);

            // read name
            System.out.print("Please enter the Employee name: ");
            employeesName = sc.nextLine();
        }
        while (!employeesName.equals("quit"));

        for (int n = 0; n < nameEmployees.size(); n++) {
            System.out.println(nameEmployees.get(n) + " - " + salaryEmployees.get(n));
        }


        //System.out.println("Tha salary of the employees is : "+salaryEmployees);

    }
}
