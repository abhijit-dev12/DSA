class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int maxArea=0;

        java.util.Stack<Integer> stack = new java.util.Stack<>();
        for(int i = 0; i <= n; i++) {
            int currentHeight = (i==n) ? 0 : heights[i];

            while(!stack.isEmpty() && currentHeight < heights[stack.peek()]) {
                int topIndex = stack.pop();
                int height = heights[topIndex];
                
                int right = i - 1;
                
                int left = stack.isEmpty() ? 0 : stack.peek() + 1;

                int width = right - left +1 ;
                int area = height * width;

                if(area > maxArea) {
                    maxArea = area;
                }
            }
            stack.push(i);
        }
        return maxArea;
    }
}