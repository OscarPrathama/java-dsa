package simple;

import java.util.ArrayList;
import java.util.List;

public class FibonacciLoop {
    
    public static void main(String[] args) {
        
        List<Integer> fibonnaci = new ArrayList<>();
        int a = 0;
        int b = 1;

        for (int i = 0; i <= 7; i++) {
            if(i <= 1){
                fibonnaci.add(i);
            }else{
                int total = a+b;
                fibonnaci.add(total);
                a = b;
                b = total;
            }
        }

        System.out.println(fibonnaci);
        
    }

}

/*
expected result : 0 1 1 2 3 5 8 13
start from iterate 2
iterate 2
    - a = 0
    - b = 1
    - c = a + b (1)
iterate 3
    - a = b (1)
    - b = c (1) (liat nilai c di iterate sebelumnya) 
    - c = a + b (2)
iterate 4
    - a = b (1)
    - b = c (2)
    - c = a + b (3)
iterate 5
    - a = b (2)
    - b = c (3)
    - c = a + b (5)
iterate 6
    - a = b (3)
    - b = c (5)
    - c = a + b (8)
*/