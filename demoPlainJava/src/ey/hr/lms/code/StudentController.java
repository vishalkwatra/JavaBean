package ey.hr.lms.code;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class StudentController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Student studentObj = new Student();
		
		Resource resource = new ClassPathResource("Beans.xml");
		
		BeanFactory beanFctObj = new XmlBeanFactory(resource);
		
		Student studentObj = (Student) beanFctObj.getBean("idStudent");
		
		System.out.println(studentObj.giveFullName());
	}

}
