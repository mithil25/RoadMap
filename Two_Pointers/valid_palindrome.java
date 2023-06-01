class Solution {
    public boolean isPalindrome(String s) {

        String filteredString = "";
        s = s.toLowerCase();
        for (int k = 0; k < s.length(); k++) {
            char ch = s.charAt(k);
            if (ch >= 'a' && ch <= 'z' || ch >= '0' && ch <= '9') {
                filteredString += ch;
            }
        }
        System.out.println(filteredString);
        int i = 0;
        int j = filteredString.length() - 1;
        while (i < j) {
            if (filteredString.charAt(i) != filteredString.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        Solution s1 = new Solution();
        System.out.print(s1.isPalindrome(str) ? "YES.." : "NO..");
    }
}