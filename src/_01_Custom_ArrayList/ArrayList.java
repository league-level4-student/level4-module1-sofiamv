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
	T[]b = (T[]) new Object[a.length+1];
	for(int i = 0; i < a.length; i++) {
		b[i] = a[i];
	}
	b[b.length-1] = val;
	a = b;
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		T[] c = (T[]) new Object[a.length+1];
		for(int i = 0; i < loc; i++) {
			c[i] = a[i];
		}
		c[loc] = val;
		for(int j = loc+1; j < a.length+1; j++) {
			c[j] = a[j-1];
		}
		a = c;
	}
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		a[loc] = val;
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		T[] d = (T[]) new Object[a.length-1];
		for(int i = 0; i < loc; i++) {
			d[i] = a[i];
		}
		for(int j = loc+1; j < a.length; j++) {
			d[j-1] = a[j];
		}
		a = d;
		
		System.out.println(Arrays.toString(a));
	}

	public boolean contains(T val) {
		boolean aa = false;
		for(int i = 0; i < a.length; i++) {
		if(a[i] == val) {
			aa = true;
		}
		}
		return aa;
	}
	public int size() {
		return a.length;
	}
}