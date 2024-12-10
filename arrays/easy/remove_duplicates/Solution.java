class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 0;
        int currentNumber = nums[index];
        index = 1;
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] != currentNumber)
            {
                nums[index++] = nums[i];
                currentNumber = nums[i];
                // index += 1;
            }
            
        }
        return index;
    }
}
