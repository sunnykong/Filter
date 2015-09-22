package com.kong.iterator;

public class Node<E> {
	private Object next;
	private Node<E> prev;

	public Object getNext() {
		return next;
	}

	public void setNext(Object next) {
		this.next = next;
	}

	public Node<E> getPrev() {
		return prev;
	}

	public void setPrev(Node<E> prev) {
		this.prev = prev;
	}

	public Node(Object next, Node<E> prev) {
		super();
		this.next = next;
		this.prev = prev;
	}

}
