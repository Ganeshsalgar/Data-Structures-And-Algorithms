class Solution {
    public boolean valid(int[] nums, int mid , int days){
        int sum = 0;
        int count = 1;
        for(int ele : nums){
            if(sum + ele <= mid){
                sum += ele;
            }
            else{
                sum = ele;
                count++;
            }
        }
        return (count <= days);
    }
    public int shipWithinDays(int[] weights, int days) {
        int low = Integer.MIN_VALUE;
        int high = 0;
        for(int ele : weights){
            low = Math.max(ele , low);
            high += ele;
        }
        int ans = -1;

        while(low <= high){
            int mid = low + (high -low)/2;
            if(valid(weights, mid , days)){
                ans = mid;
                high = mid -1;
            }
            else{
                low = mid +1;
            }
        }
        return ans;
    }
}