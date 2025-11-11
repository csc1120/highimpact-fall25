package wk11.prep;

import java.util.NoSuchElementException;

public class NodeStack<E> implements PureStack<E> {

    private static class Node<E>{
        private E data;
        private Node<E> next;
        public Node(E data){
            this.data = data;
            this.next = null;
        }
    }
    private Node<E> head;

    /**
     * Returns true if the stack is empty
     * and false other wiese
     *
     * @return True if the stack is empty, false otherswise
     */
    @Override
    public boolean isEmpty() {
        return head == null;
    }

    /**
     * Returns the object at the top of the stack
     * w/o removing it
     *
     * @return The object at the top of the stack
     * @throws NoSuchElementException if stack is empty
     */
    @Override
    public E peek() {
        if(isEmpty()){
            throw new NoSuchElementException("Stack is empty");
        }
        return head.data;
    }

    /**
     * Returns the object at the top of the stack
     * and removes it
     *
     * @return The object at the top of the stack
     * @throws NoSuchElementException if the stack is empty
     */
    @Override
    public E pop() {
        if(isEmpty()){
            throw new NoSuchElementException("Stack is empty");
        }
        E ret = head.data;
        head = head.next;
        return ret;
    }

    /**
     * Adds an item to the top of the stack
     *
     * @param obj Item to be added to the stack
     * @return The item added to the top of teh stack
     */
    @Override
    public E push(E obj) {
        if(isEmpty()){
            throw new NoSuchElementException("Stack is empty");
        }
        Node<E> newItem = new Node<>(obj);
        newItem.next = head;
        head = newItem;
        return obj;
    }
}
