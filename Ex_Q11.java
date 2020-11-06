
import java.util.Scanner;

public class Ex_Q11{
	public static void main(String[] args) {
		boolean arr[][] = new boolean[10][10];
		int x=9;
		for (int i = 0; i < 10; i++) {
			
			for (int j = 0 ; j < 10; j++) {
				
				if(j < x)
					arr[i][j] = false;
				else
					arr[i][j] = true;

			}
			x--;

		}
		for (int i = 0; i < 10; i++){
			for (int j = 0 ; j < 10; j++){
				if(arr[i][j])
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();	
		}

	}

}