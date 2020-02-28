package com.datastructure;

class CustomLL<T> {
    private Node head;

    class Node {
        private T data;
        private Node next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public void CustomLL() {
        head = null;
    }

    public void insert(T data) {
        Node newNode = new Node(data);
        Node temp = head;
        if (head == null) {
            head = newNode;
            return;
        }
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void delete(T data) {
        Node temp = head;
        Node prev = null;
        if (head == null) {
            return;
        }
        while (temp !=null && temp.data != data) {
            prev = temp;
            temp = temp.next;
        }
        if (prev !=null && temp !=null && temp.data == data) {
            prev.next = temp.next;
        }
    }

    public void printCustomLL() {
        Node temp = head;
        while (temp.next != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print(temp.data);
    }

}


public class LinkedListDataStructure {
    public static void main(String[] args) {
        CustomLL<Integer> customLL = new CustomLL<>();
        for (int count = 1; count <= 10; count++) {
            customLL.insert(count);
        }
        System.out.println("Before Remove");
        customLL.printCustomLL();
        customLL.delete(5);
        customLL.delete(55);
        customLL.delete(10);
        System.out.println();
        System.out.println("After Remove");
        customLL.printCustomLL();
    }
}
