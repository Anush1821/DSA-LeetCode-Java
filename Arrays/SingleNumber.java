// Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

// You must implement a solution with a linear runtime complexity and use only constant extra space.


class SingleNumber {
    public int singleNumber(int[] nums) {
       int count=0;
       int output=0;
       for(int i=0;i<nums.length;i++){
          for(int j=0;j<nums.length;j++){
               if(nums[i]==nums[j]){
                count++;
               }

          }
          if(count==1){
             output=nums[i];
          }
          count=0;


       }
       return output;
    }
}