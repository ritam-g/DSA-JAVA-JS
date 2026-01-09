package stackqueue;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class InBuilt {
    public static void main(String[] args) {
    //     Stack<Integer> stack=new Stack<>();
    //     stack.push(10);
    //     stack.push(20);
    //     stack.push(30);
    //     stack.push(40);
    //     stack.push(50);
    //     stack.push(60);
    //     stack.push(70);
    //    System.out.println(stack.pop());
    //    System.out.println(stack.pop());
    //    System.out.println(stack.pop());
    //    System.out.println(stack.pop());
    //    System.out.println(stack.pop());
    //    System.out.println(stack.pop());
    //    System.out.println(stack.pop());

    /**========================================================================
     *!                           QUEUE
     *========================================================================**/
    // Queue<Integer> queue=new LinkedList<>();
    // queue.add(1);
    // queue.add(12);
    // queue.add(13);
    // queue.add(14);
    // queue.add(15);
    // queue.add(16);
    // queue.add(17);
    // System.out.println(queue.remove());
    // System.out.println(queue.remove());
    // System.out.println(queue.remove());
    // System.out.println(queue.remove());
    // System.out.println(queue.remove());
    /**=======================
     * !      deque
     *  
     *  
     *========================**/
    Deque<Integer> deque=new ArrayDeque();
    deque.add(10);
    deque.addFirst(12);
    deque.addLast(13);
    deque.addFirst(14);
    System.out.println(deque.remove());

    }
}