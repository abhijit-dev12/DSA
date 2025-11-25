class Solution {
    public boolean validPalindrome(String s) {
                int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++; j--;
            } else {
                return isPalindromeRange(s, i + 1, j) || isPalindromeRange(s, i, j - 1);
            }
        }
        return true;
    }

    private boolean isPalindromeRange(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }
}