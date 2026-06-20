/*
LeetCode 35 - Search Insert Position

Question:
Given a sorted array of distinct integers and a target value,
return the index if the target is found.
If not, return the index where it would be inserted
to keep the array sorted.
*/
class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int f=0;
        int l=0;
        for(int i=0;i<nums.length;i++){
             
             if(nums[i]==target){
                return i;
             }else{
                if(nums[i]<target){
                    f=i+1;
                }
                
             }

        }

         return f;
        
    }
    
}