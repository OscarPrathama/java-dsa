package simple;

import java.util.Arrays;

public class OddEvenVariable {
    
    public static void main(String[] args) {
        int odd[] = new int[50];
        int oddCounter = 0;
        int even[] = new int[50];
        int evenCounter = 0;
        for (int i = 1; i <= 100; i++) {
            if(i%2 == 1){
                odd[oddCounter] = i;
                oddCounter++;
            }
            if(i%2 == 0){
                even[evenCounter] = i;
                evenCounter++;
            }
        }
        System.out.println(Arrays.toString(odd));
        System.out.println();
        System.out.println(Arrays.toString(even));
    }

}
