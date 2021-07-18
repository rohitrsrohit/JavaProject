package primenumber;
import java.util.Scanner;

public class PrimeNumber {
	//if prime number returns true
    public static boolean isPrime(int number) {

        //assigning boolean value true if number > 1 else if number is less than 1 then false
        boolean flag = number > 1;

        int i = 2;

        while (i <= number / 2) {

            if (number % i == 0) {

                flag = false;
                break;
            }
            i++;
        }
        return flag;
    }

	public static void main(String[] args) {
		   System.out.println("Enter the number: ");
	        Scanner sc = new Scanner(System.in);

	        int number = sc.nextInt();

	        if (isPrime(number))
	            System.out.println(number + " is a prime number");

	        else
	            System.out.println(number + " is not a prime number");
	    }

	}
