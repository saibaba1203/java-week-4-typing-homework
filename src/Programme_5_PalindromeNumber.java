import java.util.Scanner;
/** If both are the same then the number is a palindrome otherwise it is not.
        * Tip: Logic to reverse a number
        * Declare and initialize another variable to store the reverse of a number, for example reverse = 0.
        * Extract the last digit of the given number by performing the modulo division (remainder).
        * Store the last digit to some variable say lastDigit = num % 10.
        * Increase the place value of reverse by one.
        * To increase place value multiply the reverse variable by 10 e.g. reverse = reverse * 10.
        * Add lastDigit to reverse.
        * Since the last digit of the number is processed, remove the last digit of num. To remove the last digit divide number by 10.
        * Repeat steps until the number is not equal to (or greater than) zero.
        * A while loop would be good for this coding exercise.
        * Tip: Be careful with negative numbers. They can also be palindrome numbers.
        * Tip: Be careful with reversing a number, you will need a parameter for comparing a reversed number
        * with the starting number (parameter).
        * NOTE: The method isPalindrome needs to be defined as public static
 */
public class Programme_5_PalindromeNumber {
    public static boolean isPalindrome(int number) {
        //converts negative number to positive number
        if (number < 0) {
            number = -number;
        }
        int lastDigit, reverse = 0, temp;
        temp = number;
        while (number > 0) {
            //Stores the last digit
            lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number = number / 10;
        }
        return reverse == temp;
    }

    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int a = scanner.nextInt();
        boolean check = isPalindrome(a);
        //checks number is Palindrome or not
        if (check)
            System.out.println("Number is Palindrome");
        else
            System.out.println("Number is not Palindrome");
        // closing the scanner object
        scanner.close();
    }
}
