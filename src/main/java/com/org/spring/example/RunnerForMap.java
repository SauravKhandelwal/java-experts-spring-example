/**
 * 
 */
package com.org.spring.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Saurav_Khandelwal
 *
 */
public class RunnerForMap {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		QuestionForMap obj = (QuestionForMap) context.getBean("e");

		obj.displayInfo();
	}
}
