import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Assignment_1 {
    public static void main(String[] args) {

        // Java program to check if a student number is valid
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter student email: ");
        String studentEmail = scan.nextLine();

        // Student Email
        Pattern pattern = Pattern.compile("\\w+@students.national-u.edu.ph");
        Matcher matcher = pattern.matcher(studentEmail);

        boolean match = matcher.matches();

        if (match) {
            System.out.println("valid student email");
        } else {
            System.out.println("invalid student email");
        }
        
        //Phone Number
        System.out.print("Enter phone number: ");
        String PhoneNum = scan.nextLine();

        Pattern pattern2 = Pattern.compile("\\+63\\d{1,10}");
        Matcher matcher2 = pattern.matcher(PhoneNum);

        boolean match2 = matcher.matches();

        if (match2) {
            System.out.println("valid phone number");
        } else {
            System.out.println("invalid phone number");
        }

         //Date (year-month-day)
         System.out.print("Enter Date year-month-day: ");
         String Date = scan.nextLine();
 
         Pattern pattern3 = Pattern.compile("\\d{4}\\-\\d{2}\\-\\d{2}");
         Matcher matcher3 = pattern.matcher(Date);
 
         boolean match3 = matcher.matches();
 
         if (match3) {
             System.out.println("valid Date");
         } else {
             System.out.println("invalid Date");
         }

    }
}