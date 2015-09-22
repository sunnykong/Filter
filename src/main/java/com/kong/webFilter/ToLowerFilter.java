package com.kong.webFilter;

import org.apache.commons.lang3.StringUtils;

public class ToLowerFilter implements Filter{

	public void doFilter(Request request, Response response,FilterChian filterChian) {
		String requestrStr = request.resquestStr;
		if(StringUtils.isNoneBlank(requestrStr)) {
			request.resquestStr = requestrStr.toLowerCase()+"========toLowerFilter";
		}
		filterChian.doFilter(request, response, filterChian);
		response.responseStr += "---toLowerFilter()";
	}
}
