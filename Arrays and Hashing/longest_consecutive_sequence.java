import java.util.HashMap;
import java.lang.Math;

class Solution {
    public int longestConsecutive(int[] nums) {
        int ans = 0;
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int n : nums) {
            hash.put(n, hash.getOrDefault(n, 1));
        }
        for (int n : nums) {
            if (!hash.containsKey(n - 1)) {
                int k = n;
                while (hash.containsKey(k)) {
                    k++;
                }
                ans = Math.max(ans, k - n);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 0, 3, 7, 2, 5, 8, 4, 6, 0, 1 };
        Solution s1 = new Solution();
        int ans = s1.longestConsecutive(nums);
        System.out.print("Longest Consecutive Sequence--> " + ans + "\n");
    }
}