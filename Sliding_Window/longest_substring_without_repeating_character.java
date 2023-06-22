import java.util.HashMap;

class Solve {

    int lengthOfLongestSubstring(String s) {
        int maxLengthOfSubString = 0;
        HashMap<Character,Integer> hash = new HashMap<>();
        int N = s.length();
        int i,j;
        i = j = 0;
        while(j<N)
        {
            if(hash.getOrDefault(s.charAt(j),-1)>=i){
                i = hash.get(s.charAt(j))+1;
            }
            hash.put(s.charAt(j),j);
            int windowLength = j-i+1;
            j++;
            maxLengthOfSubString = Math.max(maxLengthOfSubString,windowLength);
        }
        return maxLengthOfSubString;
    }
    public static void main(String[] args) {
        Solve s1 = new Solve();
        System.out.printf("pwwkew max length %d\n" ,s1.lengthOfLongestSubstring(new String("pwwkew")));
    }
}
