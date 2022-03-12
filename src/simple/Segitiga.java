package simple;

public class Segitiga {
    public static void main(String[] args){
       segitiga();
    }

    static void segitiga(){
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}

