package reversenumber;
import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		 System.out.println("Enter the number: ");
	        Scanner sc = new Scanner(System.in);

	        int number = sc.nextInt();
	        int result = reverseNumber(number);
	        System.out.println(result);

	    }

	    //returns the number in reverse order
	    public static int reverseNumber(int number) {

	        int reverse = 0;

	        while (number != 0) {

	            int remainder = number % 10;
	            reverse = reverse * 10 + remainder;
	            number /= 10;

	        }

	        return reverse;
	    }

	}

