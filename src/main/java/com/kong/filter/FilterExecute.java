package com.kong.filter;

import java.util.List;

public class FilterExecute {

	// FilterChina filterChina;

	FilterBuilder filterBuilder;

	
	public FilterExecute() {
		if(null == this.filterBuilder) {
			this.filterBuilder = new FilterBuilder();
		}
	}


	public FilterExecute(FilterBuilder filterBuilder) {
		this();
	}


	public String doFilter(String str) {
		List<Filter> filters = filterBuilder.getFilterChina().getFilters();
		for (Filter filter : filters) {
			if (null != filter) {
				str = filter.doFilter(str);
				System.out.println("filter后的字符串" + str);
			}
		}
		return str;
	}

}
