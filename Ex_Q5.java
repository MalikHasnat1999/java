
import java.util.Scanner;

public class Ex_Q5{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x,y;

		System.out.println("Enter 2 numbers:");
		x = sc.nextDouble();
		y = sc.nextDouble();
		

		if((x<1 && x>0) && (y<1 && y>0))
			System.out.println("True");
		else
			System.out.println("false");


	}

}