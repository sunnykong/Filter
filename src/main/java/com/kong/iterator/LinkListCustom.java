package com.kong.iterator;

public class LinkListCustom<E> implements CollectionCustom<E>{
	private int size;
	private Node head;
	private Node tail;
	public int size() {
		return size;
	}

	public void add(Object node) {
		Node<E> newNode = new Node<E>(node, null);
		if(head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.setNext(newNode);
			tail = newNode;
		}
		size++;
	}
	

}
