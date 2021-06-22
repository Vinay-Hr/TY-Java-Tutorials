package com.te.collection;

import java.util.Arrays;
import java.util.Iterator;

public class MyArray implements Iterable {
	
	private Object[] array;
	private int arraySize;
	private int position;
	
	public MyArray(int arraySize) {
		array = new Object[arraySize];
	}
	
	public void add(Object e) {
		
		if(position >= array.length) {
			increasecapacity();
		}
		array[position] = e;
		position++;
	}
	
	public Object get(int index) {
		return array[index];
	}
	
	public int size() {
		return position;
	}
	
	private void increasecapacity() {
		
		Object [] temp = new Object[array.length+5];
		System.arraycopy(array, 0, temp, 0, array.length-1);
		array=temp;
	}
	
	public void remove(int index) {
		if(array.length>0 && index>=0 && index<array.length-1) {
			for (int i=index; i<array.length-1; i++) {
				array[i]=array[i+1];
			}
		Object [] temp = new Object[array.length-1];
		System.arraycopy(array, 0, temp, 0, array.length-1);
		array=temp;
		}
	}
	
	@Override
	public String toString() {
		
		return "MyArray [array=" + Arrays.toString(array) + ", arraySize=" + arraySize + ", position=" + position + "]";
	}

	@Override
	public Iterator iterator() {
		
		return new MyItr();
	}
	
	private class MyItr implements Iterator{
		int index;

		@Override
		public boolean hasNext() {
			return (index < position) ? true:false;
		}

		@Override
		public Object next() {
			Object object = array[index];
			index++;
			return object;
		}
	
		
	}
}

//public void delete(int i) {
//	array[i]=null;
//	for (int j=i;j<array.length-1;j++) {
//		array[j]=array[j+1];
//	}
//}
