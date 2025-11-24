class Solution {
    public boolean isPalindrome(int x) {
        //negative numbers cannot be palindrome
        if(x < 0) return false;

        int Original = x;
        int rev = 0;

        while(x != 0){
            int digit = x % 10;
            rev = rev*10+digit;
            x = x / 10;
        }
        return Original == rev;
    }
}