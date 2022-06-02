package com.collectios;

public class ArrayList2<E> {

	E[] e;
	ArrayList2(E[] e){
		this.e = e;
	}
	int index = 0;
	
	public void add(E e) {
		this.e[index++] = e;
	}

	public E get(int index) {
		return  this.e[index];
	}

}
