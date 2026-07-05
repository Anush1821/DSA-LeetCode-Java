// 258. Add Digits
// Solved
// Easy
// Topics
// premium lock icon
// Companies
// Hint
// Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.


class  AddDigits {
    public static int addDigits(int num) {
        int res =0;
        while(num>0){
            int r=num%10;
            res+=r;
            num/=10;
        }
        if(res>9){
          return  addDigits(res);
        }

      return res;  
    }
   
}