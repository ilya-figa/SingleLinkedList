package com.company;

public class Main {

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        System.out.println(list.isEmpty());
        list.addAll(2.0,4.0,6.0,77.0,123.0,14342.0,12313.0,31.0);
        list.getAll();
        System.out.println();
        list.flip(list);
    }
}
