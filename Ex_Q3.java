
import java.util.Scanner;

public class Ex_Q3{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c;

		System.out.println("Enter 3 Integers:");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		if(a == b && a== c)
			System.out.println("Equal");
		else
			System.out.println("Not Equal");


	}

}