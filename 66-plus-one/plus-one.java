class Solution {
    public int[] plusOne(int[] digits) {
        int ldx = digits.length - 1;
        int last = digits[ldx];
        int ilast = last + 1;
        String ilastStr = String.valueOf(ilast);
        if (ilastStr.charAt(ilastStr.length() - 1) == '0')
        {

            while (ldx > -1 && digits[ldx] == 9)
            {
                digits[ldx] = 0;
                ldx--;
            }

            if (ldx == -1)
            {
                int length = digits.length + 1;
                int[] newArr = new int[length];
                newArr[0] = 1;
                return newArr;
            }

            digits[ldx] += 1;

            return digits;
            

        }
        else
        {
            digits[ldx] = ilast;
            return digits;
        }
    }
}