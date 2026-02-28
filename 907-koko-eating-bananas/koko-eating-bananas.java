class Solution {
    public boolean valid(int[] nums, long mid, int h){
        long sum = 0;
        for(int ele : nums){
            long ans = ele / mid;
            if(ele % mid != 0){
                sum += ans + 1;
            }
            else{
                sum += ans;
            }
        }
        return (sum <= h);
    }
    public int minEatingSpeed(int[] piles, int h) {
        long low = 1;
        long high = 0;
        for(int ele : piles){
            high = Math.max(ele , high);
        }
        long ans = -1;
        while(low <= high){
            long mid = low + (high -low)/2;
            if(valid(piles , mid , h)){
                ans = mid;
                high = mid -1;
            }
            else{
                low = mid +1;
            }
        }
        return (int)ans;
    }
}