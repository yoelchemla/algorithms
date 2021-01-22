package algorithms;

public class minMax {

	public static int algo1(int[] arr) { // find min

		int min = arr[0];
		int comparisons = 0;
		for(int i = 0; i< arr.length; i++)
		{
			comparisons++;
			if(arr[i] < min)
			{
				min = arr[i];
			}
		}
		System.out.println("the minimum is: "+min);
		return comparisons;
	}

	public static int algo2(int[]arr) { // find max

		int max = arr[0];
		int comparisons = 0;
		for(int i = 0; i< arr.length; i++)
		{
			if(arr[i]> max)
			{
				max = arr[i];
			}
		}
		System.out.println("the maximum is: "+max);

		return comparisons;
	}

	public static int algo3(int[]arr) {
		int res = algo1(arr) + algo2(arr);
		return res;
	}

	public static int algo4(int[]arr) {

		int min =arr[0];
		int max = arr[0];
		int comparisons = 0;
		for(int i= 0; i<arr.length; i++)
		{
			comparisons++;
			if(arr[i] > max)
			{
				max = arr[i];
			}
			if(arr[i] < min)
			{
				min = arr[i];
			}
		}
		System.out.println("the minimum is: "+min);
		System.out.println("the maximum is: "+max);
		return comparisons;
	}

	public static int algo5(int []arr) {

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int comparisons = 0;
		if(arr[0] > arr[1])
		{
			min =arr[0];
			max = arr[1];
		}
		else
		{
			min = arr[1];
			max = arr[0];
		}
		for(int i= 2; i < arr.length; i++)
		{
			comparisons++;
			if(arr[i]> max)
			{
				max = arr[i];
			}
			else
			{
				comparisons++;
				if(arr[i]< min)
				{
					min = arr[i];
				}
			}
		}
		System.out.println("the minimum is: "+min);
		System.out.println("the maximum is: "+max);
		return comparisons;
	}

	public static int algo6(int []arr) {
	
		int comparisons = 0;
		int min = arr[0];
		int max = arr[0];
		
		for(int i= 0; i< arr.length-1; i++) 
		{
			comparisons++;
			if(arr[i] > arr[i+1]) 
			{
				comparisons += 2;
				if(arr[i] > max) 
				{
					max = arr[i];
				}
				if(arr[i+1] < min)
				{
					min = arr[i+1];
				}
			else
				{
					comparisons += 2;
					if(arr[i+1] > max)
					{
						max = arr[i+1];
					}
					if(arr[i] < min)
					{
						min = arr[i];
					}
				}

			}
			
		}
		System.out.println("the minimum is: "+min);
		System.out.println("the maximum is: "+max);
		return comparisons;
	}


	public static void main(String[] args) {
		int [] arr = {7,1,2,56,243,3,4,5,6,7,8,31};
		System.out.println(algo6(arr));
	}

}

