/*
Abe Brege
LabA
1/23/23
*/
package employeepackage;
import java.util.Scanner;

public class EmployeeInfo {
        
   
    public static void main(String[] args) {
       System.out.println("Hello!");
       
       String employeeFirstName;
       String employeeLastName;
       String employeeInput;
       int ageYears;
       int ageDays;
       
       Scanner sc; //next three lines are the setup of the scanner and declaration of the input variable 
       sc = new Scanner(System.in);
       String input;
       
       System.out.print("Enter your first name: ");
       input = sc.nextLine(); //first use of scanner
       employeeFirstName = input; //storing user input entered above in employeeFirstName
       //System.out.println(employeeFirstName); <-- check input mapping
       
       System.out.print("Enter your last name: ");
       input = sc.nextLine();
       employeeLastName = input;
       //System.out.println(employeeLastName); <-- check input mapping
       
       System.out.print("Enter your age: ");
       input = sc.nextLine();
       employeeInput = input;
       ageYears = Integer.parseInt(employeeInput); //change employeeInput into an integer named ageYears
       ageDays = ageYears * 365; //converting years to days
       
       System.out.println(); //seperation line
       System.out.println(employeeFirstName + " " + employeeLastName + " is " + ageYears + " years old."); //printing out name and age years
       System.out.println(employeeFirstName + " " + employeeLastName + " is " + ageDays + " days old."); //printing out name and age in days
       System.out.println("Good Bye!");
    }
    
}
