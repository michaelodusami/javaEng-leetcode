class Solution {
    public String longestCommonPrefix(String[] strs) {
        // input: an array of strings

        // process: finding the longest prefix in an array
        // -- prefix means: it must start from the beginning of the word
        // -- each word must start with the prefix

        Arrays.sort(strs);
        int index = 0;
        String s = strs[index];
        String e = strs[strs.length - 1];

        while (index < s.length() && index < e.length())
        {
            char sc = s.charAt(index);
            char ec = e.charAt(index);
            if (sc == ec)
            {
                index += 1;
            }
            else
            {
                break;
            }
        }

        // output: a prefix common to all strings in the array or empty string if no common prefix
        return s.substring(0, index);
    }
}