package perfectnumber;
	import java.util.Scanner;

public class PerfectNumber {
	 //returns true if number is Perfect Number else False
    public static boolean isPerfect(int number) {

        boolean flag;
        int sum = 1;

        if (number == 1)
            return false;

        for (int i = 2; i< number; i++) {

            if (number % i == 0)
                sum += i;

        }

        // checking condition sum == number and assigning to the flag -->True or False
        flag = sum == number;

        return flag;
    }
		 //Main Method
	    public static void main(String[] args) {

	        System.out.println("Enter the number: ");
	        Scanner sc = new Scanner(System.in);

	        int number = sc.nextInt();

	        //Calling isPerfect Function if true then its perfect number else not
	        if (isPerfect(number))
	            System.out.println(number + " is a perfect number");

	        else
	            System.out.println(number + " is a not perfect number");

	    }

	}


