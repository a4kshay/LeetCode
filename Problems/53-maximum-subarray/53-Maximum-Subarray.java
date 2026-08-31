class Solution {
    public int maxSubArray(int[] nums) {
        //to find the maximum sum possible
        int max=nums[0];

        //to store the maximum found at a position
        int curr_max=nums[0];

        for(int i=1;i<nums.length;i++){
            
            //equivalent to step 3
            curr_max=Math.max(nums[i],nums[i]+curr_max);

            //equivalent to step 4

            max=Math.max(curr_max,max);
        }
        return max;
    }
}