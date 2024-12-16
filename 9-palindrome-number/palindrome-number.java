class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        if (x <= 9) return true;
        String number = String.valueOf(x);
        int i = 0;
        int j = number.length() - 1; 
        while (i < j)
        {
            if (!(number.charAt(i) == number.charAt(j)))
            {
                return false;
            }
            i += 1;
            j -= 1;
        }
        return true;
    }
}