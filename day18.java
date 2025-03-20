// Q1: https://leetcode.com/problems/valid-anagram/description/
class Solution {
    public boolean isAnagram(String s, String t) {
        int len1 = s.length();
        int len2 = t.length();

        if (len1 != len2) {
            return false;
        }
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for (int i = 0; i < len1; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }
}
TC-O(nlogn)
SC-O(n)
// Q2: https://leetcode.com/problems/longest-common-prefix/description/ 
class Solution {
    public String longestCommonPrefix(String[] strs) {
        int len=strs.length;
        if(len==1) return strs[0];
        Arrays.sort(strs);
        String first=strs[0];
        String last=strs[len-1];
        StringBuilder s=new StringBuilder();
        for(int i=0;i<Math.min(first.length(),last.length());i++){
            if(first.charAt(i)==last.charAt(i)){
                s.append(first.charAt(i));
            }
            else{
                return s.toString();
            }
        }
        return s.toString();
    }
}
TC-O(nlogn)
SC-O(1)
