package algorithms;

public class aliceAndBob {

	public static int coinFlip()
	{
		long result = 0;
		result = Math.round(Math.random());
		return (int)result;
	}

	public static int aliceGame()
	{
		return coinFlip();
	}

	public static int bobGame()
	{
		return coinFlip();	
	}

	public static boolean game1()// strategy1 --> 50% success
	{
		boolean result = false;
		int aliceResult = aliceGame();
		if(aliceResult > 0)
		{
			result = true;
		}
		return result;
	}

	public static boolean game2()// strategy 2 --> 75% success
	{
		boolean result = false;
		int aliceResult = aliceGame();
		int bobResult = bobGame();
		if(aliceResult == 1 || bobResult == 1)
		{
			result = true;
		}

		return result;
	}
	
	public static boolean game2A()//  strategy 2 --> 75% success
	{
		boolean result = false;
		int aliceResult = aliceGame();
		int BobResult = bobGame();
		if ((aliceResult == 0) || (BobResult == 0))
		{
			result = true; 
		}
		return result;
	}
	
	public static boolean game3()// strategy 3 --> 50% success
	{
		boolean result = false;
		int aliceResult = aliceGame();
		int bobResult = bobGame();
		if(aliceResult == bobResult)
		{
			result = true;
		}
		return result;
	}

	public static boolean game4()// strategy 4 --> 100% success
	{
		boolean result = false;
		int aliceResult = aliceGame();
		int bobResult = bobGame();
//				if( bobResult != bobGame() && aliceResult == aliceGame())
//				{
//					result = true;
//				}
	if ((aliceResult == bobResult) ||	(bobResult == 1 - aliceResult))
		{
			result =true;
		}
		return result;
	}


	public static void main(String[] args) {


		int count = 10000000;
		int game1 = 0;
		int game2 = 0;
		int game2A = 0;
		int game3 = 0;
		int game4 = 0; 
		boolean result1 = false;
		boolean result2 = false; 
		boolean result2A = false; 
		boolean result3 = false; 
		boolean result4 = false;

		for(int i=0; i<count; i++ )
		{
			result1 = game1();
			if(result1 == true)
			{
				game1++;
			}
			result2 = game2();
			if(result2 == true)
			{
				game2++;
			}
			result2A = game2A();
			if(result2A == true)
			{
				game2A++;
			}
			result3 = game3();
			if(result3 == true)
			{
				game3++;
			}
			result4 = game4();
			if(result4 == true)
			{
				game4++;
			}
		}

		System.out.println("Alice & Bob game : Strategy1  = " + (double)game1/(double)count);
		System.out.println("Alice & Bob game : Strategy2  = " + (double)game2/(double)count);
		System.out.println("Alice & Bob game : Strategy3  = " + (double)game3/(double)count);
		System.out.println("Alice & Bob game : Strategy4  = " + (double)game4/(double)count);
	}

}
