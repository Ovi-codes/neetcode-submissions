class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int longestSeq = 0;

        for (int num : numSet) {
            // Only start counting at the beginning of a sequence
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int seqLength = 1;

                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    seqLength++;
                }

                longestSeq = Math.max(longestSeq, seqLength);
            }
        }

        return longestSeq;
    }
}