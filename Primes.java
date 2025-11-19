public class Primes {
    public static void main(String[] args) {
        boolean[] isPrime = new boolean[Integer.parseInt(args[0]) + 1];
        int sqrtN = (int) Math.sqrt(isPrime.length - 1);
        int i = 2;
        int primeCount = 0;
        while (i<=sqrtN) { // runs between 2 and sqrt n and marks multiples of i as non-prime
            if (!isPrime[i]) {
                for (int j = i * i; j < isPrime.length; j += i) { // starts marking from i^2, as all smaller multiples of i will have
                                                                  // already been marked by smaller primes, taking for example 2 and 3...
                    isPrime[j] = true;
                }
            }
            i++;
        }
        System.out.println("Prime numbers up to " + (isPrime.length - 1) + ":"); 
        for (int k = 2; k < isPrime.length; k++) {
            if (!isPrime[k]) {
                System.out.println(k);
                primeCount++;
            }
        }
System.out.println("There are " + primeCount + " primes between 2 and " + (isPrime.length - 1) + " (" + (primeCount * 100 / (isPrime.length - 1)) + "% are primes)");    }
}