// 260. Single Number III
// Solved
// Medium
// Topics
// premium lock icon
// Companies
// Given an integer array nums, in which exactly two elements appear only once and all the other elements appear exactly twice. Find the two elements that appear only once. You can return the answer in any order.

// You must write an algorithm that runs in linear runtime complexity and uses only constant extra space.

 class singleNumberIII {
    public int[] singleNumber(int[] nums) {
             
       List<Integer> list= new ArrayList<>();

       for(int i=0;i<nums.length;i++){
        int count=0;
          for(int j=0;j<nums.length;j++){
               if(nums[i]==nums[j]){
                count++;
               }

          }
          if(count==1){
             list.add(nums[i]);
          }
          


       }
       int[] ans = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
        
        
    }
}