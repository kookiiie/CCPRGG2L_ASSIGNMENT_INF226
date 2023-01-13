import java.util.Scanner;

public class Exercise2 {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        learn("drive");
        scan.close();

    }

    static void learn(String drive) {

        System.out.println("-train driving-");
        train(drive);

        String feedback = getFeedBack(drive);

         // Define the base case / stopping condition
         if (feedback.equals("no")) {

             // Do something to reach the goal
                 PracticeDriving(drive);

            // Recursive call
                 learn(drive);
        } else if (feedback.equals("yes")) {
            pass(drive);
        }
    }

    static void train(String drive) {
        System.out.println("~Driving~");
    }

    static String getFeedBack(String drive) {
        System.out.println("Did you mastered driving? (Enter \"yes\" or \"no\")");

        String feedback = scan.next();

        return feedback;
    }

    static void PracticeDriving(String drive) {
        System.out.print("What skill do you want to improve?:");
        String skill = scan.next();
        System.out.println("Practicing " + skill);
    }

    static void pass(String drive) {
        System.out.println("Congrats!" + "\nYou passed the driving school!");
    }

}