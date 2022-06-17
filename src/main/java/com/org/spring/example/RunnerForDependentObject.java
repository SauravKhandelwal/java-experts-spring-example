/**
 * 
 */
package com.org.spring.example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * @author Saurav_Khandelwal
 *
 */
public class RunnerForDependentObject {
	
	public static void main(String[] args) {
		Resource r=new ClassPathResource("applicationContext.xml");  
	     BeanFactory factory=new XmlBeanFactory(r);  
	       
	     Employee1 s=(Employee1)factory.getBean("e");  
	     s.show();	
	}
	 
}
