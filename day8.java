// problem 1 : https://leetcode.com/problems/move-zeroes/description/
class Solution {
    public void moveZeroes(int[] nums) {
        int count=0,k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count++;
            }
            else{
                nums[k]=nums[i];
                k=k+1;
            }
        }
        while(count!=0){
            nums[k]=0;
            count=count-1;
            k++;
        }
        
    }
}
TC-O(n)
SC-O(1)
approach-we will count number of 0 place at end remaining place will be filled with non zero

// problem 2- https://leetcode.com/problems/rotate-array/description/ 
  class Solution {
    public void rotate(int[] nums, int k) {
       int n=nums.length,j=0,i;
       int []arr=new int[n];
       while(n<k){
        k-=n;
       }
       for(i=n-k;i<n;i++){
        arr[j++]=nums[i];
       } 
       for(i=0;i<n-k;i++){
        arr[j++]=nums[i];
       }
       for(i=0;i<n;i++){
        nums[i]=arr[i];
       }
    }
}
TC-O(n)
SC-O(n)
approach-Rotate array by reducing k with modulus, rearranging using a temporary array, and copying back to the original.

