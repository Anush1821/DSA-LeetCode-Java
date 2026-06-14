/*
Problem: Container With Most Water
LeetCode: #11
Difficulty: Medium
Approach: Two Pointers
Time Complexity: O(n)
Space Complexity: O(1)
*/

import java.util.Scanner;

class Solution {
    public static int maxArea(int[] height) {
       int max = Integer.MIN_VALUE;
        int left=0;
        int right=height.length-1;
        while(left<right){
         
         int Area= (right-left) * Math.min(height[left],height[right]);
         if(Area>max){
            max=Area;
         }

         if(height[left]<height[right]){
            left++;
         }else{
            right--;
         }
         


        }
       
      return max;
    }
    public static void main (String [] args){
       
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();

       int [] height = new int[n];
       for(int i=0;i<height.length;i++){
          height[i]=sc.nextInt();
       }

       System.out.println(maxArea(height));

    }
}