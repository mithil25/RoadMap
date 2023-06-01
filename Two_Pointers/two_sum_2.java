import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int low = 0;
        int high = numbers.length - 1;
        while (low < high) {
            int sum = numbers[low] + numbers[high];
            if (sum == target) {
                return new int[] { low + 1, high + 1 };
            } else if (sum > target) {
                high--;
            } else {
                low++;
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] arr = { 2, 6, 7, 8, 9, 10 };
        Solution s1 = new Solution();
        System.out.println(Arrays.toString(s1.twoSum(arr, 9)));
    }
}