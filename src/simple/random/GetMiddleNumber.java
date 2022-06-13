package simple.random;

public class GetMiddleNumber {
    
    public static void main(String[] args) {
        int data[] = new int[]{1,3,5,7,9,1,4,5,3,3,5};
        int dataLength = data.length;
        int dataDivide = dataLength/2;
        for (int i = 0; i < data.length; i++) {
            if(i == dataDivide){
                System.out.println("Nilai tengah adalah : "+data[i]);
            }
        }

    }

}
