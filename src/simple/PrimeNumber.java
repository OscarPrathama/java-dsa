package simple;

import java.util.ArrayList;
import java.util.List;

// pelajari
public class PrimeNumber {

    public static void main(String[] args) {

        List<Integer> primes = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            // berapa kali bilangan saat ini membagi dirinya sendiri
            // penjelasan -> https://youtu.be/9kyg1bgPCto?t=684
            int current_bill = 0;
            for (int j = 1; j <= i; j++) {
                if(i%j == 0){
                    current_bill = current_bill+1;
                }
            }

            if(current_bill == 2){
                primes.add(i);
            }
        }
        System.out.println(primes);
    }

}
