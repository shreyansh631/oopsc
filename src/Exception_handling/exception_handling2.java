package Exception_handling;
import java.util.Scanner;
import java.util.InputMismatchException;

public class exception_handling2
{
    /*The program is taking two numbers for division and is handling two exceptions:
    first, the divisor(that is the second number,num2) should not be zero
    second, both numbers must be integers and another datatype mustnot be entered
    * */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter two numbers to divide");
            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();
            System.out.println(num1/num2);
            }
        catch(ArithmeticException ex) {
            System.out.println("Error: division by zero");
           }
        catch(InputMismatchException ex){
            System.out.println("Error: wrong value type");
          }
    }
}