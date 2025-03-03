// problem of the day:-ugly number(leetcode)
// https://leetcode.com/problems/ugly-number/description/?envType=problem-list-v2&envId=math

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

// approach :- we will repeatedly divide n with 2,3,5 until it becomes one 
// Time complexity o(logn)

// problem of the day:-reverse bit
class Solution {
    static Long reversedBits(Long x) {
           double i=31,a,ans=0;
        while(x>0){
            a=x%2;
            ans=ans+Math.pow(2,i)*a;
            i--;
            x=x/2;
        }
        
        return (long)ans;
    }
};
T.C:O(logn) 
S.C:O(1) 

