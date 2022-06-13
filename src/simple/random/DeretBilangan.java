package simple.random;

public class DeretBilangan {
    
    // soal dengan output 1*34*6*89*11*
    // dimana jaraknya, 2 ke 5 adalah 3, 5 ke 7 adalah 2, 7 ke 10 adalah 3, dan 10 ke 12 adalah 2
    // berarti deret jarak bilangan adalah 3 - 2 - 3 - 2 - dst....
    public static void main(String[] args) {
        for (int i = 1; i <= 12; i++) {
            if(i%5 == 2 || i%5 == 0 ){
                System.out.print("*");   
            }else{
                System.out.print(i);
            }
        }
        System.out.println();

    }

}
