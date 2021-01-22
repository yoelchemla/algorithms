package algorithms;

public class powImprove {

	public static double powerIterative(double base, int exponent){
		double power = 1;
		while(exponent > 0) {
			if(exponent %2 == 1) {
				power = power * base;
			}
			exponent=exponent/2;
			base = base * base;
		}
		return power;
	}



	public static double powerRecursive(double base, int exponent){
		double power = 1;
		if(exponent == 0)return power;
		else {
			if(exponent %2 == 0) {
				exponent = exponent/2;
				base = base * base;
				power = powerRecursive(base,exponent);
			}
			else{
				exponent = (exponent-1)/2;
				base = base * base;
				power = Math.sqrt(base)*powerRecursive(base,exponent);
			}
		}

		return power;
	}

	public static void main(String[] args) {
		System.out.print(powerRecursive(2,6));
	}

}
