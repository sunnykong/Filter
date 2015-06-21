package com.kong.webFilter;


public interface Filter {
	void doFilter(Request request,Response response,FilterChian filterChian);
}
