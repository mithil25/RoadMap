import java.util.HashMap;
import java.util.PriorityQueue;

class Pair implements Comparable<Pair> {
    int first;
    int second;

    Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public int compareTo(Pair other) {
        // Define your custom sorting logic here
        // For example, sort based on the 'first' field
        return Integer.compare(this.first, other.first);
    }

}

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans = new int[k];
        HashMap<Integer, Integer> hash = new HashMap<>();
        PriorityQueue<Pair> minHeap = new PriorityQueue<>();
        for (int n : nums) {
            hash.put(n, hash.getOrDefault(n, 0) + 1);
        }
        for (int i : nums) {
            if (hash.containsKey(i)) {
                minHeap.add(new Pair(hash.get(i), i));
                hash.remove(i);
            }
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        int i = 0;
        while (minHeap.size() > 0) {
            ans[i++] = minHeap.poll().second;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 1, 1, 3, 3, 3, 4, 2, 2 };
        Solution s1 = new Solution();
        int[] ans = s1.topKFrequent(nums, 2);
        for (int n : ans) {
            System.out.print(n + " ");
        }
        System.out.print("\n");
    }
}