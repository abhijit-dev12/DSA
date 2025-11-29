class MyQueue {

    java.util.Stack<Integer> s1;
    java.util.Stack<Integer> s2;

    public MyQueue() {
        s1 = new java.util.Stack<>();
        s2 = new java.util.Stack<>();
    }

    // Push element to queue (back side)
    public void push(int x) {
        s1.push(x);
    }

    // Removes and returns the front element of the queue
    public int pop() {
        // Move elements to s2 only when s2 is empty
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }

    // Get the front element without removing
    public int peek() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.peek();
    }

    // Check if queue is empty
    public boolean empty() {
        return s1.isEmpty() && s2.isEmpty();
    }
}
