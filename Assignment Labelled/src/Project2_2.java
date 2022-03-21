import java.util.Scanner;

public class Project2_2 {


	  public static void main(String[] args) {

	     Scanner input = new Scanner(System.in);
	    int i = 1, n = 13,firstTerm,secondTerm;
		System.out.println("Enter the first and last value:" );
	    firstTerm = input.nextInt();
	    secondTerm= input.nextInt();
	    System.out.println("Fibonacci Series till " + n + " terms:");

	    while (i <= n) {
		      System.out.print(firstTerm + ", ");

		      int nextTerm = firstTerm + secondTerm;
		      firstTerm = secondTerm;
		      secondTerm = nextTerm;
	      i++;
	    }
	  }
	}