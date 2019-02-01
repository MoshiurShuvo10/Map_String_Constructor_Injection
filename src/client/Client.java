package client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import beans.Question;

class Client {

	public static void main(String[] args) {
		
		Resource resource = new ClassPathResource("injections/config.xml");
		BeanFactory bfactory = new XmlBeanFactory(resource);
		Question q = (Question)bfactory.getBean("ques1");
		q.displayQuestionInfo();

	}

}
