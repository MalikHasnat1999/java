abstract class Abs extends Add{

}

 class Add{

}
public class Method{

	static int add(){
	int a = 1;
	int b = 2;

	int c = a + b;

	return c;
}

	public static void main(String[] args) {
		
		System.out.println("a + b = "+add());
	}
}

