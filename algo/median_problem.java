package algorithms;

public class median_problem {
	
	public static int MAX(int[]arr) {			//O(1)
		int max = arr[0];
		
		for(int i = 1; i<arr.length-1 && i < 64-1; i+=2) {
			if(arr[i] > arr[i+1]) {
				if(arr[i] > max) max = arr[i];
			}
			else {  //(arr[i] < arr[i+1])
				if(arr[i+1] > max) max = arr[i+1]; 
			}
		}
		
		return max;
	}

	
	public static void main(String[] args) {
		int [] arr = {7,3,101,6,5,9,2,34,21,45,8,99};
		System.out.println(MAX(arr));
	}

}
