package simple.random;

import java.util.Arrays;

public class AmbilAngka {
    
    public static void main(String[] args) {
        
        // ambil angka setelah 30
        int nums[] = new int[]{1,5,12,7,50,41,2,42,30};
        int getNums[] = new int[4];
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 30) {
                getNums[j] = nums[i];
                j++;
            }
        }

        System.out.println("Angka setelah 30 adalah : " + Arrays.toString(getNums));

    }

}
