class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> mapping = new HashMap<>();
        int el = nums[0];
        for (int i = 0; i < nums.length; i++)
        {
            if (mapping.containsKey(nums[i]))
            {
                mapping.put(nums[i], mapping.get(nums[i]) + 1);
                int a = Math.max(mapping.get(el), mapping.get(nums[i]));
                if (a == mapping.get(nums[i]))
                {
                    el = nums[i];
                }
            }
            else
            {
                mapping.put(nums[i], 1);
            }
        }

        return el;
    }
}
