// Q1: https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/

class Solution {
    public int maxDepth(String s) {
        int count=0;
        int max=0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (ch == '(') {
                count++;
                max = Math.max(max, count);
            } else if (ch == ')') {
                count--;
            }
        }
        
        return max;
    }
}
TC-O(n)
SC-O(1)
class Solution {
    public int romanToInt(String s) {
        int n = s.length();
        int ans = 0;
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        ans += romanMap.get(s.charAt(n - 1));
        for (int i = n - 2; i >= 0; i--) {
            if (romanMap.get(s.charAt(i)) < romanMap.get(s.charAt(i + 1))) {
                ans -= romanMap.get(s.charAt(i));
            } else {
                ans += romanMap.get(s.charAt(i));
            }
        }
        return ans;
    }
}
TC-O(n)
SC-O(n)
// Q2: https://leetcode.com/problems/roman-to-integer/ 
