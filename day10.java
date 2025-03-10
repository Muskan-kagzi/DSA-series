problem 1 : https://leetcode.com/problems/rearrange-array-elements-by-sign/description/

class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length,k=0,j=0;
        int s=n/2;
        int []pos=new int[s];
        int []neg=new int[s];
        for(int i=0;i<n;i++){
            if(nums[i]>=0){
                pos[k]=nums[i];
                k++;
            }
            else{
                neg[j]=nums[i];
                j++;
            }
        }
        k=0;
        j=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                nums[i]=pos[k];
                k++;
            }
            else{
                nums[i]=neg[j];
                j++;
            }
        }
        return nums;
    }
}
TC:O(n)
SC:O(1)
Approach:we will make two seperate array for positive and for negative the add one by one to original array

problem 3: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/ 
class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price; 
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice; 
            }
        }
        return maxProfit;
    }
}
TC:-O(n)
SC:-O(1)

