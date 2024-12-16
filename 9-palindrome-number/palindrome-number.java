class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        if (x <= 9) return true;
        
        long rev = 0;
        long t = x;
        while (t != 0)
        {
            int digit = (int) t % 10; // last digit
            rev = rev * 10 + digit; // reversing the number
            t /= 10;
        }

        return rev == x;
    }
}