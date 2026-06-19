/*
LeetCode 26 - Remove Duplicates from Sorted Array

Question:
Given an integer array nums sorted in non-decreasing order,
remove the duplicates in-place such that each unique element
appears only once. Return the number of unique elements.
*/
class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int i=0;
        if(nums.length==0){
            return 0;
        }
       
             for(int j=i+1;j<nums.length;j++){
                 if(nums[j]!=nums[i]){ 
                   i++;
                    nums[i]=nums[j]; 
                    
                 }

             }

        return i+1;

    }
}