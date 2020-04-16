import java.util.Scanner;

public class SmallestLargestNumber {
    public static void main(String[] args) {
        //Scanner object
        Scanner in = new Scanner(System.in);
        //prompt user for number
        System.out.print("Input the 1st number: ");
        int num1 = in.nextInt();

        System.out.print("Input the 2nd number: ");
        int num2 = in.nextInt();

        System.out.print("Input the 3rd number: ");
        int num3 = in.nextInt();

        /** First here is the clean way:-
         * first compare one of the number against the other two and assign it as the greatest.
         * And then with in that statement, check for the smaller of the two numbers and assign
         * it as smallest number.
         */

        if (num1 > num2 && num1 > num3) {
            System.out.println("The greatest: " + num1);
            if (num2 > num3) System.out.println("The smalles: " + num3);
            else System.out.println("The smallest: " + num2);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("The greatest: " + num2);
            if (num1 > num3) System.out.println("The smallest: " + num3);
            else System.out.println("The smallest: " + num1);
        } else {
            System.out.println("The greatest: " + num3);
            if (num1 > num2) System.out.println("The smallest: " + num2);
            else System.out.println("The smallest: " + num1);
        }

        /**Here is the longer or not so neat way:-
         * we compare num1 to num2 and if it is greater check further if it's greater than num3.
         * if num1 is greater than 3 then assign num1 as greatest, if num1 is not greater then assign num3
         * as the greatest.
         * Then check for the smallest by comparing num 3 to num2 and assign the smallest one.
         * Repeat the process for the other two numbers if the first try fails.
         */
        
        /***************** Uncomment to try the code *************************
        if (num1 > num2){
            if (num1 > num3) {
                System.out.println("The greatest: " + num1);
                if (num3 > num2) System.out.println("The smallest: " + num2);
                else System.out.println("The smallest: " + num3);
            }
            else {
                System.out.println("The greatest: " + num3);
                System.out.println("The smallest: " + num2);
            }
        } else if (num2 > num3){
            System.out.println("The greatest: " + num2);
            if (num3 > num1) {
                System.out.println("The smallest: " + num1);
            } else System.out.println("The smallest: " + num3);
        } else {
            System.out.println("The greatest: " + num3);
            System.out.println("The smallest: " + num1);
        }
         ***************************************************************************/


    }
}
