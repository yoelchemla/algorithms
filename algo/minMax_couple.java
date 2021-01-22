package algorithms;

public class minMax_couple {
									//min and max in array
	public static int minMaxCouple(int[]arr) { 	// O(n)  ,   comparisons = 3n/2
		
		int min = arr[0];
		int max = arr[1];
		int comparisons = 1;

		if(arr[0] > arr[1]) {
			min = arr[1];
			max = arr[0];	
		}
		for(int i = 0; i < arr.length-1; i+=2) 
		{
			comparisons++;

			if(arr[i] <= arr[i+1])
			{
				comparisons+=2;
				if(arr[i] < min) 
				{
					min = arr[i];
				}
				if(arr[i+1] > max) 
				{
					max = arr[i+1];
				}
			}
			else 
			{
				comparisons+=2;

				if(arr[i] > max)
				{
					max = arr[i];
				}
				if(arr[i+1] < min)
				{
					min = arr[i+1];
				}
			}
			if(arr.length %2 != 0) 
			{
				comparisons++;
				if(arr[arr.length-1] > max) 
				{
					max = arr[arr.length-1];
				}
			}
			else {
				comparisons++;
				if(arr[arr.length-1] < min) 
				{
					min = arr[arr.length-1];
				}
			}
		}
		System.out.println("the max is: " + max + ", the min is: "+ min);	
		//System.out.println("num of comparisons:" + comparisons);
		return comparisons;
	}


	public static void main(String[] args) {
		int [] arr = {12, 3, 5, 10, 17, 9, 14, 1};
		System.out.println(minMaxCouple(arr));

	}
}
