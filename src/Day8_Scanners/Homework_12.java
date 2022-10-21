package Day8_Scanners;

import java.util.Scanner;

public class Homework_12 {
    public static void main(String[] args) {
        /*Write a code where a teacher is entering student's first name, last name and the point they received from the exam.
        Based on the point, the code should automatically determine the grade of Student with the full name of the student
        This should be done for each student.
        Assuming we do not know how many student are there but your code should still handle this situation.
        Example input (first name = From the teacher, Last name=  from the teacher Point= from the teacher (90.5)
        When the point is between 90 to 100 the grade should be A
        When the point is between 80 to 90(excluded) the grade should be B
        When the point is between 70 to 80(excluded) the grade should be C
        When the point is between 60 to 70 (excluded) the grade should be D
        When the point is less than 60 the grade should be F
        Example output (First Name = Ziya Last Name = Yilmaz Grade: A )
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Student's first name: ");
        String fname = scan.nextLine();
        System.out.print("Student's last name: ");
        String lname = scan.nextLine();
        System.out.print("Student's score: ");
        double score = scan.nextDouble();

        if (score < 60 && score >= 0) {
            System.out.println("First Name = " + fname + ", Last Name = " + lname + ", Grade = F");
        } else if (score >= 60 && score < 70) {
            System.out.println("First Name = " + fname + ", Last Name = " + lname + ", Grade = D");
        } else if (score >= 70 && score < 80) {
            System.out.println("First Name = " + fname + ", Last Name = " + lname + ", Grade = C");
        } else if (score >= 80 && score < 90) {
            System.out.println("First Name = " + fname + ", Last Name = " + lname + ", Grade = B");
        } else if (score >= 90 && score <= 100) {
            System.out.println("First Name = " + fname + ", Last Name = " + lname + ", Grade = A");
        } else
            System.out.println("Invalid score");
    }
}
