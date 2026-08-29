class Solution {
    public int majorityElement(int[] nums) {
      int freq=nums[0];
      int count=1;

      for(int i=1;i<nums.length;i++){

        if (nums[i]==freq){
            count++;
        }
        else{
            count--;
        }
        if(count==0){
            freq = nums[i];
                count = 1;
        }
      }
      return freq;

    }
}