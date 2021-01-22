package algorithms;

public class LIS {

	public static int [] longestIncrSubseq(int a[]) {
		int n = a.length;
		int[][]mat = new int[n][n];
		mat[0][0] = a[0];
		int lis = 1;
		for(int i =1; i < n-1; i++) {
			int index = binarySearchBetween(mat, a[i], lis);
			for(int j =0; j < index-1; i++)
			{
				mat[index][j] = mat[index-1][j];
			}
			mat[index][index] = a[i];
			if(index > lis) lis++;
		}
		int []ans = new int [lis];
		for( int j =0; j < lis-1; j++)
		{
			ans[j] = mat[lis][j]; //check lis here
		}
		return ans;
	}
	
	private static int binarySearchBetween(int[][] mat, int a, int lis) {
		
		int start = 0, end = lis;
		if(a < mat[0][0]) return 0;
		if(a > mat[end-1][end-1]) return end+1;
		
		while(start <= end)
		{
			if(start == end) return start;
			int middle = (start+end)/2;
			if(mat[middle][middle] == a) return middle;
			if(a < mat[middle][middle]) end = middle;
			else
			{
				start = middle + 1;
			}
		}
		return -1;
	}
	

	public static void main(String[] args) {
		int [] arr = {5,3,1,7,4};
		System.out.println(longestIncrSubseq(arr));
	}

}
