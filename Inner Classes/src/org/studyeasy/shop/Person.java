package org.studyeasy.shop;

public class Person {
	String breathe;
	Student student;
	

	public Person() {
		breathe = "I am breathing";
		new Student();
	}
	
	public Student getStudent() {
		return student;
	}
	
	public void theMethod() {
		System.out.println("The student is taking: " + getStudent().getClasss() + "and is " + getStudent().getAge() + " years old!!");
	}
	
	
	
	public class Student {
		int age;
		String classs;
		
		public Student() {
			age = 9;
			classs = "Biology";
		}
		
		public void setAge(int age) {
			this.age = age;
		}
		
		public void setClass(String classs) {
			this.classs = classs;
		}

		public int getAge() {
			return age;
		}

		public String getClasss() {
			return classs;
		}
		
		
	
	}
}
