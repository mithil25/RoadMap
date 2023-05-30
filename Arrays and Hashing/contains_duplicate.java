import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hash = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (hash.contains(nums[i])) {
                return true;
            }
            hash.add(nums[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] demo = { 1, 2, 1, 1, 2, 3, 5, 6, 7 };
        Solution s1 = new Solution();
        boolean contains = s1.containsDuplicate(demo);
        System.out.print(contains ? "YES\n" : "NO\n");
    }
}