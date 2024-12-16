class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mappings = new HashMap<>();
        int[] ans = new int[2];
        for (int i = 0; i < nums.length; i++)
        {
            int numberInArray = target - nums[i];
            if (mappings.containsKey(numberInArray))
            {
                ans[0] = i;
                ans[1] = mappings.get(numberInArray);
            }
            else
            {
                mappings.put(nums[i], i);
            }
        }

        return ans;
    }
}