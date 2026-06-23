// LeetCode 287. Find the Duplicate Number

// Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

// There is only one repeated number in nums. Return this repeated number.


class findDuplicate {
    public int findDuplicate(int[] nums) {
        
       HashSet<Integer> set = new HashSet<Integer>();
        int i=0;
          
          for(int k :nums){
            if(set.contains(k)){
                return k;
            }
            set.add(k);
          }
  return -1;
}
}