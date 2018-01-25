/**
 * Two examples of methods for determining whether an int is prime. 
 * You will be asked questions about this code on the loops test.
 * 
 * @author Jon Cooper
 * @version November 18, 2013
 */
public class Primes 
{
    /**
     * Determine if an int is prime.
     * 
     * @param n     number to test
     * @return      true if number is prime, false otherwise
     */
    public static boolean isPrime1(int n)
    {
        if (n < 2) return false;
        
        for (int i=2; i<n; i++)
        {
            if (n % i == 0) return false;
        }
        
        return true;
    }
    
    /**
     * A more efficient way to determine if an int is prime.
     * 
     * @param n     number to test
     * @return      true if number is prime, false otherwise
     */
    public static boolean isPrime2(int n)
    {
        if (n == 2)        return true;
        else if (n < 2 || n % 2==0 ) return false;
        
        double limit = Math.sqrt(n);
        
        for (int i=3; i<=limit; i+=2)
        {
            if (n % i == 0) return false;
        }
        
        return true;
    }
        
    public static void printingPrime(int x)
    {
        int n = 2;
        boolean isPrime = false;
        for(int i = 0; i <= x; i++)
        {
            isPrime = isPrime2(n);
            if(isPrime)
            {
                System.out.println(i + "==" + n);
                n++;
                isPrime = false;
            }
            else
            {
                n++;
                i--;
            }
        }
    }
    
    public static int countingPrime(int start, int end)
    {
        int prime = 0;
        boolean isPrime = false;
        for(int i = start; i <= end; i++)
        {
            isPrime = isPrime2(i);
            if(isPrime)
            {
                prime++;
                isPrime = false;
            }
        }
        return prime;
    }
    
    public static long sumOfPrime(int end)
    {
        long sum = 0;
        int found = 0;
        int n = 2;
        
        boolean isPrime = false;
        while(found <= end)
        {
            isPrime = isPrime2(n);
            if(isPrime)
            {
                sum += n;
                n++;
                found++;
            }
            else
            {
                n++;
            }
        }
        return sum;
    }
    
    public static void main(String[] args)
    {
        // test isPrime1
        System.out.println( isPrime1(2) );
        System.out.println( isPrime1(9) );
        System.out.println( isPrime1(17) );
        
        
        // test isPrime2
        System.out.println( isPrime2(2) );
        System.out.println( isPrime2(9) );
        System.out.println( isPrime2(17) );
        
        
        // Study the isPrime1 and isPrime2 methods to answer the following:
        
        // 0. Study the method isPrime1. Describe the set of numbers that would be 
        //    tested as divisors when checking the value 19 for primality. Do the 
        //    same for 91 and 643.
        
        /**for the numbers 19,91, and 643 it would do a full run through of the numbers
         * and would tes every number from 2 till one mus the number you are trying to find
         * that is prime. It will return false if the number is divisible by one of the
         * divisors. If it does not find one by the end of the loop it will return true.
         */
        
        
        // 1. Study the method isPrime2. Describe the set of numbers that would be 
        //    tested as divisors when checking the value 19 for primality. Do the 
        //    same for 91 and 643.
        
        /**for the numbers 19,91, abd 643 it will first look at if the number is even or
         * if the number is 2 to eliminate it from the list because that would make it not
         * prime. Then it would grab the double of the square root of the number and set it
         * to the limit to check if it is prime or not since at one point the divisors will
         * back on itself.The counter starts at 3 and checks all odd numbers due to the fact
         * that it isn't even. It will return false if the number is divisible by one of the
         * divisors. If it does not find one by the end of the loop it will return true.         * 
         */
        
        // 2. The number 15,485,863 is the 1 millionth prime number. Suppose it is 
        //    tested in both isPrime1 and isPrime2 for primality. About how much
        //    faster will isPrime2 finish testing. Show how you determined your answer.
        System.out.println( isPrime1(15485863) );
        System.out.println( isPrime2(15485863) );
        //Prime2 is a lot more efficent than Prime1
        
        // 3. In isPrime2, why is the limit calculated before the loop rather than
        //    writing the loop as for (int i=3; i<=Math.sqrt(n); i=i+2)?
        
        /**If the limit was caculated in the loop every time it checked a number it would 
         * recalculate the square root of n everytime making it less efficent. 
         */
        
        // 4. The number 1 is not prime, however both prime function say that it is.
        //    Negative numbers cannot be prime either. Fix each function so that all
        //    ints less than 2 return false.

        // added: if(n<2) return false;
        
        // Write blocks of code that use isPrime2 to solve the following problems:
        
        // 5. Generate a list of the first 50 prime numbers.
        //Working Currently.
        // 6. What is the 100th prime? the 1000th? The 12847th?
        //100 == 547. 1000 == 7927. 12847 == 138079.
        // 7. In the set of integers from 2-1000000, how many are prime?
        //Returns 78498
        // 8. What is the sum of the all prime numbers below 1,000,000?
        //Returns 7472982453366
        // 9. What is the sum of the first 1000 prime numbers?
        //Returns 3690840
        
    }
    
}
