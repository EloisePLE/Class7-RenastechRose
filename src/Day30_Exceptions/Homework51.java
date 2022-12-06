package Day30_Exceptions;

import java.util.Scanner;

public class Homework51 {
    /*
    Write Employee Class where it has Int "Employee ID", String "Employee Name" and double "Employee Salary"
    Write a code where It asks user to enter Employee ID, Employee Name and Employee Salary
    where anytime user creates a new object of Employee Class.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Employee myEmployeeInformation = new Employee();
        System.out.println("Please enter Employee ID: ");
        myEmployeeInformation.EmployeeID = scan.nextInt();

        System.out.println("Please enter Employee Name: ");
        myEmployeeInformation.EmployeeName = scan.next();

        System.out.println("Please enter Employee Salary: ");
        myEmployeeInformation.EmployeeSalary = scan.nextDouble();

        myEmployeeInformation.printEmployeeInfo();
    }
}
class Employee{
    int EmployeeID;
    String EmployeeName;
    double EmployeeSalary;

    public void printEmployeeInfo (){
        System.out.println(EmployeeID);
        System.out.println(EmployeeName);
        System.out.println("Sorry. The employee's salary is a private information.");

    }
}
