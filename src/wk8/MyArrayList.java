package wk8;

public class MyArrayList<E> {
    private static final int INITIAL_CAPACITY = 3;
    private E[] data;
    private int size;
    private int capacity;

    MyArrayList(){
        capacity = INITIAL_CAPACITY;
        data = (E[]) new Object[capacity];
        size = 0;
    }

    //size()
    public int size(){
        return size;
    }
    //double the capacity of the array
    private void reallocate(){
        //double the capacity
        capacity = 2 * capacity;
        //make new array
        E[] temp = (E[]) new Object[capacity];
        //set values from data to temp
        for(int i = 0; i<data.length; i++){
            temp[i] = data[i];
        }
        //have data reference temp
        data = temp;
    }
    //add() to the back
    public boolean add(E e){
        if(size >= capacity){
            reallocate();
        }
        data[size] = e;
        size++;
        return true;
    }
    //get(int)
    public E get(int index)
            throws IndexOutOfBoundsException {
        if(index < 0 || index >= size()){
            throw new IndexOutOfBoundsException("Index ("+
                    index+") out of bounds for size "+size);
        }
        return data[index];
    }
    //remove(int)
    public E remove(int index){
        E value = get(index);
        for(int i = index; i<size() - 1; i++){
            data[i] = data[i + 1];
        }
        size--;
        return value;
    }
    //add(int,e) at any location
    public void add(E e, int index){
        if(index > size || index < 0){
            throw new IndexOutOfBoundsException("Index ("+
                    index+") out of bounds for size "+size);
        }
        //adding to the back
        if(index == size) {
            if (size >= capacity) {
                reallocate();
            }
            data[size] = e;
            size++;
        } else {
            //adding anywhere else
            for(int i = size() - 1; i > index; i--){
                data[i] = data[i - 1];
            }
            data[index] = e;
            size++;

        }



    }
    //set(int, e)
    //indexOf(object)

}
