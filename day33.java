// que1 https://www.geeksforgeeks.org/problems/sort-a-stack/1 
class GfG {
    private void sortedInsert(Stack<Integer> stack, int x) {
        if (stack.isEmpty() || x > stack.peek()) {
            stack.push(x);
            return;
        }
        int temp = stack.pop();
        sortedInsert(stack, x);
        stack.push(temp);
    }

    public Stack<Integer> sort(Stack<Integer> s) {
        if (!s.isEmpty()) {
            int x = s.pop();
            sort(s);
            sortedInsert(s, x);
        }
        return s;
    }
}

TC-O(N)
SC-(N)
