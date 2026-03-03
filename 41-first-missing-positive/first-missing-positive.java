class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int i = 0;

        while (i < n) {
            if (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                int temp = nums[i];
                nums[i] = nums[temp - 1];
                nums[temp - 1] = temp;
            } else {
                i++;
            }
        }

        for (int k = 0; k < n; k++) {
            if (nums[k] != k + 1) return k + 1;
        }

        return n + 1;
    }
}