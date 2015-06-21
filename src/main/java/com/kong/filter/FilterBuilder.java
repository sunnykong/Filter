package com.kong.filter;



public class FilterBuilder {

	private FilterChina filterChina;

	public FilterBuilder() {
		this.filterChina = new FilterChina();
		initWholeFilter();
		initWholeFilter();
	}

	private void initWholeFilter() {
		filterChina = new FilterChina();
		filterChina.addFilter(new HtmlFilter()).addFilter(new ToUpperFilter());
	}

	public FilterChina getFilterChina() {
		return filterChina;
	}

	public void setFilterChina(FilterChina filterChina) {
		this.filterChina = filterChina;
	}
	

}
