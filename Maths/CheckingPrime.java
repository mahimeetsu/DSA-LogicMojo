package com.dsa.maths;

public class CheckingPrime {
	public static void main(String[] args) {
		int n = 10;
		System.out.println(isPrime(n));
		System.out.println(isPrime1(n));
		System.out.println(isPrimeChecktillMid(n));
		System.out.println(isPrimeCheckbySqrt(n));
		System.out.println(isPrimeCheckbySqrtAndIncrementBy6(n));
	}

	/*
	 * TC:O(n) SC:O(1)
	 */
	public static boolean isPrime(int n) {
		int count = 0;

		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				count++;
		}

		if (count == 2)
			return true;
		else
			return false;
	}

	/*
	 * TC:O(n) SC:O(1)
	 */
	public static boolean isPrime1(int n) {

		for (int i = 2; i <= n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	/*
	 * if we observe, for all non prime numbers,by excluding num , last factor is num/2
	 *  ex:
	 * 
	 * factors of 4 is 2 
	 * factors of 6 are 2,3 
	 * factors of 8 are 2,4 
	 * factors of 9 are 3
	 * so we need to iterate till n/2, no need to go till n.
	 * 
	 * But TC : O(n/2)=O(n)
	 */
	public static boolean isPrimeChecktillMid(int n) {

		for (int i = 2; i <= n / 2; i++) {
			if (n % 2 == 0)
				return false;
		}
		return true;
	}

	/*
	 * if we observe, inside for loop , we have if condition and its satisfiled
	 * always for sqrt of n. as soon as its true, we are returting false. so no need
	 * to check till n/2 also.
	 * 
	 * ex:
	 * 
	 * factors of 4 is 2 and if condition is true for 2 factors of 6 are 2,3 and if
	 * condition is true for 2 factors of 8 are 2,4 and if condition is true for 2
	 * factors of 9 are 3 and if condition is true for 2 factors of 15 are 3,5 and
	 * if condition is true for 3
	 * 
	 * so we need to interate till sqrt(n), no need to go till n/2.
	 * 
	 * TC : O(sqrt(n))
	 */
	public static boolean isPrimeCheckbySqrt(int n) {

		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % 2 == 0)
				return false;
		}
		return true;
	}

	/*01 02	03	04	05	06
	 *07 08	09	10	11	12
	 *13 14 15  16  17  18
	 *19 20 21  22  23  24
	 *25 26 27  28  29  30
	 *31 32 33  34  35  36
	 *37 38 39  40  41  42
	 *43 44 45  46  47  48 
	 * 
	 * 1 is not prime.we can return false
	 * 2 and 3 are prime. we can return true
	 * now, how to check other numbers
	 * if we observe complete 2nd,4th,6ths column from 02 to 44 and 04 to 46 and 06 to 48, those are not prime .
	 * because these are divisible by 2.we can write if check
	 * if we observe complete 3rd column from 03 to 45 , those are not prime.becase these are divisible by 3. we can write if check.
	 * now we need to check 1st column(exclude 1) and 5th column.
	 * so we need to start iterating from i=5 till sqrt(n) and check n%i or n%(i+2).
	 * because 05 and 07 need to check , then 11 and 13 , then 17 and 19 etc. so everytime we need to increment i value 6
	 * 
	 * TC : O(sqrt(n)) .But here its little better,because we are jumping by 6 times everytime.
	 */
	public static boolean isPrimeCheckbySqrtAndIncrementBy6(int n) {

		if(n==1)
			return false;
		if(n==2||n==3)
			return true;
		if(n%2==0||n%3==0)
			return false;
		for (int i = 5; i <= Math.sqrt(n); i=i+6) {
			if (n % i == 0|| n%(i+2)==0)
				return false;
		}
		return true;
	}
		
}
