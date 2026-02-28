class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n-1;

        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] > nums[n-1]){
                low = mid+1;
            }
            else{
                high = mid -1;
            }
        }
        int min = low;
        if(target >= nums[min] && target <= nums[n-1]){
            low = min;
            high = n-1;
        }
        else{
            low = 0;
            high = min-1;
        }

        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] > target){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return -1;
    }
}