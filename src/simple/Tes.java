package simple;

public class Tes {
    
    public static void main(String[] args) {
        
        System.out.println(fibonacci(5));
    
    }

    static int fibonacci(int numbers){
        if (numbers <= 1){
            return 1;
        }
        return fibonacci(numbers * (numbers - 1));
    }

}
