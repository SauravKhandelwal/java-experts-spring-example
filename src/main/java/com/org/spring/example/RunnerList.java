/**
 * 
 */
package com.org.spring.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author Saurav_Khandelwal
 *
 */
public class RunnerList {

	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/applicationContext.xml");

		Question obj = (Question) context.getBean("e");

		obj.displayInfo();

	}
}
