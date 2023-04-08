import java.util.Arrays;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] solution = new int[2];
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    int a = nums[i];
                    int b = nums[j];
                    solution[0] = a;
                    solution[1] = b;
                }
            }
        }
        //return solution;
        return  solution;
    }

    public static void main(String[] args) {

        int[] testCase = {2,7,11,15};
        int target = 9;

        System.out.println(Arrays.toString(twoSum(testCase, target)));


        //System.out.println(Arrays.toString(twoSum(testCase, target)));
    }
}
