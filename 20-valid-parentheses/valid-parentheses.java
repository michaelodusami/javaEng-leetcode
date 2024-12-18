class Solution {
    public boolean isValid(String s) {
        Stack<Character> chars = new Stack<>();

        for (int i = 0; i < s.length(); i++)
        {
            Character current = s.charAt(i);
            if (chars.size() > 0)
            {
                Character c = chars.peek();
                if (current == ')' && c == '(')
                {
                    chars.pop();
                }
                else if (current == ']' && c == '[')
                {
                    chars.pop();
                }
                else if (current == '}' && c == '{')
                {
                    chars.pop();
                }
                else
                {
                    chars.push(current);
                }
            }
            else
            {
                chars.push(current);
            }
                
        }

        return chars.empty();
    }
}