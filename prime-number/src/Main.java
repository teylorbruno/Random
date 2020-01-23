import messages.Messages;

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        PrimeNumber primeNumber = new PrimeNumber();

        Scanner input = new Scanner(System.in);
        System.out.println(Messages.INPUT_NUMBER);
        int numberInput = input.nextInt();
        primeNumber.isPrime(numberInput);
    }

}

