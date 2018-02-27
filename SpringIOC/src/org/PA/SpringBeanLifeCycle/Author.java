package org.PA.SpringBeanLifeCycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Author implements BeanNameAware, BeanFactoryAware, InitializingBean, DisposableBean {

	private Book book;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	@Override
	public void setBeanName(String arg0) {
		
		System.out.println("The Name of the Bean is::"+arg0);
		
	}

	@Override
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		
		Book b= arg0.getBean(Book.class);
		System.out.println(b.getName());
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		
		System.out.println("All Properties are set and dependencies are also injected, I can to do something");
		
	}

	@Override
	public void destroy() throws Exception {
		
		System.out.println("Author Bean Destroyed");
		
	}
	
	
	
}
