
import java.util.Scanner;

public class Ex_Q9{

	public static void main(String[] args) {
		
	String s = "";
    for (int n = 10; n > 0; n /= 2)
        s = (n % 2) + s;

    System.out.print(s);


	}

}