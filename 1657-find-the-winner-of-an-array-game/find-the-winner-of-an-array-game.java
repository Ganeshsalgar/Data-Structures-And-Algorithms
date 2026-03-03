class Solution {
    public int getWinner(int[] arr, int k) {
         int current = arr[0];
        int win = 0;
        
        for (int i = 1; i < arr.length; i++) {
            if (current > arr[i]) {
                win++;
            } else {
                current = arr[i];
                win = 1;
            }
            
            if (win == k) return current;
        }
        
        return current;
    
    }
}