// Question_1 :
// https://leetcode.com/problems/isomorphic-strings/description/

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if (map1.containsKey(c1)) {
                if (map1.get(c1) != c2) return false;
            }
            if (map2.containsKey(c2)) {
                if (map2.get(c2) != c1) return false;
            }
            map1.put(c1, c2);
            map2.put(c2, c1);
        }
        return true;
    }
}
TC-O(n)
SC-O(n)
// Question_2 :
// https://leetcode.com/problems/remove-outermost-parentheses/description/ 
class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st=new Stack<>();
        StringBuilder str=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                if(!st.isEmpty()){
                    str.append('(');
                }
                st.push(ch);               
            }
            else{
                st.pop();
                if(!st.isEmpty()){
                    str.append(')');
                }
            }
        }
        return str.toString();
    }
}
TC-O(n)
SC-O(n)
