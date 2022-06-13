package simple;

import java.util.ArrayList;
import java.util.List;

public class Tes {
    
    public static void main(String[] args){
        System.out.println(fizzBuzz(15));
    }
    
    public static List<String> fizzBuzz(int n) {
        List<String> fizzBuzz = new ArrayList<>();
        for(int i=1; i<=n; i++){
            if( i%3==0 && i%5==0 ){
                fizzBuzz.add("FizzBuzz");
            }else if(i%3==0){
                fizzBuzz.add("Fizz");
            }else if(i%5==0){
                fizzBuzz.add("Buzz");
            }else{
                fizzBuzz.add(""+i+"");
            }
        }
        return fizzBuzz;
    }

}
