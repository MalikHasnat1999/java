public class Binary_Search{
	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40,50,60,70,80,90,100};

		int start = 0;
		int end  = 9;
		int item = 90;
		int mid;
		int c = -1; 

		while(start <= end){

			mid = (start+end) / 2;
			if(arr[mid] == item){
				c = mid;
				
				break;
			}

			else if(item < arr[mid]){

				end = mid - 1;
			}
			else{

				start = mid + 1;
			}

		}
		if(c == -1)
			System.out.print("Item Not found");
		else
			System.out.print("item found at index = "+c);



	}
}