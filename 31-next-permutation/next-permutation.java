class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int pivot = -1;

        int i = n-2;
        while(i >= 0 && nums[i] >= nums[i+1]){
            i--;
        }

        if(i == -1){
            reverse(nums , 0 , n-1);
            return;
        }

        int j = n-1;
        while(j >= 0 && nums[j] <= nums[i]){
            j--;
        }

        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

        reverse(nums , i+1 , n-1);
    }

    void reverse(int[] nums, int st , int ed){
        while(st < ed){
            int temp = nums[st];
            nums[st++] = nums[ed];
            nums[ed--] = temp; 
        }
    }
}