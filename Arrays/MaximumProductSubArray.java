// 152. Maximum Product Subarray
// Solved
// Medium
// Topics
// premium lock icon
// Companies
// Given an integer array nums, find a subarray that has the largest product, and return the product.

// The test cases are generated so that the answer will fit in a 32-bit integer.

// Note that the product of an array with a single element is the value of that element.

class maximumProductSubArray {
    public int maxProduct(int[] nums) {
       int max =nums[0];
       if(nums.length==1){
        return nums[0];
       }
        for(int i=0;i<nums.length;i++){
            int  product=1;
            for(int j=i;j<nums.length;j++){
                product*=nums[j];
                max = Math.max(max, product);
            }
            
        }
      return max;
        
    }
}