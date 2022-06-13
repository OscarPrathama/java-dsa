package algorithm.sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int nilai[] = {516, 99, 12, 45, 32};
        BubbleSortASCInt(nilai);
        
        String words[] = {"budi", "wawan", "irna", "hasan"};
        BubbleSortASCString(words);

        // char pakai kutip 1, String pakai kutip 2 dalam Java
        // dalam char, angka lebih dulu dari huruf, dan huruf capital lebih dulu dari lowercase
        char letters[] = {'B', '1', 'A', 'z', 'a', 'f'};
        BubbleSortASCChar(letters);
    }

    public static void BubbleSortASCInt(int[] numbers){
        System.out.println("==== Sebelum ====");
        for (int number: numbers) {
            System.out.print(number + ", ");
        }

        // logic
        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers.length-1; j++){
                if(numbers[j] > numbers[j+1]){
                    // variabel penampung
                    int k = numbers[j];

                    // tukar posisi
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = k;

                    /**
                     * loop 0 = 516, 99, 12, 45, 32, -> nilai awal
                     * loop 1 = 99, 516, 12, 45, 32,
                     * loop 2 = 12, 99, 516, 45, 32,
                     * loop 3 = 12, 45, 99, 516, 32,
                     * loop 4 = 12, 32, 45, 99, 516,
                     * 
                     * notes = loop 1 melihat data dari loop 0, loop 2 melihat data dari loop 1, dst...
                    */

                }
            }
        }

        System.out.println("\n==== Sesudah ====");
        for (int number: numbers) {
            System.out.print(number + ", ");
        }

        // int length = numbers.length - 1;
        System.out.println();
        System.out.println();
    }

    public static void BubbleSortASCString(String words[]){
        System.out.println("==== Sebelum ====");
        for (String word: words) {
            System.out.print(word + ", ");
        }

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length-1; j++) {
                // gunakan compareTo() karena yang dibandingkan adalah karakter
                if( words[j].compareTo(words[j+1]) > 0 ){
                    // variabel penampung
                    String k = words[j];
                    words[j] = words[j+1];
                    words[j+1] = k;
                }
            }
        }
        System.out.println();

        System.out.println("==== Sesudah ====");
        for (String word: words) {
            System.out.print(word + ", ");
        }
        System.out.println();
        System.out.println();
    }

    public static void BubbleSortASCChar(char letters[]){
        System.out.println("==== Sebelum ====");
        for (char letter: letters) {
            System.out.print(letter + ", ");
        }

        for (int i = 0; i < letters.length; i++) {
            for (int j = 0; j < letters.length-1; j++) {
                if(letters[j] > letters[j+1]){
                    // variabel penampung
                    char k = letters[j];
                    letters[j] = letters[j+i];
                    letters[j+i] = k;
                }
            }
        }

        System.out.println();

        System.out.println("==== Sesudah ====");
        for (char letter: letters) {
            System.out.print(letter + ", ");
        }
        System.out.println();
    }

}
