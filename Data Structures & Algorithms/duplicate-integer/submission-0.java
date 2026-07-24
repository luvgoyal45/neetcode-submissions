class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> countNums = new HashMap<>();

        for(int i = 0; i<nums.length; i++){
            countNums.put(nums[i], countNums.getOrDefault(nums[i], 0) + 1);
            if(countNums.get(nums[i]) > 1)
            return true;
        }

        return false;
    }
}