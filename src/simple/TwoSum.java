package simple;

public class TwoSum {
    
    public static void main(String[] args) {
        twoSum();
    }

    public static void twoSum(){
        int nums[] = new int[]{1,20,5,2,3,10};
        int target = 15;
        String output = "No match numbers";

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(nums[i] + nums[j] == target){
                    output = nums[i] + " + " + nums[j] + " = " + target;
                }
            }
        }

        System.out.println(output);
    }
}
