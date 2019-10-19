package _01_Custom_ArrayList;

import java.util.Arrays;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	T[] a;
	public ArrayList() {
		this.a = (T[]) new Object[0];
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		return a[loc];
	}
	
	public void add(T val) {
	System.out.println("ahsdhgiwauth");
	T[]b = (T[]) new Object[a.length+1];
	for(int i = 0; i < a.length; i++) {
		b[i] = a[i];
		System.out.println(b[i]);
	}
	b[b.length-1] = val;
	a = b;
	}
	
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		
	}
	
	public boolean contains(T val) {
		
		return false;
	}
}