import java.util.ArrayList;

public class PrimeNumber {

    public boolean isPrime(int number) {

        if (number == 2) {
            System.out.println("The Number " + number + " is prime!");
            return true;
        }
        if (number < 2) {
            System.out.println("The Number " + number + " is NOT prime!");
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                System.out.println("The Number " + number + " is NOT prime!");
                return false;
            }
        }
        System.out.println("The Number " + number + " is prime!");
        return true;
    }

    public ArrayList<Integer> primes(int[] numbers) {

        ArrayList<Integer> primeNumbers = new ArrayList<>();

        for (int number : numbers) {
            if (isPrime(number)) {
                primeNumbers.add(number);
            }
        }
        return primeNumbers;
    }

}
