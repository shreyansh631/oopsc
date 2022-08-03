package Encapsulation;
import java.util.Scanner;
/*For managing admissions for a school,
Pupils can only be admitted to the school if they are over 6 years of age.
If  the age is above 6 then the student is welcomed ,else will not be admitted*/
public class Main {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.print("Enter age: ");
        int a = read.nextInt();

        Pupil pupil = new Pupil();
        pupil.setAge(a);
    }
}
class Pupil {
    private int age;

    public void  setAge(int a){
        if(a>6){
            age=a;
            System.out.println("Welcome");
        }
        else {
            System.out.println("Sorry");
        }

    }

    public int getAge(){
        return age;
    }
}
