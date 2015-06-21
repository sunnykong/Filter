package com.kong.filter;

import org.junit.Test;

import com.kong.webFilter.FilterChian;
import com.kong.webFilter.HtmlFilter;
import com.kong.webFilter.Request;
import com.kong.webFilter.Response;
import com.kong.webFilter.ToLowerFilter;

public class FilterExecuteTest extends webTest {
	
	@Test
	public void TestFilter() {
		String filterStr = "你好，kdjfkdjfkdjfkdjKOOJHUILJHIL<K>HKL<JHIUL:<MJI:L<><>:JJdhhgffrynb";
		FilterExecute execute = new FilterExecute();
		execute.doFilter(filterStr);
		System.out.println("过滤后的字符为："+filterStr);
	}
	
	@Test
	public void webFilterTest() {
		String msg = "大家好:)，<script>，敏感，被就业，网络授课没感觉，因为看不见大家伙儿";
		Request request = new Request();
		request.setResquestStr(msg);
		Response response = new Response();
		response.setResponseStr("response");
		FilterChian fc = new FilterChian();
		fc.addFilter(new ToLowerFilter()).addFilter(new HtmlFilter());
		
		fc.doFilter(request, response, fc);
		System.out.println(request.getResquestStr());
		System.out.println(response.getResponseStr());
	}

	
}
