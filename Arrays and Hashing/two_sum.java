import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = { -1, -1 };
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                ans[0] = map.get(target - nums[i]);
                ans[1] = i;
                return ans;
            } else {
                map.put(nums[i], i);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 18;
        Solution s1 = new Solution();
        int[] data = s1.twoSum(nums, target);
        System.out.print(Arrays.toString(data) + "\n");
    }
}