class Solution {
    public boolean isPalindrome(String s) {

        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (!Character.isLetterOrDigit(s.charAt(i))) {
                while (i < j && !Character.isLetterOrDigit(s.charAt(i)))
                    i++;
            }
            if (!Character.isLetterOrDigit(s.charAt(j))) {
                while (j > i && !Character.isLetterOrDigit(s.charAt(j)))
                    j--;
            }
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
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