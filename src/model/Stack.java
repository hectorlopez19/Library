package model;

public class Stack<T> {
    private Node<T> head;
    private int length;

    public Stack() {
        this.head = null;
        this.length = 0;
    }

    public int length() {
        return length;
    }

    public Node<T> getElement(int index) {
        Node<T> actual = head;
        for(int i = 0; i < index; i++) {
            actual = actual.getNext();
        }
        return actual;
    }

    public T valueOf(int index) {
        if(index >= 0 && index < length) {
            Node<T> target = getElement(index);
            return target.getValue();
        }
        else {
            return null;
        }
    }

    public int search(T target) {
        Node<T> actual = head;
        for(int i = 0; i < length - 1; i++) {
            if(actual.getValue() == target) {
                return i;
            }
            else {
                actual = actual.getNext();
            }
        }
        return -1;
    }

    public void push(T newValue) {
        if(head == null) {
            head = new Node<T>(newValue);
        }
        else {
            Node<T> newNode = new Node<T>(newValue);
            newNode.setNext(head);
            head = newNode;
        }
        length++;
    }

    public T pop() {
        if(head != null) {
            T value = head.getValue();
            head = head.getNext();
            System.gc();
            length--;
            return value;
        }
        return null;
    }



}
