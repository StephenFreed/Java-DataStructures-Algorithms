package CodingProblems;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

/*
finds list of prime numbers up to number input by user
 */

public class FindPrimeNumbers {

    public static void main(String[] args) {

        // gets user input on number to find prime numbers up to
        System.out.print("Enter Number. Find Prime Numbers Up To: ");
        Scanner scanner = new Scanner(System.in);
        int primesToFind = scanner.nextInt();

        List<Integer> primeNumbers = new ArrayList<>();

        // loops through the numbers up to the number input
        for (int numberToCheck = 2; numberToCheck <= primesToFind; numberToCheck++) {
            // assume we have a prime number
            boolean isPrime = true;
            // factor to divide each number up to half the number
            for (int factor = 2; factor <= numberToCheck/2; factor++) {
                if (numberToCheck % factor == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primeNumbers.add(numberToCheck);
            }
        }
        System.out.println("List Of Prime Numbers From 0 To " + primesToFind);
        for (int primes : primeNumbers) {
            System.out.print(primes + ", ");
        }
    }
}
