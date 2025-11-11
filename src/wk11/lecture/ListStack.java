package wk11.lecture;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

public class ListStack<E> implements PureStack<E> {

    private List<E> data;
    public ListStack(){
        //data = new ArrayList<>();
        data = new LinkedList<>();
    }
    /**
     * Returns true if the stack is empty
     * and false other wiese
     *
     * @return True if the stack is empty, false otherswise
     */
    @Override
    public boolean isEmpty() {
        return data.isEmpty();
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
            throw new NoSuchElementException();
        }
        return data.get(0);
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
            throw new NoSuchElementException();
        }
        return data.remove(0);
    }

    /**
     * Adds an item to the top of the stack
     *
     * @param obj Item to be added to the stack
     * @return The item added to the top of teh stack
     */
    @Override
    public E push(E obj) {
        data.add(0, obj);
        return obj;
    }
}
