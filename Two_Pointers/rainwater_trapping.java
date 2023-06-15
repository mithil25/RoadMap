import java.util.*;

class Solution {
    int trap(int[] arr) {
        Stack<Integer> st = new Stack<>();

        int water = 0;
        for (int i = 0; i < arr.length; i++) {
            while (!st.empty() && arr[i] > arr[st.peek()]) {
                int top = st.peek();
                st.pop();
                if (st.empty())
                    break;
                int distance = i - st.peek() - 1;
                water += (Math.min(arr[i], arr[st.peek()]) - arr[top]) * distance;
            }
            st.push(i);
        }
        return water;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        System.out.println(new Solution().trap(arr));
    }
}
