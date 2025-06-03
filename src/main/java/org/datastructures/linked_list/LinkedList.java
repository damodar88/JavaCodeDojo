package org.datastructures.linked_list;

public class LinkedList<T> {
    private  Node<T> head;


    //Add to the end of the list
    public void add(T data){
        Node<T> newNode = new Node<>(data);

        if (head == null){
            head = newNode;
            return;
        }

        Node<T> current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    //Delete element
    public void remove(T data){
        if (head == null) return;

        if (head.data.equals(data)) {
            head = head.next;
            return;
        }

        Node<T> current = head;
        while (current.next != null){
            if (current.next.data.equals(data)){
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    //Show all items
    public void printList(){
        Node<T> current = head;
        while (current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    //Check if contains an element
    public boolean contains(T data){
        Node<T> current = head;
        while (current != null){
            if (current.data.equals(data)) return true;
            current = current.next;
        }
        return false;
    }

    //List size
    public int size(){
        int count = 0;
        Node<T> current = head;
        while (current != null){
            count++;
            current = current.next;
        }
        return count;
    }
}
