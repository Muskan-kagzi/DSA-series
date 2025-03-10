// problem1:-https://leetcode.com/problems/two-sum/description/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int []arr=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    arr[0]=i;
                    arr[1]=j;
                }
            }
        }
        return arr;
    }
}
TC-O(n)
SC-o(n)
Approach- applying nested loop & check the sum when sum equals to target it will return an array

// problem2:- https://leetcode.com/problems/sort-colors/description/
  class Solution {
    public void sortColors(int[] nums) {
        int zero=0,one=0,two=0,k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zero++;
            }
            else if(nums[i]==1){
                one++;
            }
            else{
                two++;
            }
        }
        for(int i=0;i<zero;i++){
            nums[k]=0;
            k++;
        }
        for(int i=0;i<one;i++){
            nums[k]=1;
            k++;
        }
        for(int i=0;i<two;i++){
            nums[k]=2;
            k++;
        }

    }
}
TC:-O(n)
SC:-O(1)
approach:-count total numbercof zero,one and two &cafter that initialize k=0 then add zero,oneand then two in the given array
//problem-3 : https://www.geeksforgeeks.org/problems/max-sum-in-sub-arrays0824/0 
  class Solution {
    // Function to find pair with maximum sum
    public int pairWithMaxSum(int arr[]) {
        // Your code goes here
        int i=0;
        int j=i+1;
        int sum=0;
        int max=-1;
        while(j<arr.length){
            sum=arr[i++]+arr[j++];
            max=Math.max(sum,max);
        }
        return max;
    }
}
TC:-O(n)
SC-O(1)
