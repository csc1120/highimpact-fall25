package wk9;

import javafx.scene.layout.Pane;

public class MyLinkedList <E> {

    public class Node<E>{
        private E element;
        private Node<E> next;
        private Node(E element){
            this.element = element;
            this.next = null;
        }
        private Node(E element, Node<E> next){
            this.element = element;
            this.next = next;
        }
    }
    private Node<E> head;
    private int size;
    public MyLinkedList(){
        size = 0;
    }

    //size()
    public int size(){
        return size;
    }

    private Node<E> getNode(int index){
        Node<E> walker = head;
        int count = 0;
        while(walker.next != null && count < index){
            walker = walker.next;
            count += 1;
        }
        return walker;
    }

    //get(int) -> E
    public E get(int index){
        if(index < 0 || index >= size()){
            throw new IndexOutOfBoundsException("Error invalid index "+index);
        }
        return getNode(index).element;
    }

    //add() -> True
    public boolean add(E element){
        if(head == null){
            //if empty?
            head = new Node(element);
            size += 1;
        } else {
            //grab last node
            Node<E> last = getNode(size() - 1);
            last.next = new Node(element);
            size += 1;
        }
        return true;
    }
    public E remove(int index){
        E ret;
        if(index == 0){
            ret = head.element;
            head = head.next;
            size -= 1;
        } else {
            Node<E> prev = getNode(index - 1);
            Node<E> curr = getNode(index);
            Node<E> next = getNode(index + 1);
            prev.next = next;
            size -= 1;
            ret = curr.element;
        }
        return ret;
    }

}
