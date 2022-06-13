package simple.random;

public class CustomSum {
    
    public static void main(String[] args) {
        
        int data[] = new int[]{1,3,5,7};
        int target = 8;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                if(data[i] + data[j] == target){
                    System.out.println(data[i] + " + " + data[j] + " = " + (data[i]+data[j]));
                }
            }
        }

    }

}
