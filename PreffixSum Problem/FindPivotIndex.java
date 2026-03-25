class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;

        // Step 1: total sum nikaalo
        for (int num : nums) {
            totalSum += num;
        }

        int left = 0;

        // Step 2: check pivot
        for (int i = 0; i < nums.length; i++) {
            int right = totalSum - left - nums[i];

            if (left == right) {
                return i;
            }

            left += nums[i];
        }

        return -1;
    }
}