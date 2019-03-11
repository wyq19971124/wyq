package com.njxzc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration;
import org.springframework.context.annotation.Bean;

import static javafx.scene.input.KeyCode.M;

@SpringBootApplication
@MapperScan("com.njxzc.dao.UserMapper")
public class WyqgymApplication {
	public static void main(String[] args) {
		SpringApplication.run(WyqgymApplication.class, args);
	}


	@Bean
	public static BeanFactoryPostProcessor beanFactoryPostProcessor() {
		return new BeanFactoryPostProcessor() {

			@Override
			public void postProcessBeanFactory(
					ConfigurableListableBeanFactory beanFactory) throws BeansException {
				BeanDefinition bean = beanFactory.getBeanDefinition(
						DispatcherServletAutoConfiguration.DEFAULT_DISPATCHER_SERVLET_REGISTRATION_BEAN_NAME);

				bean.getPropertyValues().add("loadOnStartup", 1);
			}
		};
	}
}
