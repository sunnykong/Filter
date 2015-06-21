package com.kong.filter;

import org.apache.commons.lang3.StringUtils;

public class ToUpperFilter implements Filter{

	public String doFilter(String str) {
		if(StringUtils.isNoneBlank(str)) {
			return str.toLowerCase();
		}
		return null;
	}

}
