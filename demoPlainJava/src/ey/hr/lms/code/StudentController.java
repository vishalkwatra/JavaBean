package ey.hr.lms.code;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class StudentController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Student studentObj = new Student();
		
//		Method 1 BeanFactory
//		Resource resource = new ClassPathResource("Beans.xml");
//		
//		BeanFactory beanFctObj = new XmlBeanFactory(resource);
//		
//		Student studentObj = (Student) beanFctObj.getBean("idStudent");
		
		// Method 2 Application Context
		ApplicationContext appCtx = new ClassPathXmlApplicationContext("Beans.xml");
		Student studentObj= (Student) appCtx.getBean("idStudent");
		
		System.out.println(studentObj.giveFullName());
	}

}
