package simple;

public class FizzBuzz {
    
    public static void main(String[] args) {
        fizzBuzz();
    }

    static void fizzBuzz(){
        for (int i = 0; i <= 100; i++) {
            if( i % 3 == 0 && i % 4 == 0 ){
                System.out.println("Fizz Buzz");
            }else if (i % 3 == 0){
                System.out.println("Fizz");
            }else if( i % 4 == 0 ){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
            
        }
    }

}
