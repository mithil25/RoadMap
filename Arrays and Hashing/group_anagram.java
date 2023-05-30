import java.util.*;

class Pair implements Comparable<Pair> {
    String first;
    String second;

    Pair(String first, String second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public int compareTo(Pair other) {
        // Define your custom sorting logic here
        // For example, sort based on the 'first' field
        return this.first.compareTo(other.first);
    }

}

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        List<Pair> stringMapping = new ArrayList<Pair>();
        for (int i = 0; i < strs.length; i++) {
            char[] anagramArray = strs[i].toCharArray();
            Arrays.sort(anagramArray);
            String sortedString = new String(anagramArray);
            Pair p = new Pair(sortedString, strs[i]);
            stringMapping.add(p);
        }
        Collections.sort(stringMapping);
        int start = 0;
        int N = stringMapping.size();
        String currentAnagram = stringMapping.get(0).first;
        List<String> currentList = new ArrayList<String>();
        while (start < N) {
            if (currentAnagram.equals(stringMapping.get(start).first)) {
                currentList.add(stringMapping.get(start).second);
            } else {
                ans.add(currentList);
                currentList = new ArrayList<>();
                currentList.add(stringMapping.get(start).second);
                currentAnagram = stringMapping.get(start).first;
            }
            start++;
        }
        if (currentList.size() > 0) {
            ans.add(currentList);
        }
        return ans;
    }

    public static void main(String[] args) {
        String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
        Solution s1 = new Solution();
        List<List<String>> result = s1.groupAnagrams(strs);
        for (List<String> data : result) {
            for (String str : data) {
                System.out.print(str + " ");
            }
            System.out.print("\n");
        }
    }
}