package simple.random;

import java.util.ArrayList;
import java.util.Arrays;

public class AngkaTunggal {

    public static void main(String[] args) {
        // int[] arrayData = new int[]{1,3,1,4,2,2,5,1,6,8,2,3,5,7,8,2,3,1,5,2,3};
        // int[] arrayDistinctData = new int[14];
        ArrayList<Integer> arrayData = new ArrayList<>();
        arrayData.addAll(Arrays.asList(1,3,1,4,2,2,5,1,6,8,2,3,5,7,8,2,3,1,5,2,3));

        ArrayList<Integer> arrayDistinctData = new ArrayList<>();
        
        int totalKetemu = 0;

        for (int i = 0; i < arrayData.size(); i++) {
            boolean ketemu = false;
            
            for (int j = 0; j < arrayDistinctData.size(); j++) {
                if( arrayData.get(i) == arrayDistinctData.get(j) ){
                    ketemu = true;
                }
            }

            if(!ketemu){
                arrayDistinctData.add(arrayData.get(i));
                for (int j = 0; j < arrayData.size(); j++) {
                    if( arrayData.get(i) == arrayData.get(j)){
                        totalKetemu = totalKetemu+1;
                    }
                }
                System.out.println("Angka "+arrayData.get(i) + " sebanyak " + totalKetemu);
                totalKetemu = 0;
            }

        }

        System.out.println("distinct data : " + arrayDistinctData);
        System.out.println("total ketemu : " + totalKetemu);
    }
    
}
