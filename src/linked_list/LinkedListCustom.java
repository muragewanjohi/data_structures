package linked_list;

import java.util.LinkedList;

public class LinkedListCustom {

    private Node first;
    private Node last;

    int first_node,last_node;

    LinkedList <Integer>list = new LinkedList();

    public void addFirst(int item){

        list.addFirst(item);
        first_node = list.getFirst();

    }

    public void addLast(int item){

        list.addLast(item);
        last_node = list.getLast();

    }

    public void searchList(int item){

        list.contains(item);

    }

    public void deleteLast(int item){

        list.indexOf(item);

    }

}
