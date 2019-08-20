package com.vamsi.codeabby.primerage;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class PrimeRage {

	static boolean checkPrime(long n) {
		// Converting long to BigInteger
		BigInteger b = new BigInteger(String.valueOf(n));

		return b.isProbablePrime(1);
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		long testCases = s.nextInt();
		ArrayList<Long> list = new ArrayList<>();
		while (testCases > 0) {

			// long min = s.nextLong();
			// long max = s.nextLong();
			long noOfPrimes = 0;

			// for (long i = min; i <=max; i++) {
			for (long i = 1; i <= 3000000; i++) {

				// long count = 0;
				/*
				 * for (long num = i; num >= 1; num--) { if (i % num == 0) {
				 * count += 1; } } if (count == 2) { noOfPrimes += 1; }
				 */
				if (checkPrime(i)) {
					list.add(i);
					// System.out.println(i+" ");
					// noOfPrimes += 1;

				}

			}
			// System.out.print(noOfPrimes + " ");
			System.out.println(list);
				System.out.println(list.contains(new Integer(1976053)));
			testCases--;

		}

		s.close();
	}

}
