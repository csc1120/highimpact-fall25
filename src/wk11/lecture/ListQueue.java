package wk11.lecture;

import wk11.lecture.PureQueue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

public class ListQueue<E> implements PureQueue<E> {

    private List<E> data;

    public ListQueue(){
//        data = new ArrayList<>();
        data = new LinkedList<>();
    }
    /**
     * adds item to the end of the queue. Returns true is successful
     *
     * @param item element to add to the end of the queue
     * @return true is successfully added
     */
    @Override
    public boolean offer(E item) {
        data.add(item);
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
        if(data.isEmpty()){
            throw new NoSuchElementException("Erro the queue is empty");
        }
        return data.remove(0);
    }

    /**
     * returns the element at the front of the queue w/o removing it
     *
     * @return element at the front of the queue
     * @throws NoSuchElementException if empty
     */
    @Override
    public E element() {
        if(data.isEmpty()){
            throw new NoSuchElementException("Erro the queue is empty");
        }
        return data.get(0);
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
        if(data.isEmpty()){
            return null;
        }
        return data.remove(0);
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
        if(data.isEmpty()){
            return null;
        }
        return data.get(0);

    }
}
