package johny.javaalgorithms.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Primality testing using Sieve of Eratosthenes
 */
public class PrimalityTesting {

    /**
     * Find the prime numbers below the limit
     *
     * @param limit - the limit
     * @return - list of prime numbers
     */
    public static List<Integer> getPrime(int limit) {
        // declaring the list to store the primes
        List<Integer> primeList = new ArrayList<>();
        // isPrime will be true if a number is prime and will be false if it is not prime
        boolean[] isPrime = new boolean[limit + 1];
        // setting all the values in isPrime to true
        Arrays.fill(isPrime, true);

        // finding the prime numbers
        for (int i = 2; i <= limit; i++) {
            // check if isprime[i] is true
            if (isPrime[i]) {
                // setting isPrime of all the multiples of i as false
                for (int j = i * 2; j <= limit; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        // creating the list of primes based on isPrime
        for (int i = 1; i < isPrime.length; i++) {
            // if isPrime[i] is true then the numeber is prime and is added to primeList
            if (isPrime[i]) {
                primeList.add(i);
            }
        }
        // return the list of primes
        return primeList;
    }
}
