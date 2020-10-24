public class Binary_Search{
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};

		int start = 0;
		int end  = 9;
		int item = 5;
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