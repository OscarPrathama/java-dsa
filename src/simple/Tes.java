package simple;

public class Tes {
    
    public static void main(String[] args) {
        
        segitiga();
    
    }

    static void segitiga(){
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j <= 5; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

}
