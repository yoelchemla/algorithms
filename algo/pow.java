package algorithms;

public class pow {

	public static int powRecursive(int base, int pow) {

		if(pow == 0) return 1;
		if(pow%2 == 0) return powRecursive(base*base, pow/2);
		
		return base * powRecursive(base * base, (pow - 1)/2);
	}
	
	public static int powIterative(int base, int pow) {

		if(base ==0 && pow ==0){
			throw new ArithmeticException("error");
		}
		if (pow == 0){
			return 1;
		}

		if(pow == 1) {
			return base;
		}
		int res = 1;
		while(pow !=0) {
			if(pow % 2 == 1) {
				res *= base; 
			}
			else {
				return res;
			}
			base *= base;
			pow /=2;
		}
		return res;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(powRecursive(3,4));
		System.out.println(powIterative(3,3));

	}

}
