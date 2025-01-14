package hw3.st;

public class PrintPrimes {
    private static boolean isDivisible (int i, int j)
    {
        if (j%i == 0)
            return true;
        else
            return false;
    }
    static void printPrimes(int n)
    {
        int curPrime;
        int numPrimes;
        boolean isPrime;
        int [] primes = new int [100];


        primes [0] = 2;
        numPrimes = 1;
        curPrime  = 2;
        while (numPrimes < n)
        {
            curPrime++;
            isPrime = true;
            for (int i = 0; i <= numPrimes-1; i++)
            {   // for each previous prime.
                if (isDivisible (primes[i], curPrime))
                {  // Found a divisor, curPrime is not prime.
                    isPrime = false;
                    break; // out of loop through primes.
                }
            }
            if (isPrime)
            {   // save it!
                primes[numPrimes] = curPrime;
                numPrimes++;
            }
        }  // End while

        // Print all the primes out.
        for (int i = 0; i <= numPrimes-1; i++)
        {
            System.out.println ("Prime: " + primes[i]);
        }
    }  // end printPrimes

//    public static void main (String []argv)
//    {  // Driver method for printPrimes
//        // Read an integer from standard input, call printPrimes()
//        int integer = 0;
//        if (argv.length != 1)
//        {
//            System.out.println ("Usage: java PrintPrimes v1 ");
//            return;
//        }
//
//        try
//        {
//            integer = Integer.parseInt (argv[0]);
//        }
//        catch (NumberFormatException e)
//        {
//            System.out.println ("Entry must be a integer, using 1.");
//            integer = 1;
//        }
//
//        printPrimes (integer);
//    }
}
