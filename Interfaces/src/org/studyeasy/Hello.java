package org.studyeasy;

import org.studyeasy.phone.IPhone8;
import org.studyeasy.phone.OnePlus5;
import org.studyeasy.phone.Phone;

public class Hello {

	public static void main(String[] args) {
		Phone phone = new IPhone8();
		System.out.println("Processor: " + phone.processor());
		
		Phone phone2 = new OnePlus5();
		System.out.println(phone2.spaceInGB());

	}

}
