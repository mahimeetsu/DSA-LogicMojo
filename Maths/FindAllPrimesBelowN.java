package com.dsa.maths;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllPrimesBelowN {
	public static void main(String[] args) {
		int n = 25;
		System.out.println(Arrays.toString(findPrimes(n)));
		System.out.println(Arrays.toString(findPrimesSieveOfEratosthenesBasic(n)));
		System.out.println(Arrays.toString(findPrimesSieveOfEratosthenesOptimal1(n)));
		System.out.println(Arrays.toString(findPrimesSieveOfEratosthenesOptimal2(n)));
	}

	public static int[] findPrimes(int n) {
		List<Integer> list = new ArrayList<>();
		int index = 0;
		for (int i = 2; i <= n; i++) {
			if (isPrime(i)) {
				list.add(i);
			}
		}
		return list.stream().mapToInt(Integer::intValue).toArray();
	}

	public static int[] findPrimesSieveOfEratosthenesBasic(int n) {
		List<Integer> list = new ArrayList<>();
		boolean primes[] = new boolean[n + 1];
		// first mark all numbers as true i.e prime
		Arrays.fill(primes, true);
		for (int i = 2; i <= n; i++) {
			if (primes[i] == true) {
				// mark multiple of numbers from 2 to n as false
				for (int j = i * 2; j <= n; j = j + i) {
					primes[j] = false;
				}
			}
		}
		for (int i = 2; i < primes.length; i++) {
			if (primes[i])
				list.add(i);
		}
		return list.stream().mapToInt(Integer::intValue).toArray();
	}

	public static int[] findPrimesSieveOfEratosthenesOptimal1(int n) {
		List<Integer> list = new ArrayList<>();
		boolean primes[] = new boolean[n + 1];
		// first mark all numbers as true i.e prime
		Arrays.fill(primes, true);
		for (int i = 2; i <= n; i++) {
			if (primes[i] == true) {
				// mark multiple of numbers from 2 to n as false
				// here no need to check all numbers multplied 3. we can check first unmarked
				// multiple of i .So its i*i
				for (int j = i * i; j <= n; j = j + i) {
					primes[j] = false;
				}
			}
		}
		for (int i = 2; i < primes.length; i++) {
			if (primes[i])
				list.add(i);
		}
		return list.stream().mapToInt(Integer::intValue).toArray();
	}
	/*
	 * TC:O(nloglogn)
	 * SC:O(n)
	 */
	public static int[] findPrimesSieveOfEratosthenesOptimal2(int n) {
		List<Integer> list = new ArrayList<>();
		boolean primes[] = new boolean[n + 1];
		// first mark all numbers as true i.e prime
		Arrays.fill(primes, true);
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (primes[i] == true) {
				// mark multiple of numbers from 2 to n as false
				for (int j = i * i; j <= n; j = j + i) {
					primes[j] = false;
				}
			}
		}
		for (int i = 2; i < primes.length; i++) {
			if (primes[i])
				list.add(i);
		}
		return list.stream().mapToInt(Integer::intValue).toArray();
	}

	public static boolean isPrime(int n) {

		if (n == 2 || n == 3)
			return true;
		if (n % 2 == 0 || n % 3 == 0)
			return false;
		for (int i = 5; i <= Math.sqrt(n); i = i + 6) {
			if (n % i == 0 || n % (i + 2) == 0)
				return false;
		}
		return true;
	}
}
