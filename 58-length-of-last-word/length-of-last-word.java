class Solution {
    public int lengthOfLastWord(String s) {
        if (s.isBlank())
        {
            return 0;
        }
        int wordLength = 0;
        // find start of word
        int endingIndex = s.length() - 1;
        while (endingIndex >= 0)
        {
            if (s.charAt(endingIndex) != ' ') break;
            endingIndex -= 1;
        }

        while (endingIndex >= 0)
        {
            if (s.charAt(endingIndex) == ' ') break;
            endingIndex -= 1;
            wordLength += 1;
        }

        return wordLength;
    }
}