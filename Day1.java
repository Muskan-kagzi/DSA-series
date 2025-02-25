problem of the day:-ugly number(leetcode)
https://leetcode.com/problems/ugly-number/description/?envType=problem-list-v2&envId=math

class Solution {
    public boolean isUgly(int n) {
        if(n<=0){
            return false;
        }
        int[]values={2,3,5};
        for(int value :values){
            while(n%value==0){
                n=n/value;
            }
        }
        return n==1;
    }
}
