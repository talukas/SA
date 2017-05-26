package core;

import java.math.BigInteger;

public class CPD {
	

	// Useless parentheses
	public class UselessParentheses {
		void bar() {
			int value = 0;
			int i = 0;
			String s = null;
			value += (s.replaceAll("\\s", "").toLowerCase().charAt(i));

		}
	}
	
	// BigIntegerInstantiation
	public void BigInteger() {
		BigInteger bi1 = new BigInteger("1"); 	// reference BigInteger.ONE
												// instead
		BigInteger bi2 = new BigInteger("0"); 	// reference BigInteger.ZERO
												// instead
		BigInteger bi3 = new BigInteger("0.0"); // reference BigInteger.ZERO
												// instead
		BigInteger bi4;
		bi4 = new BigInteger("0"); 				// reference BigInteger.ZERO instead
		System.out.println(bi1 + ", " + bi2 + ", " + bi3 + ", " + bi4);
	}
	
	
	// JumbledIncrementer
	public class JumbledIncrementerRule1 {
		public void foo() {
			for (int i = 0; i < 10; i++) { // only references 'i'
				for (int k = 0; k < 20; i++) { // references both 'i' and 'k'
					System.out.println("Hello");
				}
			}
		}
	}

	// ForLoopShouldBeWhileLoop

	public class Foo {
		void bar() {
			for (; true;)
				; // No Initialization or Update part, may as well be: while
					// (true)
		}
	}
	
}

