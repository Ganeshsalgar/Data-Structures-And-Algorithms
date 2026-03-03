class Solution {
    public long countBadPairs(int[] nums) {
        long n = nums.length;
        long total = n * (n - 1) / 2;
        
        Map<Long, Long> map = new HashMap<>();
        long good = 0;
        
        for (int i = 0; i < nums.length; i++) {
            long key = (long) nums[i] - i;
            good += map.getOrDefault(key, 0L);
            map.put(key, map.getOrDefault(key, 0L) + 1);
        }
        
        return total - good;

    }
}