package simple;

public class SegitigaTerbalik {
    
    public static void main(String[] args) {
        segitigaTerbalik();
    }

    static void segitigaTerbalik(){
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j <= 5 ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

}

/**
-> loop i = 1
    -> j = 12345
-> loop i = 2
    -> j = 2345
-> loop i = 3
    -> j = 345
-> loop i = 4
    -> j = 45
-> loop i = 5
    -> j = 5
*/
