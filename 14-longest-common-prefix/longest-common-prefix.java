class Solution {
    public String longestCommonPrefix(String[] strs) {
        // input: an array of strings

        // process: finding the longest prefix in an array
        // -- prefix means: it must start from the beginning of the word
        // -- each word must start with the prefix

        String ret = "";
        int s = 1;
        boolean canAdd = true;
        for (int i = 0; i < strs[0].length(); i++)
        {
            String substr = strs[0].substring(0, s);
            for (int j = 1; j < strs.length; j++)
            {
                if (substr.length() > strs[j].length()){
                    canAdd = false;
                    break;
                }
                String innerSub = strs[j].substring(0, s);
                if (!innerSub.equals(substr))
                {
                    canAdd = false;
                }
            }
            
            if (canAdd == false)
            {
                break;
            }

            s += 1;
            ret = substr;
        }

        // output: a prefix common to all strings in the array or empty string if no common prefix
        return ret;
    }
}