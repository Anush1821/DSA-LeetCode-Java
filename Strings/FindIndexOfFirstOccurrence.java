class FindIndexOfFirstOccurrence {
    public int strStr(String haystack, String needle) {
            if(haystack.length()<needle.length()){
                return -1;
            }

            if(haystack.length()==needle.length()){
                if(needle.equals(haystack)){
                    return 0;
                }
            }

        
              char ch=needle.charAt(0);
              for(int j=0;j<haystack.length();j++){
                char ch2=haystack.charAt(j);
                if(ch==ch2){
                    if(needle.length()==1){
                        return j;
                    }
                    int end = needle.length()+j;
                    if(end<=haystack.length()){
                       String sub = haystack.substring(j,end);
                    if(sub.equals(needle)){
                        return j;
                    }
                    }
                   
                }
              }


       return -1;
        
    }
    
}