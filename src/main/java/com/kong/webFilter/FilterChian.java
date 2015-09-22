package com.kong.webFilter;

import java.util.ArrayList;
import java.util.List;


public class FilterChian implements Filter{
	List<Filter> filters = new ArrayList<Filter>();
	int index = 0;
	
	public FilterChian addFilter(Filter filter) {
		filters.add(filter);
		return this;
		
	}
	
	public void doFilter(Request request,Response response,FilterChian filterChian) {
		if(filters.size() == index) return;
		Filter f = filters.get(index++);
//		index ++;
		f.doFilter(request, response, filterChian);
	}
}
