// 217. Contains Duplicate
// Solved
// Easy
// Topics
// premium lock icon
// Companies
// Given an integer array nums, return true
//  if any value appears at least twice in the array, and 
// return false if every element is distinct.

class Solution {
    public boolean containsDuplicate(int[] nums) {
        
       HashSet<Integer> ele = new HashSet<>();
       for(int n :nums){
        ele.add(n);
       }

       return nums.length>ele.size(); 
    }
}