package org.PA.SpringBeanLifeCycle;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class CustomBeanPostProcessor implements BeanPostProcessor{
	
	 public Object postProcessBeforeInitialization(Object bean, String beanName) 
		      throws BeansException {
		      
		      if(bean instanceof Author)
		      {
		    	  Author a= (Author) bean;
		    	  a.setName("Chandraveer");
		      }
		      return bean;  
		   }
		   public Object postProcessAfterInitialization(Object bean, String beanName) 
		      throws BeansException {
		      
		      return bean;  
		   }
	
}
