class Solution {
    public int pivotIndex(int[] nums) {
        
       int n = nums.length;
        
        int[] rightsum = new int[n];
        rightsum[n - 1] = 0;
        for (int i = n - 2; i >= 0; i--) {
            rightsum[i] = rightsum[i + 1] + nums[i + 1];
        }

        int[] leftsum = new int[n];
        leftsum[0] = 0;
        for (int i = 1; i < n; i++) {
            leftsum[i] = leftsum[i - 1] + nums[i - 1];
        }

        for (int i = 0; i < n; i++) {
            if (leftsum[i] == rightsum[i]) {
                return i;
            }
        }

        return -1;
    }
}