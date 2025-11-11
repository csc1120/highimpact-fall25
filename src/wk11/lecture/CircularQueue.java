package wk11.lecture;

import wk11.prep.PureQueue;

import java.util.NoSuchElementException;

public class CircularQueue<E> implements PureQueue<E> {
    private int INITIAL_CAPACITY = 5;
    private int capacity;
    private E[] data;
    private int size;
    private int front;
    private int end;

    public CircularQueue(){
        capacity = INITIAL_CAPACITY;
        data = (E[]) new Object[capacity];
        size = 0;
        front = 0;
        end = -1;
    }
    public void reallocate(){
        capacity = capacity * 2;
        E[] temp = (E[]) new Object[capacity];
        int j = 0;
        for(int i =0; i<size; i++) {
            temp[j] = data[(front + i) % size];
            j++;
        }
        data = temp;
        front = 0;
        end = size - 1;
    }
    /**
     * adds item to the end of the queue. Returns true is successful
     *
     * @param item element to add to the end of the queue
     * @return true is successfully added
     */
    @Override
    public boolean offer(E item) {
        if(size >= capacity){
            reallocate();
        }
        end = (end + 1) % capacity;
        data[end] = item;
        size++;
        return true;
    }

    /**
     * removes element from the front of the queue
     * and returns it
     *
     * @return element that was removed
     * @throws NoSuchElementException if empty
     */
    @Override
    public E remove() {
        if(size == 0){
            throw new NoSuchElementException("queue is empty");
        }
        E ret = data[front];
        front = (front + 1) % capacity;
        size--;
        return ret;
    }

    /**
     * returns the element at the front of the queue w/o removing it
     *
     * @return element at the front of the queue
     * @throws NoSuchElementException if empty
     */
    @Override
    public E element() {
        if(size == 0){
            throw new NoSuchElementException("queue is empty");
        }
        E ret = data[front];
        return ret;
    }

    /**
     * removes element from the front of the queue and returns it
     * Returns null if the list is empty
     *
     * @return element from the front of the queue or null if
     * the queue is empty
     */
    @Override
    public E poll() {
        if(size == 0){
            return null;
        }
        E ret = data[front];
        front= (front + 1) % capacity;
        size--;
        return ret;
    }

    /**
     * Return the element at the front of the queue w/o removing it
     * Returns null is the list is empty
     *
     * @return element at the front of the queue or null if the queue
     * is empty
     */
    @Override
    public E peek() {
        if(size == 0){
            return null;
        }
        E ret = data[front];
        return ret;
    }
}
