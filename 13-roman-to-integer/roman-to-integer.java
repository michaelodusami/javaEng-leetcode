class Solution {
    public int romanToInt(String s) {
        
        s = s.replaceAll("IV", "IIII");
        s = s.replaceAll("IX", "IIIIIIIII");
        s = s.replaceAll("XL", "XXXX");
        s = s.replaceAll("XC", "LXXXX");
        s = s.replaceAll("CD", "CCCC");
        s = s.replaceAll("CM", "DCCCC");
        System.out.println(s);
        int sum = 0;
        for (int i = 0; i < s.length(); i++)
        {
            char num = s.charAt(i);
            switch (num)
            {
                case 'I' -> sum += 1;
                case 'V' -> sum += 5;
                case 'X' -> sum += 10;
                case 'L' -> sum += 50;
                case 'C' -> sum += 100;
                case 'D' -> sum += 500;
                case 'M' -> sum += 1000;
                default -> sum += 0;
            }

        }
        return sum;
    }
}