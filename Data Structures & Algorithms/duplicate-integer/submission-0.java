class Solution {
    public boolean hasDuplicate(int[] nums) {

        if (nums.length == 0 || nums.length == 1) return false;

        Set<Integer> seen = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (!seen.add(nums[i])) return true;
        }

        return false;
    }
}