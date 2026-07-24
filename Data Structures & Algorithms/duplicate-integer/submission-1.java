class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> countNums = new HashSet<>();

        for(int i = 0; i<nums.length; i++){
            if(countNums.contains(nums[i]))
            return true;

            countNums.add(nums[i]);
        }

        return false;
    }
}