import java.util.*;
public class PrimeCalculator{
    public PrimeCalculator(){

    }

    public boolean isPrime(int number){
        boolean prime = true;
        if(number == 2){
            return true;
        }
        else if(number < 2){
            return false;
        }
        else{
            for(int i = 2; i < number; i++){
                if(number % i == 0){
                    prime = false;
                    break;
                }          
            }
        return prime;
        }
    }

    public ArrayList<Integer> onlyPrimes(ArrayList<Integer> numbers){
        ArrayList<Integer> primes = new ArrayList<Integer>();
        for (int i : numbers){
             if(isPrime(i)){
                primes.add(i);
            } 
        }
        return primes;
    }

    public static void main(String[] args) {     
        PrimeCalculator calculator = new PrimeCalculator();
        boolean result = calculator.isPrime(4);
        System.out.print(result);
        ArrayList<Integer> numbersToCheck = new ArrayList<Integer>();
        numbersToCheck.add(7);
        numbersToCheck.add(28);
        numbersToCheck.add(2);
        numbersToCheck.add(0);
        ArrayList<Integer> primes = calculator.onlyPrimes(numbersToCheck);
        System.out.print(primes);

    }
}
