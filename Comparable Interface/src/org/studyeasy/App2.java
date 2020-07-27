package org.studyeasy;

class Data <T extends Comparable> implements Comparable<T> {
	private T myVariable;

	public Data(T myVariable) {
		this.myVariable = myVariable;
	}

	public T getMyVariable() {
		return myVariable;
	}

	@Override
	public String toString() {
		return "Data [myVariable=" + myVariable + "]";
	}

	@Override
	public int compareTo(T o) {
		
		return getMyVariable().compareTo(o);
		//return o.compareTo(getMyVariable()); //reverse the ordering
	}
	
}

public class App2 {

	public static void main(String[] args) {
		Data<Integer> data = new Data<Integer>(1); //part 1 comparison
		System.out.println(data.compareTo(1212)); //part 2 comparison

	}

}
