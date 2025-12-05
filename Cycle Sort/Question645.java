// import java.lang.reflect.Array;
import java.util.Arrays;

class Solution {
    public int[] findErrorNums(int[] nums) {
        
        int i = 0;

        while (i < nums.length) {
            int correctIndex = nums[i] - 1;

            if (nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }
        for(int j=0;j<nums.length;j++){
            if(j !=nums[j]-1){
                return new int []{nums[j],j+1};
            }
        }
        return new int[] {-1,-1};
    }

    public void swap(int[] arr, int s, int e) {
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
}
public class Question645 {
    public static void main(String[] args) {
        //Input: nums = [1,2,2,4]
        // Output: [2,3]
        int nums[]={1,2,2,4};
        Solution s=new Solution();
        int[] arr=s.findErrorNums(nums);
        System.out.println(Arrays.toString(arr));
        
    }
}
