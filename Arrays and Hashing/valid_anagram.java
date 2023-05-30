import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        HashMap<Character, Integer> hash = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            hash.put(s.charAt(i), hash.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            if (hash.containsKey(t.charAt(i))) {
                if (hash.get(t.charAt(i)) > 0)
                    hash.put(t.charAt(i), hash.get(t.charAt(i)) - 1);
                else
                    return false;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution s1 = new Solution();
        boolean contains = s1.isAnagram("ate", "eatm");
        System.out.print(contains ? "YES\n" : "NO\n");
    }
}