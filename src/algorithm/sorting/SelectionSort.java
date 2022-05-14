package algorithm.sorting;

public class SelectionSort {
    
    public static void main(String[] args) {
        
        int numbers[] = {12, 1, 32, 44, 22, 99};
        SelectionSortInt(numbers);

    }

    public static void SelectionSortInt(int[] numbers){
        System.out.println("===== SEBELUM =====");
        for (int number: numbers) {
            System.out.print(number+ ", ");
        }
        System.out.println();

        // logic
        for (int i = 0; i < numbers.length; i++) {
            int indexArray = i;
            for (int j = i; j < numbers.length; j++) {
                if(numbers[indexArray] < numbers[j]){
                    indexArray = j;
                }
            }
            // variable penampung
            int k = numbers[i];
            numbers[i] = numbers[indexArray];
            numbers[indexArray] = k;
        }

        System.out.println("===== SESUDAH =====");
        for (int number: numbers) {
            System.out.print(number+ ", ");
        }
        System.out.println();
    }

}
