// Given a string s consisting of words and spaces, return the length of the last word in the string.

// A word is a maximal substring consisting of non-space characters only.

//lead code 58 

class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String k = s.trim();
        String [] res= k.split(" ");
        int length=0;
        for(String word:res){
            length= word.length();
        }
      return length;   
    }
   
}