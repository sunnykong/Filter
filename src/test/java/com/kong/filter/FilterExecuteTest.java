package com.kong.filter;

import org.junit.Test;

public class FilterExecuteTest extends webTest {
	
	@Test
	public void TestFilter() {
		String filterStr = "你好，kdjfkdjfkdjfkdjKOOJHUILJHIL<K>HKL<JHIUL:<MJI:L<><>:JJdhhgffrynb";
		FilterExecute execute = new FilterExecute();
		execute.doFilter(filterStr);
		System.out.println("过滤后的字符为："+filterStr);
	}

	
}
