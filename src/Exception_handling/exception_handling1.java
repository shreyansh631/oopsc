package Exception_handling;

import java.util.Scanner;

public class exception_handling1
{
    /*A class has five students whose names,  along with their roll numbers
    are stored in an array.Program is taking input of roll number and will
    give error if the roll number goes out of the range.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter roll number: ");
        int roll = scanner.nextInt();

        String[] students = {"null","1.Abhi", "2.Ritu", "3.Rahul", "4.Priya", "5.Аnthony"};


        try {
            System.out.println(students[roll]);

        } catch(Exception e) {
            System.out.print("Error: Out of the range!");

        }
    }
}
