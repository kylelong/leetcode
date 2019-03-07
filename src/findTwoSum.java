/**
 * Created by kylel95 on 12/20/18.
 */
public class findTwoSum {
    public static int binarySearch(int start, int[] nums, int target){
        int low = start;
        int high = nums.length - 1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(nums[mid] > target){
                high = mid - 1;
            }
            else if(nums[mid] < target){
                low = mid + 1;
            }
            if(nums[mid] == target){
                return mid;
            }
        }
        return -1;
    }
    public int[] twoSum(int[] nums, int target) {
        int [] result = new int[2];
        for(int i = 0; i < nums.length; i++){
            int num = target - nums[i];
            int b = binarySearch(i + 1, nums, num);
            if(b != -1){
                result[0] = i;
                result[1] = b;
                return result;

            }
        }
        return result;
    }
}
