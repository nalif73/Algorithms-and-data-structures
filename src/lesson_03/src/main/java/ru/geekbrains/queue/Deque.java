package ru.geekbrains.queue;

public interface  Deque<E> extends Queue<E> {

    boolean insertL(E value);

    E removeR();

    boolean insertR(E value);

    E removeL();


}
