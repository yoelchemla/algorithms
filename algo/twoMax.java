package algorithms;
									//continue
public class twoMax {

	public static int algo1(int[]a) {
		int max1 = 0, comparisons = 0;
		for(int i = 1; i < a.length; i++)
		{
			comparisons++;
			if(a[i] > a[max1]) {
				max1 = i;
			}
		}
		System.out.println("the max1 is "+ max1);
		//swap
		int temp;
		temp = a[a.length-1];
		a[a.length-1] = a[max1];
		a[max1] = a[a.length-1];

		int max2 = 0; 
		for(int i = 1; i < a.length-1; i++) {
			comparisons++;
			if(a[i] > a[max2]) {
				max2 = i;
			}
		}
		System.out.println("the max2 is "+ max2);
		return comparisons;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 5, 12, 51, 9, 13, 26,7,19};
		System.out.print(algo1(arr));
		
	}

}
