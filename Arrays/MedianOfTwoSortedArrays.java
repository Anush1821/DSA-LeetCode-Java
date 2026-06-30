// 4. Median of Two Sorted Arrays
// Solved
// Hard
// Topics
// premium lock icon
// Companies
// Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.



import java.util.Scanner;
class MedianOfTwoSortedArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int merged[]= new int[nums1.length+nums2.length];
        for(int i=0;i<nums1.length;i++){
              merged[i]=nums1[i];
        }
        for(int i=nums1.length, j=0;j< nums2.length;i++){
            merged[i]=nums2[j++];
        }
        for(int i=0;i<merged.length;i++){
            for(int j=i+1;j<merged.length;j++){
                if(merged[i]>merged[j]){
                    int temp = merged[i];
                    merged[i]=merged[j];
                    merged[j]=temp;
                }
            }
        }
        
       
        if(merged.length%2==0){
            int mid=merged.length/2;
            double total=merged[mid]+merged[mid-1];
            double res=total/2;
            return res;
        }else{
             int mid=merged.length/2;
             return merged[mid];
        }
       
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int nums1[]= new int[n];
       
        for(int i=0;i<n;i++){
            nums1[i]=sc.nextInt();
        }
        
        int m = sc.nextInt();
        int nums2[]= new int[m];
        
        for(int i=0;i<m;i++){
            nums2[i]=sc.nextInt();
        }
        
        
        
        System.out.println(findMedianSortedArrays(nums1,nums2));

    }
}