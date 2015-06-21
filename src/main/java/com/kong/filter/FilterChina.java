package com.kong.filter;

import java.util.ArrayList;
import java.util.List;

public class FilterChina {
	public  List<Filter> filterChina = new ArrayList<Filter>();
	
	

	public FilterChina() {
		if(null != this.filterChina) {
			this.filterChina = new ArrayList<Filter>();
		}
	}

	public FilterChina(List<Filter> filters) {
		this();
		addFilters(filters);
	}

	public FilterChina addFilter(Filter filter) {
		 filterChina.add(filter);
		 return this;
	}
	
	public FilterChina addFilters(List<Filter> filters) {
		filterChina.addAll(filters);
		return this;
	}
	
	public List<Filter> getFilters() {
		return this.filterChina;
	}

}
