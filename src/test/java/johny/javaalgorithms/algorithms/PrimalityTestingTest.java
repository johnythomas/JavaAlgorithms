package johny.javaalgorithms.algorithms;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class PrimalityTestingTest {

    @Test
    public void testGetPrimes() {
        List<Integer> primes = PrimalityTesting.getPrime(10);
        int[] expectedPrimes = new int[]{2, 3, 5, 7};
        assertArray(primes, expectedPrimes);
        primes = PrimalityTesting.getPrime(100);
        expectedPrimes = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        assertArray(primes, expectedPrimes);
    }

    private void assertArray(List<Integer> primes, int[] expectedPrimes) {
        for (int i = 0; i < primes.size(); i++) {
            assertEquals(expectedPrimes[i], primes.get(i).intValue());
        }
    }
}
