package wk11.prep;

public class TestStacksQueues {
    public static void testStack(ListStack<Integer> stack, int numValues){
        System.out.println("Testing stack");
        long startTime = System.nanoTime();

        System.out.printf("Stack is empty %b \n", stack.isEmpty());
        for(int i = 0; i<numValues; i++){
            stack.push(i);
        }
        while(!stack.isEmpty()){
            //System.out.printf("Stack contents %d \n", stack.pop());
            stack.pop();
        }
        System.out.printf("Stack is empty %b \n", stack.isEmpty());
        long totalTime = System.nanoTime() - startTime;
        System.out.printf("Took %E nano seconds to test \n", (double) totalTime);

    }
    public static void testQueue(ListQueue<Integer> queue, int numVales){
        System.out.println("Testing queue");
        long startTime = System.nanoTime();
        System.out.printf("Queue is empty %b \n", queue.peek() == null);
        for(int i = 0; i<numVales; i++){
            queue.offer(i);
        }
        while(queue.peek() != null){
            //System.out.printf("Queue contents %d \n", queue.poll());
            queue.poll();
        }
        System.out.printf("Stack is empty %b \n", queue.peek() == null);
        long totalTime = System.nanoTime() - startTime;
        System.out.printf("Took %E nano seconds to test \n", (double) totalTime);

    }
    public static void main(String[] args) {
//        ListStack<Integer> listStack = new ListStack<>();
//        testStack(listStack, 1_000_000);
        ListQueue<Integer> listQueue = new ListQueue<>();
        testQueue(listQueue, 1_000_000);
    }
}
