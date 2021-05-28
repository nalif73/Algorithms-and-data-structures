package ru.geekbrains.queue;

public class DequeImpl<E> extends QueueImpl<E> implements Deque<E>{

    public DequeImpl(int maxSize) {
         super(maxSize);
    }

    @Override
    public boolean insertL(E value) {
        if (isFull()) {
            return false;
        }
        if (head == HEAD_DEFAULT)
            head = data.length;

        data[--head] = value;
        size++;

        return true;
    }

    @Override
    public E removeR() {
        if (isEmpty()) {
            return  null;
        }
        if (tail == TAIL_DEFAULT)
            tail = data.length-1;

        size--;
        return data[tail--];
    }

    @Override
    public boolean insertR(E value) {
        return insert(value);
    }

    @Override
    public E removeL() {
        return remove();
    }
}
