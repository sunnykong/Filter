package com.kong.filter;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:web.xml" })
public class webTest extends AbstractJUnit4SpringContextTests {

//	public <T> T getBean(Class<T> type) {
//		return applicationContext.getBean(type);
//	}
//
//	public Object getBean(String beanName) {
//		return applicationContext.getBean(beanName);
//	}
//
//	protected ApplicationContext getContext() {
//		return applicationContext;
//	}

}
