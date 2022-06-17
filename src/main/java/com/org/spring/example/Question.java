/**
 * 
 */
package com.org.spring.example;

import java.util.Iterator;
import java.util.List;

/**
 * @author Saurav_Khandelwal
 *
 */
public class Question {
	
	private int id;
	private String name;
	private List<String> answers;

	public Question() {
	}

	public Question(int id, String name, List<String> answers) {
		super();
		this.id = id;
		this.name = name;
		this.answers = answers;
	}

	public void displayInfo() {
		System.out.println("id:"+id + " " +"name:"+ name);
		System.out.println("answers are:");
		Iterator<String> itr = answers.iterator();
		while (itr.hasNext()) {
			System.out.println("Answer:"+itr.next());
		}
		
	}

}