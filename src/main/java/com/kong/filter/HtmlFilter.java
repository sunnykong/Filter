package com.kong.filter;

import org.apache.commons.lang3.StringUtils;

public class HtmlFilter implements Filter{

	public String doFilter(String str) {
		if(StringUtils.isNoneBlank(str)) {
			return str.replace("<", "[").replace(">", "]");
		}
		return null;
	}

}
