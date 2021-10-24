package simple;

public class Segitiga {
    public static void main(String[] args){
//        segitiga();
        fizzBuzz();
    }

    // segitiga
    static void segitiga(){
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void fizzBuzz(){
        for (int i = 1; i < 100; i++) {
            if(i % 7 == 0 && i % 9 == 0 ){
                System.out.println("Fizz Buzz");
            }else if(i % 7 == 0){
                System.out.println("Fizz");
            }else if(i % 9 == 0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }
    }

}

