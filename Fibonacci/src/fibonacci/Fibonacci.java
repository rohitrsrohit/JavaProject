package fibonacci;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		 System.out.println("Enter the range: ");
	        Scanner sc = new Scanner(System.in);

	        int range = sc.nextInt();
	        fibonacciSeries(range);

	    }

	    public static void fibonacciSeries(int range) {

	        int a = 0, b = 1;
	        if (range == 0)
	            System.out.println(a);

	        int i = 2;
	        while (i <= range) {

	            int c = a + b;
	            a = b;
	            b = c;
	            System.out.println(b);
	            i++;

	        }
	    }


	}
