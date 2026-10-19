class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int min=nums[0];
        int max=nums[0];

        for(int i=0;i<nums.length;i++){

            if(nums[i]<min){
                min = nums[i];
            }
            else if(nums[i]>max){

                max= nums[i];
            }
        }
        
        int diff = max - min;
        int reduce = 2 * k;
        int ans = diff - reduce;

        return Math.max(0, ans);
    }
}