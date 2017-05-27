package core;

import java.math.BigInteger;

public class CPDtest {
	

	// Useless parentheses
	public class UselessParentheses {
		void bar() {
			int value = 0;
			final int init = 0;
			final String strict = null;
			value += (strict.replaceAll("\\s", "").toLowerCase().charAt(init));

		}
	}
	
	// BigIntegerInstantiation
	public void bigInteger() {
		BigInteger bi1 = new BigInteger("1"); 	// reference BigInteger.ONE
												// instead
		BigInteger bi2 = new BigInteger("0"); 	// reference BigInteger.ZERO
												// instead
		BigInteger bi3 = new BigInteger("0.0"); // reference BigInteger.ZERO
												// instead
		BigInteger bi4;
		bi4 = new BigInteger("0"); 				// reference BigInteger.ZERO instead
		//System.out.println(bi1 + ", " + bi2 + ", " + bi3 + ", " + bi4);
	}
	

	// ForLoopShouldBeWhileLoop

	public class finish {
		void bar() {
			for  (; true;);
				// No Initialization or Update part, may as well be: while
					// (true)
		}
	}
	
}

