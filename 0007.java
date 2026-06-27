/*Problem 7.  Reverse Integer
Difficulty : Medium
Time Complexity : O(log n)
Space Complexity : O(1)


*/



class Solution {
    public int reverse(int x) {
        boolean flag = false;
        if(x>=0){
           flag = true; 
        }
        long rev = 0 ;
        long temp = Math.abs((long)x);
        while(temp>0){
            long lastDigit = temp%10;
            rev = rev*10 + lastDigit;
            temp = temp/10;
        }
        
        if(!flag){
            rev = -rev;
        }
        
        if(-2147483648>rev || rev>2147483647){
            return 0;
        }
        else{
            return (int)rev;
        }




    }
}
