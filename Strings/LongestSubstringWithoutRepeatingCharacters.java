/*
LeetCode 3 - Longest Substring Without Repeating Characters

Question:
Given a string s, find the length of the longest
substring without repeating characters.
*/

import java.util.Scanner;
class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        String em="";
        int count=0;
        int prev=0;
        int f=-1,l=-1,ns=0;
        for(int i=ns;i<s.length();i++){
            char ch = s.charAt(i);
            if(!(em.contains(ch+""))){
               count++;
               em+=ch;
            }else{
                
                count=0;
                ns=ns+em.indexOf(ch)+1;
                i=ns-1;
                em="";

            }
            
            if(count>prev)
            {
                prev=count;
                f=ns;
                l=i;
            }
    
            
            
        }
       return prev;
        
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(lengthOfLongestSubstring(s));

    }
}