package com.company;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class MyLinkedList {
	private int size;
	private Node first;
	
	MyLinkedList(){
	
	}
	public MyLinkedList(Double... values){
		this.addAll(values);
	}
	
	public void clear(){
		this.first = null;
		this.size = 0;
	}
	
	public int getSize(){
		return size;
	}
	
	public boolean isEmpty(){
		return this.size == 0;
	}
	
	public void add(Double value){
		if (this.first == null){
			first = new Node(null, value);
		}else{
			Node prevElement = new Node(this.first, value);
			this.first = prevElement;
		}
		this.size++;
	}
	
	public boolean addAll(Double... values){
		boolean result = values != null && values.length > 0;
		if(result){
			for(Double value : values){
				add(value);
			}
		}
		return result;
	}
	
	public void getAll() {
		if (!isEmpty()) {
			for (Node node = this.first; node != null; node = node.next) {
				System.out.print(node.value + " ");
			}
		}
	}
	
	public void flip(MyLinkedList list){
		if (!isEmpty()) {
			Double[] arrDouble = new Double[size];
			int i = 0;
			
			for (Node node = this.first; node != null; node = node.next, i++) {
				arrDouble[i] = node.value;
			}
			
			list.clear();
			list.addAll(arrDouble);
			list.getAll();
		}
	}
}

class Node{
	Node next;
	double value;
	
	Node(Node next, double value){
		this.next = next;
		this.value = value;
	}
}
