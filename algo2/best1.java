package src;

public class best1 {
	
	

	public static int sumArr(int[]arr) {
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			count += arr[i]; 			
		}

		return count;
	}

	public static int best(int[]arr) {
		int sum = 0;
		 int max = 0;

		for(int i = 0; i< arr.length; i++) {
			sum += arr[i];

			if(max < sum) {
				max = sum;
			}

			if(arr[i] < 0) {

				if(sum < 0) {
					sum =0;
				}
			}
		}
		return max;
	}

	public static int sum(int []arr) {
		int sum;
		sum = sumArr(arr) + best(deepCopyAndNegativeOfArray(arr));
		return sum;
	}
	private static int[] deepCopyAndNegativeOfArray (int arr[]){
		int ans[] = new int[arr.length];
		for(int i = 0 ; i<arr.length ; i++) {
			ans[i] = -arr[i];
		}
		return ans;
	}

	private static int bestNegative(int []arr) {	// check the best of negative arr
		return best(deepCopyAndNegativeOfArray(arr));
	}
	
	public static void main(String[] args) {
		int[]arr = {2,-5,4,7,-1};
//
//		System.out.println("the sum of array is: " + sumArr(arr));
//		System.out.println(" ");
//	
//		System.out.println("the best is: " + best(arr));
//		System.out.println(" ");
//
//		System.out.println(bestNegative(arr));
//		System.out.println(" ");
//
//		System.out.println("the general sum is: "+sum(arr));
//		
	}
}