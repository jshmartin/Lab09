package q2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Primes.
 * This class uses the sieve of Eratosthenes to determine prime numbers.
 *
 * @author Joshua Martinez
 * @version 1.0
 */
public class Primes {
	
	ArrayList<Boolean> primes = new ArrayList<Boolean>();
	int _N;
	
	/**
	 * Constructor for Primes.
	 */
	public Primes (int N) {
		_N = N;
		primes = new ArrayList<Boolean>(N+1);
	}
	
	private void calculatePrimes() {
		int truePrimes = 0;
		int falsePrimes = 0;
		for(int index = 0; index < _N; index++) {
			if(primes.get(index) == true) {
				truePrimes++;
			}
			else {
				falsePrimes++;
			}
		}
		
	}
	
	public String printPrimes() {
		return "";
	}
	
	public int countPrimes() {
		
		int numOfPrimes = 0;
		return numOfPrimes;
	}
	
	public boolean isPrime(int x) {
		for(x=0; x < N; )
		return false;
		
	}
	
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	System.out.println("This program uses the sieve of Erastosthenes"
    			+ " to dermine which numbers are prime");
    	System.out.println("Enter an upper bound: ");
    	int input = scan.nextInt();
    	while(input < 1) {
    		System.out.println("Please enter a valid number > 1");
    		input = scan.nextInt();
    	}
    	Primes prime = new Primes(input);
    	prime.countPrimes();
    	System.out.println(prime.printPrimes());
    	
    	scan.close();
    	
    }

};
